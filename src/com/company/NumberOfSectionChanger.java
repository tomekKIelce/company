package com.company;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NumberOfSectionChanger {
    Connector conn = new Connector();
    DisplayEmployees de = new DisplayEmployees();
    public void numberOfSectionChanger(){
        de.displayAllEmpolyyesFromDB();
        try {
            PreparedStatement prst = conn.con.prepareStatement("UPDATE pracownicy WHERE numberOf");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
