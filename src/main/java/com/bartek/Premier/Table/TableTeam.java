package com.bartek.Premier.Table;

import java.sql.Connection;
import java.sql.SQLException;

public class TableTeam {
    public static void Teams(Connection con) throws SQLException {
        String query = "Select*From Teams Order By points Desc";


    }

}
