package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectPaymentfullMen {

    Connector conn = new Connector();

    void selectPaymentfullMen(){
        try {
            Statement st = conn.con.createStatement();


            PreparedStatement prst = conn.con.prepareStatement("SELECT * FROM pracownicy WHERE sex ='m' ORDER BY payment DESC");
            ResultSet rs = prst.executeQuery();
            while(rs.next()){
                System.out.println("numer prac: ->"+rs.getInt(1)+
                        " Imie: ->"+rs.getString(2)+
                        " Nazwisko: ->" +rs.getString(3)+
                        " Numer sekcji: ->"+rs.getInt(4)+
                        " Płec: ->"+rs.getString(5)+
                        " Liczba dzieci: ->" +rs.getInt(6)+
                        " Płaca: ->"+rs.getFloat(7)+
                        " Wiek: ->"+rs.getInt(8)+
                        " Stan cywilny: ->"+rs.getBoolean(9));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
