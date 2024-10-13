package com.cityguideapp.cityguideapplication;

import classes.City;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.util.Callback;

import java.util.List;

public class CityGuideController {
    @FXML
    private ListView<City> cityListView;

    @FXML
    private Button showInfoButton;

    @FXML
    private TextArea infoArea;

    public void initializeCities() {
        List<City> cities = MockData.initializeCities(); // Your method to initialize the cities list

        cityListView.setCellFactory(new Callback<>() {
            @Override
            public ListCell<City> call(ListView<City> param) {
                return new ListCell<>() {
                    @Override
                    protected void updateItem(City city, boolean empty) {
                        super.updateItem(city, empty);
                        if (empty || city == null) {
                            setText(null);
                        } else {
                            setText(city.getName()); // Display city name only
                        }
                    }
                };
            }
        });

        // Populate the ListView with city objects
        cityListView.getItems().addAll(cities);

        // Set action for the show info button
        showInfoButton.setOnAction(_ -> {
            City selectedCity = cityListView.getSelectionModel().getSelectedItem();
            if (selectedCity != null) {
                infoArea.setText(selectedCity.getName() + " - " + selectedCity.getDescription());
            } else {
                infoArea.setText("Please select a city.");
            }
        });
    }
}