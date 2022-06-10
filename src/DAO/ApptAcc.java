package DAO;

import Main.DataBaseCon;
import Model.Appointments;
import Model.Countries;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.time.LocalDateTime;

public class ApptAcc {


    public static ObservableList<Appointments> getAllAppointments(){

        ObservableList<Appointments> appointmentslist = FXCollections.observableArrayList();

        try {
            String sql  = "SELECT * from appointments";

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
                appointmentslist.add(A);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return appointmentslist;
    }
    public static int deleteAppointment(int appointmentID, Connection connection) {

        try {
            String sql = "DELETE FROM appointments where Appointment_ID =? ";
            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement(sql);
            ps.setInt(1, appointmentID);
            int result = ps.executeUpdate();
            ps.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return result;
    }

}


