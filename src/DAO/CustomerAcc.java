package DAO;

import Main.DataBaseCon;
import Model.Countries;
import Model.Customers;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class CustomerAcc {

    public static ObservableList<Customers> getAllCustomers(){

        ObservableList<Customers> customerslist = FXCollections.observableArrayList();

        try {
            String sql  = "SELECT customers.Customer_ID, customer.Customer_Name, customer.Address, customers.Postal_Code, customers.Phone, customers.Division_ID, first_level_divisions.Division from customers INNER JOIN first_level_divisions ON customers.Division_ID = first_level_divisions.Division_ID";

            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int customerID = rs.getInt("Customer_ID");
                String customerName = rs.getString("Customer_Name");
                String customerAddress = rs.getString("Address");
                String customerPostalCode = rs.getString("Postal_Code");
                String customerPhone = rs.getString("Phone");
                int divisionID = rs.getInt("Division_ID");
                String divisionName = rs.getString("Division");
                Customers customers = new Customers(customerID, customerName, customerAddress, customerPostalCode, customerPhone, divisionID, divisionName);

                customerslist.add(customers);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return customerslist;
    }

}



