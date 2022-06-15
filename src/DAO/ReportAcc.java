/*package DAO;

import Util.DataBaseCon;
import Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ReportAcc {

    public static ObservableList<Reports> getCountries(){

        ObservableList<Reports> reportslist = FXCollections.observableArrayList();

        try {
            String sql  = "SELECT countries.Country, count(*) as countryCount from customers inner join first_level_divisions on customers.Division_ID = first.level.divisions.Division_ID inner join countries on countries.Country_ID where customers.Division_ID = first_level_divisions.Division_ID group by first.level.divisions.Country_ID order by count (*) desc";

            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int appointmentID = rs.getInt("Appointment_ID");
                String appointmentTitle = rs.getString("Title");
                String appointmentDescription = rs.getString("Description");
                String appointmentLocation = rs.getString("Location");
                String appointmentType = rs.getString("Type");
                LocalDateTime start = rs.getTimestamp("Start").toLocalDateTime();
                LocalDateTime end = rs.getTimestamp("End").toLocalDateTime();
                int customerID = rs.getInt("Customer_ID");
                int userID = rs.getInt("User_ID");
                int contactID = rs.getInt("Contact_ID");
                Appointments A = new Appointments(appointmentID, appointmentTitle, appointmentDescription, appointmentLocation, appointmentType, start, end, customerID, userID, contactID);
                reportslist.add(A);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return reportslist;
    }

}

*/