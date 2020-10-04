package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class IncreasePayment {
    Connector conn = new Connector();
    Scanner read = new Scanner(System.in);
    void increasePayment(){
        try {
            System.out.println("jebac ");
            PreparedStatement prst = conn.con.prepareStatement("UPDATE pracownicy SET payment*0.10");
            prst.execute();
            prst.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
