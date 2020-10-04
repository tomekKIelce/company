package com.company;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonAgeChanger {
    Connector conn = new Connector();
    Scanner read = new Scanner(System.in);
    DisplayEmployees de = new DisplayEmployees();
    public void personAgeChanger(){

        try {
            PreparedStatement prst = conn.con.prepareStatement("UPDATE pracownicy SET age=? WHERE idEmployee=?");
            System.out.println("podaj nowy wiek praconwika");
            int newAge = read.nextInt();
            prst.setInt(1,newAge);

            System.out.println("podaj id pracownika do zmiany");
            int idEmployee = read.nextInt();
            prst.setInt(2,idEmployee);

            prst.executeUpdate();
            prst.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("jakis blad");
        }
de.displayAllEmpolyyesFromDB();

    }
}
