package com.company;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonPaymentChanger {
    Connector conn = new Connector();
    DisplayEmployees de = new DisplayEmployees();
    Scanner read = new Scanner(System.in);


    public void personPaymentChanger()
    {
        de.displayAllEmpolyyesFromDB();
                try {
                    PreparedStatement prst = conn.con.prepareStatement("UPDATE pracownicy SET payment =? WHERE idEmployee=?");
                    System.out.println("podaj  mowa kwote ");
                    int newPayment= read.nextInt();
                    prst.setInt(1,newPayment);
                    System.out.println("podaj id pracownika do zmiany");
                    int idEmployee= read.nextInt();
                    prst.setInt(2,idEmployee);
                    prst.executeUpdate();
                    prst.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }




        }
    }

