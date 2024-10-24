package controllers;

import application.CityGuideApp;
import interfaces.IPlace;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.Map;

public class PlannerController {

    @FXML
    public ImageView banner;

    @FXML
    private ListView<String> plannerListView;

    @FXML
    private Button removePlaceButton;

    @FXML
    private Button backButton;

    private CityGuideApp cityGuideApp;

    public void initialize() {
        URL imageUrl = getClass().getResource("/images/banner.jpg");
        if (imageUrl != null) {
            Image image = new Image(imageUrl.toString());
            banner.setImage(image);
        }
        populatePlanner();

        backButton.setOnAction(_ -> goBack());
        removePlaceButton.setOnAction(_ -> removeSelectedPlace());
    }

    public void setCityGuideApp(CityGuideApp app) {
        this.cityGuideApp = app;
    }

    public void setPlannerList() {
        populatePlanner();
    }

    private void populatePlanner() {
        plannerListView.getItems().clear();

        if (cityGuideApp != null) {
            Map<IPlace, String> placesWithTimes = cityGuideApp.getPlanner().getPlacesWithTimes();

            for (Map.Entry<IPlace, String> entry : placesWithTimes.entrySet()) {
                IPlace place = entry.getKey();
                String visitTime = entry.getValue();

                String displayText = place.getName() + " - Visiting at: " + visitTime;

                plannerListView.getItems().add(displayText);
            }
        }
    }

    private void removeSelectedPlace() {
        String selectedText = plannerListView.getSelectionModel().getSelectedItem();

        if (selectedText == null) {
            showAlert();
            return;
        }

        String placeName = selectedText.split(" - ")[0];
        boolean confirmed = showConfirmationDialog(placeName);

        if (confirmed) {
            IPlace placeToRemove = findPlaceByName(placeName);
            if (placeToRemove != null) {
                cityGuideApp.getPlanner().removePlace(placeToRemove);
                populatePlanner();
            }
        }
    }

    private IPlace findPlaceByName(String placeName) {
        Map<IPlace, String> placesWithTimes = cityGuideApp.getPlanner().getPlacesWithTimes();
        for (IPlace place : placesWithTimes.keySet()) {
            if (place.getName().equals(placeName)) {
                return place;
            }
        }
        return null;
    }

    private boolean showConfirmationDialog(String placeName) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Remove Place");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to remove " + placeName + " from the planner?");
        return alert.showAndWait().filter(buttonType -> buttonType.getButtonData().isDefaultButton()).isPresent();
    }

    private void showAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("No Selection");
        alert.setHeaderText(null);
        alert.setContentText("Please select a place to remove from the planner.");
        alert.showAndWait();
    }

    private void goBack() {
        if (cityGuideApp != null && cityGuideApp.getPreviousScene() != null) {
            Stage stage = (Stage) backButton.getScene().getWindow();
            List<Scene> previousScenes = cityGuideApp.getPreviousScene();
            Scene previousScene = previousScenes.getLast();
            cityGuideApp.removeLastPreviousScene();
            stage.setScene(previousScene);

        }
    }
}
