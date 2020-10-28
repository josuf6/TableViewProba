import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Parent taulaUI;

    private Stage stage;

    private TaulaKud taulaKud;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setResizable(false);
        this.pantailaKargatu();
        stage.setScene(new Scene(taulaUI));
        stage.show();
        stage.setTitle("TaulaViewProba");
    }

    private void pantailaKargatu() throws IOException {
        FXMLLoader loaderTaula = new FXMLLoader(getClass().getResource("/Taula.fxml"));
        taulaUI = (Parent) loaderTaula.load();
        taulaKud = loaderTaula.getController();
        taulaKud.setMainApp(this);
    }
}
