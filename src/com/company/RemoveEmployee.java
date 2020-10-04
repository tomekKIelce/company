package com.company;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RemoveEmployee extends Connector{
    DisplayEmployees de = new DisplayEmployees();
    Scanner read = new Scanner(System.in);
    //Connector conn = new Connector();



    public void removeEmployee(){
        de.displayAllEmpolyyesFromDB();
        try {

            PreparedStatement prst = con.prepareStatement("DELETE from PRACOWNICY WHERE idEmployee=?");
            System.out.println("podaj idPracowniaka do susuniecia");
            int a = read.nextInt();
            prst.setInt(1,a);
            prst.execute();
            prst.close();



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }



}
