package com.company;

import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.sql.*;
import java.util.concurrent.Executor;


public class DisplayEmployees  extends Connector{



    public void displayAllEmpolyyesFromDB() {

        try {

            connetToDataBase();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pracownicy");
            while (rs.next()){
                System.out.println(
                                "numer prac: ->"+rs.getInt(1)+
                                " Imie: ->"+rs.getString(2)+
                                " Nazwisko: ->" +rs.getString(3)+
                                " Numer sekcji: ->"+rs.getInt(4)+
                                " Płec: ->"+rs.getString(5)+
                                " Liczba dzieci: ->" +rs.getInt(6)+
                                " Płaca: ->"+rs.getFloat(7)+
                                " Wiek: ->"+rs.getInt(8)+
                                " Stan cywilny: ->"+rs.getBoolean(9)
                );
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("cos poszlo nie tak");
        }

    }
}


