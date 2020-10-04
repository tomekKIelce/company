package com.company;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class PersonSurnameChanger {
    Connector conn = new Connector();
    Scanner read = new Scanner(System.in);
    DisplayEmployees de = new DisplayEmployees();


    public void surnameChanger() {


        System.out.println("wybierz cos:" +
                "  1. kobieta" +
                "  2. facet (facet nie moze zmienic nazwiska");
        int pickUp =read.nextInt();
        if (pickUp == 1) {

            try {
                de.displayAllEmpolyyesFromDB();
                PreparedStatement prst = conn.con.prepareStatement("UPDATE pracownicy SET surname=? WHERE idEmployee = ?");
                System.out.println("jak jestes facetem to imienia nie zmienisz");
                String a;
                System.out.println("podaj nazwisko ktore chcesz zmienic");
                String surnameChnager = read.nextLine();


                prst.setString(1, surnameChnager);

                System.out.println("podaj id praconiwka");
                int idEmployee = read.nextInt();
                prst.setInt(2, idEmployee);
                prst.execute();
                prst.close();

                de.displayAllEmpolyyesFromDB();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }else System.out.println("wybrales 2. wiec faceta facet nie moze zmienic nazwiska");
    }
    }

