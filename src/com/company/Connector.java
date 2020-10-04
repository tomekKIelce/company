package com.company;

import java.sql.*;

public class Connector  {
    public Connection con;

    {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firma", "root", "");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void connetToDataBase() throws ClassNotFoundException, SQLException {



    }
}
