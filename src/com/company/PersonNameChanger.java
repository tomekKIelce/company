package com.company;




import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class PersonNameChanger extends Connector {
    DisplayEmployees de = new DisplayEmployees();
    Scanner read = new Scanner(System.in);


    public void personNameChnager()  throws SQLException, ClassNotFoundException{
        System.out.println("lista praconiwków:");
        de.displayAllEmpolyyesFromDB();


                PreparedStatement prst = con.prepareStatement("UPDATE pracownicy SET name=? WHERE idEmployee=?");



                System.out.println("podaj nowe imie pracownika: ");
                String nameToChange = read.nextLine();
                prst.setString(1,nameToChange);
        System.out.println("-----------------------------------------");
                System.out.println("podaj id pracownika do zmiany imienia");
                int idEmpdoRemove = read.nextInt();
                prst.setInt(2,idEmpdoRemove);

                prst.executeUpdate();
                prst.close();

                System.out.println("zmieniles imie na :" + nameToChange);
                de.displayAllEmpolyyesFromDB();






        }

    }
