package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectPaymentOn {
    Connector conn = new Connector();
    Scanner read = new Scanner(System.in);
    DisplayEmployees de = new DisplayEmployees();

    void selectPaymentOn()


    {
        try {
            PreparedStatement prst = conn.con.prepareStatement("SELECT * FROM pracownicy WHERE payment>?");
            System.out.println("podaj wyplate ktora Cie intresuje");
            int payment = read.nextInt();
            prst.setInt(1,payment);
            ResultSet rs= prst.executeQuery();
            while (rs.next()){
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

            prst.close();

//            Statement st = conn.con.createStatement();
//            ResultSet rs= st.executeQuery("SELECT name FROM pracownicy WHERE payment>400");
//            while (rs.next()){
//                System.out.println(rs.getInt(1));
//            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
