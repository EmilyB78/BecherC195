package DAO;

import Main.DataBaseCon;
import Model.Countries;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class DataBaseCountry {

    public static ObservableList<Countries> getAllCountries(){

        ObservableList<Countries> clist = FXCollections.observableArrayList();

        try {
            String sql  = "SELECT * from countries";

            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int countryId = rs.getInt("Country_ID");
                String countryName = rs.getString("Country");
                Countries C = new Countries (countryId, countryName);
                clist.add(C);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return clist;
    }

    public static void CheckDateConversion(){
        System.out.println("Create Date Test");
        String sql = "select Create_Date from countries";
        try {
            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Timestamp ts = rs.getTimestamp("Create_Date");
                System.out.println("CD: " + ts.toLocalDateTime().toString());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
