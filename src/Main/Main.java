package Main;

import Util.DataBaseCon;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;


public class Main extends Application{


    public static void main(String[] args) {
        DataBaseCon.startConnection();
        //DataBaseCon.checkDateConversion();
        launch(args);
        DataBaseCon.closeConnection();
    }
    /**
     * The start method creates the FXML stage and loads the initial scene (Main Screen).
     *
     * @param primaryStage
     * @throws Exception
     */

    @Override
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("/view/Main_Screen.fxml"));
        primaryStage.setTitle("Main Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

