package application;

import controllers.CityGuideController;
import models.Planner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CityGuideApp extends Application {
    private Stage primaryStage;
    private final Planner planner;
    private final List<Scene> previousScenes;

    public CityGuideApp() {
        planner = new Planner();
        previousScenes = new ArrayList<>();
    }

    public Planner getPlanner() {
        return this.planner;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        loadMainView();
    }

    public List<Scene> getPreviousScene() {
       return this.previousScenes;
    }

    public void removeLastPreviousScene() {
        this.previousScenes.removeLast();
    }

    public void setPreviousScene(Scene previousScene) {
        this.previousScenes.add(previousScene);
    }

    private void loadMainView() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/hello-view.fxml"));
        Parent root = loader.load();

        Scene mainScene = new Scene(root, 800, 800);
        setupStyles(mainScene);

        CityGuideController controller = loader.getController();
        controller.initialize();
        controller.initializeCities();
        controller.setCityGuideApp(this);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("City Guide");
        primaryStage.show();
    }

    private void setupStyles(Scene scene) {
        URL styles = getClass().getResource("/styles/styles.css");
        if (styles != null) {
            scene.getStylesheets().add(styles.toExternalForm());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
