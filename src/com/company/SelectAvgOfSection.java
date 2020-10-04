package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class SelectAvgOfSection {

    Connector conn = new Connector();
    Scanner read = new Scanner(System.in);
    void selectAvgOfSection(){
        try {
            PreparedStatement prst = conn.con.prepareStatement("SELECT AVG (payment) FROM pracownicy WHERE numberOfSection=?");
            System.out.println("podaj numer sekcji");
            int numberOfCondition = read.nextInt();
            prst.setInt(1,numberOfCondition);
            ResultSet rs = prst.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1));
            }
            prst.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
