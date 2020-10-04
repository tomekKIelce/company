package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectSexAvgPayment {
    Connector conn = new Connector();
    Scanner read = new Scanner(System.in);
    void  selectSexAvgPayment(){


        try {
            PreparedStatement prsk = conn.con.prepareStatement("SELECT AVG (payment) FROM pracownicy WHERE sex=?");
            prsk.setString(1,"k");
            ResultSet rsk = prsk.executeQuery();
            while (rsk.next()){
                System.out.println("średnia zaroków kobiet: "+rsk.getString(1));
            }
            PreparedStatement prst = conn.con.prepareStatement("SELECT AVG (payment) FROM pracownicy WHERE sex=?");
            prst.setString(1,"m");
            ResultSet rsm = prst.executeQuery();
            while (rsm.next()){
                System.out.println("średnia zaroków facetow: "+rsm.getString(1));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
