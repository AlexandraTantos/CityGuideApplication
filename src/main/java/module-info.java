module com.cityguideapp.cityguideapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;


    exports controllers;
    opens controllers to javafx.fxml;
    exports models;
    opens models to javafx.fxml;
    exports application;
    opens application to javafx.fxml;
}