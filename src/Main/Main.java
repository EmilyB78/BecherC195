package Main;

import DAO.DataBaseCountry;
import Main.DataBaseCon;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Stage;

public class Main extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(name "sample.fxml"));
        primaryStage.setTitle ("DataBaseCon");
        primaryStage.setScene(new Scene (root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        DataBaseCon.startConnection();
        //DataBaseCon.checkDateConversion();
        launch(args);
        DataBaseCon.closeConnection();
    }
}

