package controllers;

import application.CityGuideApp;
import models.City;
import models.Hotel;
import models.Place;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import types.PlaceType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlacesController {
    @FXML
    private ListView<Place> hotelsListView;

    @FXML
    private ListView<Place> restaurantsListView;

    @FXML
    private ListView<Place> touristPlacesListView;

    @FXML
    private ListView<Place> mallsListView;

    @FXML
    private TextArea operatingHoursArea;

    @FXML
    private TextArea transportationMethodsArea;

    @FXML
    private Button backButton;

    @FXML
    private Button addToPlanner;

    @FXML
    private Button viewPlanner;

    @FXML
    private Label operatingHoursLabel;

    private City selectedCity;
    private CityGuideApp cityGuideApp;

    private final List<Place> plannerList = new ArrayList<>();

    public void initialize() {
        backButton.setOnAction(_ -> goBack());
        addToPlanner.setOnAction(_ -> addToPlanner());
        viewPlanner.setOnAction(_ -> viewPlanner());
        operatingHoursLabel.setText("Operating Hours");

        addListViewListeners();

        hotelsListView.getSelectionModel().selectedItemProperty().addListener((_, _, newValue) -> {
            if (newValue instanceof Hotel selectedHotel) {
                showHotelAmenities(selectedHotel);
            }
        });
    }

    private void showHotelAmenities(Hotel selectedHotel) {
        operatingHoursArea.setText(selectedHotel.getAmenitiesAsString());
    }

    public void setSelectedCity(City city) {
        this.selectedCity = city;
        populatePlaces();
    }

    private void populatePlaces() {
        if (selectedCity != null) {
            hotelsListView.getItems().addAll(selectedCity.getPlacesByType(PlaceType.HOTEL));
            restaurantsListView.getItems().addAll(selectedCity.getPlacesByType(PlaceType.RESTAURANT));
            touristPlacesListView.getItems().addAll(selectedCity.getPlacesByType(PlaceType.TOURIST_PLACE));
            mallsListView.getItems().addAll(selectedCity.getPlacesByType(PlaceType.MALL));
        }
    }

    private void addListViewListeners() {
        hotelsListView.getSelectionModel().selectedItemProperty().addListener((_, _, newValue) -> updateTextAreas(newValue));

        restaurantsListView.getSelectionModel().selectedItemProperty().addListener((_, _, newValue) -> updateTextAreas(newValue));

        touristPlacesListView.getSelectionModel().selectedItemProperty().addListener((_, _, newValue) -> updateTextAreas(newValue));

        mallsListView.getSelectionModel().selectedItemProperty().addListener((_, _, newValue) -> updateTextAreas(newValue));
    }

    private void updateTextAreas(Place selectedPlace) {
        if (selectedPlace != null) {
            String operatingHours = selectedPlace.getOperatingHours();

            if (selectedPlace instanceof Hotel) {
                operatingHoursLabel.setText("Amenities");
                String amenities = ((Hotel) selectedPlace).getAmenitiesAsString();
                operatingHoursArea.setText(amenities);
            } else {
                operatingHoursLabel.setText("Operating Hours");
                operatingHoursArea.setText(operatingHours);
            }

            transportationMethodsArea.setText(selectedPlace.getTransportationMethodsAsString());
        } else {
            operatingHoursArea.clear();
            transportationMethodsArea.clear();
        }
    }

    private void addToPlanner() {
        List<Place> selectedPlaces = new ArrayList<>();

        if (hotelsListView.getSelectionModel().getSelectedItem() != null) {
            selectedPlaces.add(hotelsListView.getSelectionModel().getSelectedItem());
        }
        if (restaurantsListView.getSelectionModel().getSelectedItem() != null) {
            selectedPlaces.add(restaurantsListView.getSelectionModel().getSelectedItem());
        }
        if (touristPlacesListView.getSelectionModel().getSelectedItem() != null) {
            selectedPlaces.add(touristPlacesListView.getSelectionModel().getSelectedItem());
        }
        if (mallsListView.getSelectionModel().getSelectedItem() != null) {
            selectedPlaces.add(mallsListView.getSelectionModel().getSelectedItem());
        }

        if (selectedPlaces.isEmpty()) {
            showAlert("No Selection", "Please select a place to add to the planner.");
            return;
        }

        for (Place selectedPlace : selectedPlaces) {
            boolean confirmed = showConfirmationDialog(selectedPlace.getName());
            if (confirmed) {
                if (!isPlaceInPlanner(selectedPlace)) {
                    String visitTime = askForVisitTime(selectedPlace.getName());
                    if (visitTime != null && !visitTime.trim().isEmpty()) {
                        if (cityGuideApp != null) {
                            cityGuideApp.getPlanner().addPlaceWithTime(selectedPlace, visitTime);
                            plannerList.add(selectedPlace);
                            showAlert("Place added to planner!", "You have successfully added " + selectedPlace.getName() + " to your planner at " + visitTime + ".");
                        }
                    }
                } else {
                    showAlert("Already in planner", selectedPlace.getName() + " is already in your planner.");
                }
            }
        }
        clearSelections();
    }

    private boolean isPlaceInPlanner(Place place) {
        return plannerList.stream().anyMatch(p -> p.getName().equals(place.getName()));
    }

    private String askForVisitTime(String placeName) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Visit Time");
        dialog.setHeaderText("Enter the time you'd like to visit " + placeName);
        dialog.setContentText("Visiting time:");

        return dialog.showAndWait().orElse(null);
    }

    private void viewPlanner() {
        if (cityGuideApp != null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/planner-view.fxml"));
                Parent root = loader.load();

                PlannerController plannerController = loader.getController();
                plannerController.setCityGuideApp(cityGuideApp);
                plannerController.setPlannerList();
                cityGuideApp.setPreviousScene(hotelsListView.getScene());

                Stage stage = (Stage) hotelsListView.getScene().getWindow();
                stage.setScene(new Scene(root, 800, 800));
                stage.show();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private boolean showConfirmationDialog(String placeName) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Add to Planner");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to add " + placeName + " to your planner?");

        return alert.showAndWait().filter(buttonType -> buttonType.getButtonData().isDefaultButton()).isPresent();
    }

    public void setCityGuideApp(CityGuideApp app) {
        this.cityGuideApp = app;
    }

    private void clearSelections() {
        hotelsListView.getSelectionModel().clearSelection();
        restaurantsListView.getSelectionModel().clearSelection();
        touristPlacesListView.getSelectionModel().clearSelection();
        mallsListView.getSelectionModel().clearSelection();
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
