/*package controller;


import DAO.ApptAcc;
import DAO.ReportAcc;
import Model.Appointments;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Appointments;
import model.Contacts;
import model.Countries;
import model.Customers;
import model.FirstLevelDiv;
import model.Reports;
import model.User;

import java.io.IOException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.ResourceBundle;

public class ReportsController implements Initializable {

    Stage stage;
    Parent scene;

    /**
     * Table view for the reports.
     */
    /*@FXML
    private TableView<Appointments> AppointmentsTableView;

    /**
     * The Appointment ID column for the Appointments table.
     */
/*  @FXML
    private TableColumn<Appointments, Integer> ApptIdCol; {
    }

    @FXML
    private TableColumn<Appointments, String> TitleCol; {
    }

    @FXML
    private TableColumn<Appointments, String> DescriptCol; {
    }

    @FXML
    private TableColumn<Appointments, String> LocCol; {

    }

    @FXML
    private TableColumn<Appointments, String> ContactCol; {

    }

    @FXML
    private TableColumn<Appointments, String> AppointTypeCol; {

    }

    @FXML
    private TableColumn<Appointments, Timestamp> StartDateTimeCol; {

    }

    @FXML
    private TableColumn<Appointments, Timestamp> EndDateTimeCol; {

    }
    @FXML
    private TableColumn<Appointments, Integer> CustIdCol; {

    }
    @FXML
    private TableColumn<Appointments, Timestamp> UserIdCol; {      }

    @FXML
    void onActionMonthly(ActionEvent event) throws IOException{
            if(Monthly.isSelected()){
@Override
public void initialize(URL url,ResourceBundle rb){

        ObservableList<Appointments> aList=FXCollections.observableArrayList();

        ResultSet rs=ReportAcc();
        ApptIdCol.setCellValueFactory(cellData->{
        return cellData.getValue().getAppointmentID();
        });
        TitleCol.setCellValueFactory(cellData->{
        return cellData.getValue().getTitle();
        });
        DescriptCol.setCellValueFactory(cellData->{
        return cellData.getValue().getAppointmentDescription();
        });
        LocCol.setCellValueFactory(cellData->{
        return cellData.getValue().getAppointmentLocation();
        });
        ContactCol.setCellValueFactory(cellData->{
        return cellData.getValue().getContactID();
        });
        AppointTypeCol.setCellValueFactory(cellData->{
        return cellData.getValue().getAppointmentType();
        });
        StartDateTimeCol.setCellValueFactory(cellData->{
        return cellData.getValue().getStart();
        });
        EndDateTimeCol.setCellValueFactory(cellData->{
        return cellData.getValue().getEnd();
        });
        CustIdCol.setCellValueFactory(cellData->{
        return cellData.getValue().getCustomerID();
        });
        UserIdCol.setCellValueFactory(cellData->{
        return cellData.getValue().getUserID();
        });

        }else if(Weekly.isSelected()){

        }
        }


        }


}
*/

