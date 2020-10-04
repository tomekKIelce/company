package com.company;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonNumberOfSectionChanger extends Employee {
    Connector conn = new Connector();
    Scanner read = new Scanner(System.in);
    DisplayEmployees de = new DisplayEmployees();


    public void personNumberOfSectionChanger(){
        try {

            PreparedStatement prst = conn.con.prepareStatement("UPDATE pracownicy SET numberOfSection=? WHERE idEmployee=?");
            de.displayAllEmpolyyesFromDB();
            System.out.println("na jaki numer ma zostac zmieniony");
            int newNumberOfSection = read.nextInt();
            prst.setInt(1,newNumberOfSection);

            System.out.println("podaj id pracownika");
            int pickUpNumberOfSection = read.nextInt();
            prst.setInt(2,pickUpNumberOfSection);

            prst.executeUpdate();
            prst.close();

            System.out.println("zmieniles sekcej pracownikowi ");
            de.displayAllEmpolyyesFromDB();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("cos poszlo nie tak");
        }

    }
}
