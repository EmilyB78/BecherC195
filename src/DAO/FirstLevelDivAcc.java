package DAO;

/* public class FirstLevelDivAcc {

    public static ObservableList<FirstLevelDiv> getAllFirstLevelDiv(){

        ObservableList<FirstLevelDiv> FirstLevelDivlist = FXCollections.observableArrayList();

        try {
            String sql  = "SELECT * from first_level_divisions";

            PreparedStatement ps = DataBaseCon.getConnection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int divisionID = rs.getInt("Division_ID");
                String divisionName = rs.getString("Division");
                int countryId = rs.getInt("Country_ID");
                FirstLevelDiv firstleveldiv = new FirstLevelDiv(divisionID, divisionName, countryId);

                FirstLevelDivlist.add(firstleveldiv);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return FirstLevelDivlist;
    }

}

*/