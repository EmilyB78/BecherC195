package Main;

import DAO.DataBaseCountry;
import Main.DataBaseCon;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class Main extends Application{


    public static void main(String[] args) {
        DataBaseCon.startConnection();
        //DataBaseCon.checkDateConversion();
        launch(args);
        DataBaseCon.closeConnection();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource( "sample.fxml"));
            primaryStage.setTitle ("DataBaseCon");
            primaryStage.setScene(new Scene (root));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

