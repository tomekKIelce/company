package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AllSex {
    Connector conn = new Connector();


    public void allSex(){
        try {
            Statement st= conn.con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pracownicy");

            while(rs.next()){
                System.out.println(rs.getString(2));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
