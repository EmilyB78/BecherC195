package DAO;

import Main.DataBaseCon;
import Model.Contacts;
import Model.Countries;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**public class ContactAcc {

    public static ObservableList<Contacts> getAllContacts(){

        ObservableList<Contacts> contactslist = FXCollections.observableArrayList();

        try {
            String sql  = "SELECT * from contracts";

            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int contactId = rs.getInt("Contact_ID");
                String contactName = rs.getString("Contact_Name");
                String contactEmail = rs.getString("Contact_Email");
                Contacts contacts = new Countries (contactId, contactName, contactEmail);
                contactslist.add(contacts);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return contactslist;
    }

    public static String findContactID(String contactID){

        try {
            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement("Select * FROM contacts WHERE Contact_Name = ?");
            ps.setString(1, contactID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                contactID = rs.getString("Contact_ID");

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contactID;
    }
}

*/

