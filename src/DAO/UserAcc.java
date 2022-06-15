package DAO;

import Util.DataBaseCon;
import model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.*;

public class UserAcc {
    public static int validateUser(String userName, String userPassword ){

        try {
            String sql = "SELECT * FROM users WHERE user_name = '" + userName + "' AND password = '" + userPassword + "'";
            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            if (rs.getString("User_Name").equals(userName)) {
                if (rs.getString("Password").equals(userPassword)) {
                    return rs.getInt("User_ID");
                }
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public static ObservableList<User> getAllUsers(){
        ObservableList<User> ulist = FXCollections.observableArrayList();
        try {
            String sql  = "SELECT * from users";
            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int userId = rs.getInt("User_ID");
                String userName = rs.getString("User_Name");
                String userPassword = rs.getString("Password");
                User U = new User (userId, userName, userPassword);
                ulist.add(U);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ulist;
    }
}





