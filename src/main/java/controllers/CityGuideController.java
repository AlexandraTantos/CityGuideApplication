package controllers;

import application.CityGuideApp;
import models.MockData;
import models.City;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityGuideController {
    @FXML
    private ChoiceBox<City> cityChoiceBox;

    @FXML
    private Button showInfoButton;

    @FXML
    private Label infoArea;

    @FXML
    private ImageView carouselImageView;

    @FXML
    private Button previousButton;

    @FXML
    private Button nextButton;

    @FXML
    private VBox infoContainer;

    @FXML
    private Button viewPlacesButton;

    private int currentImageIndex = 0;
    private Image[] images;

    private CityGuideApp cityGuideApp;

    private final Map<String, Image[]> cityImagesMap = new HashMap<>();

    public void initialize() {
        loadImages();

        showInfoButton.setOnAction(_ -> showCityInfo());

        previousButton.setOnAction(_ -> showPreviousImage());

        nextButton.setOnAction(_ -> showNextImage());

        viewPlacesButton.setOnAction(_ -> viewPlaces());
    }

    private void loadImages() {
        String[] newYorkImages = {"new-york.jpg", "new-york1.jpg", "new-york2.jpg", "new-york3.jpg", "new-york4.jpg", "new-york5.jpg"};
        String[] tokyoImages = {"tokyo.jpg", "tokyo1.jpg","tokyo2.jpeg", "tokyo3.jpg", "tokyo4.jpeg"};
        String[] londonImages = {"london1.jpg", "london2.jpeg", "london3.jpeg", "london4.jpg","london.jpeg"};
        String[] parisImages = {"paris.jpg", "paris1.jpeg", "paris2.jpg"};
        String[] romeImages = {"rome.jpg", "rome1.jpg", "rome2.jpeg", "rome3.jpg"};


        cityImagesMap.put("New York", loadCityImages(newYorkImages));
        cityImagesMap.put("Tokyo", loadCityImages(tokyoImages));
        cityImagesMap.put("London", loadCityImages(londonImages));
        cityImagesMap.put("Paris", loadCityImages(parisImages));
        cityImagesMap.put("Rome", loadCityImages(romeImages));
    }

    private Image[] loadCityImages(String[] imageNames) {
        Image[] images = new Image[imageNames.length];

        for (int i = 0; i < imageNames.length; i++) {
            InputStream inputStream = getClass().getResourceAsStream("/images/" + imageNames[i]);
            if (inputStream == null) {
                System.err.println("Image not found: " + imageNames[i]);
            } else {
                images[i] = new Image(inputStream);
            }
        }
        return images;
    }

    private void showCityInfo() {
        City selectedCity = cityChoiceBox.getSelectionModel().getSelectedItem();
        if (selectedCity != null) {
            infoArea.setText(selectedCity.getDescription());
            currentImageIndex = 0;
            images = cityImagesMap.get(selectedCity.getName());
            if (images != null && images.length > 0) {
                carouselImageView.setImage(images[currentImageIndex]);
                infoContainer.setVisible(true);
            }
        } else {
            showAlert("No City Selected", "Please select a city from the list.");
        }
    }

    private void showPreviousImage() {
        if (images != null && images.length > 0) {
            currentImageIndex = (currentImageIndex - 1 + images.length) % images.length;
            carouselImageView.setImage(images[currentImageIndex]);
        }
    }

    private void showNextImage() {
        if (images != null && images.length > 0) {
            currentImageIndex = (currentImageIndex + 1) % images.length;
            carouselImageView.setImage(images[currentImageIndex]);
        }
    }

    public void setCityGuideApp(CityGuideApp cityGuideApp) {
        this.cityGuideApp = cityGuideApp;
    }

    public void initializeCities() {
        List<City> cities = MockData.initializeCities();

        cityChoiceBox.setConverter(new StringConverter<>() {
            @Override
            public String toString(City city) {
                return city != null ? city.getName() : "";
            }

            @Override
            public City fromString(String string) {
                return null;
            }
        });

        cityChoiceBox.getItems().addAll(cities);
    }

    private void viewPlaces() {
        City selectedCity = cityChoiceBox.getSelectionModel().getSelectedItem();
        if (selectedCity == null) {
            showAlert("No City Selected", "Please select a city from the list.");
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/places-view.fxml"));
                Parent root = loader.load();

                PlacesController placesController = loader.getController();
                placesController.setSelectedCity(selectedCity);


                placesController.setCityGuideApp(cityGuideApp);

                cityGuideApp.setPreviousScene(cityChoiceBox.getScene());

                Stage stage = (Stage) cityChoiceBox.getScene().getWindow();
                stage.setScene(new Scene(root, 800, 800));
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
