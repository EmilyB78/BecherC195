package DAO;

import Main.DataBaseCon;
import Model.Countries;
import Model.Customers;
import Model.FirstLevelDiv;
import Model.Reports;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ReportAcc {

    public static ObservableList<Reports> getCountries(){

        ObservableList<Reports> reportslist = FXCollections.observableArrayList();

        try {
            String sql  = "SELECT countries.Country, count(*) as countryCount from customers inner join first_level_divisions on customers.Division_ID = first.level.divisions.Division_ID inner join countries on countries.Country_ID where customers.Division_ID = first_level_divisions.Division_ID group by first.level.divisions.Country_ID order by count (*) desc";

            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String countryName = rs.getString("Country");
                int countryCount = rs.getInt("countryCount");
                Reports reports = new Reports (countryName, countryCount);


                reportslist.add(reports);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return reportslist;
    }

}

