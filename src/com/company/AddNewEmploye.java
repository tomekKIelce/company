package com.company;

import java.sql.*;
import java.util.Scanner;

public class AddNewEmploye extends Connector {
    Scanner read = new Scanner(System.in);
    Employee ea = new Employee();



      public void addNewEmployee() throws SQLException, ClassNotFoundException {

          connetToDataBase();


          PreparedStatement prst = con.prepareStatement("INSERT INTO pracownicy (name,surname,numberOfSection,sex,numberOfChildren,payment,age,conditionOfEmployee) VALUES (?,?,?,?,?,?,?,?)");

          System.out.println("podaj imie nowego pracownika");
          String name = read.nextLine();
          prst.setString(1,name);

          System.out.println("podaj nazwisko nowego pracownika");
          String surname = read.nextLine();
          prst.setString(2,surname);

          System.out.println("podaj numer sekcji nowego pracownika");
          int numberOfSection = read.nextInt();
          prst.setInt(3,numberOfSection);


          System.out.println("podaj plec (m/k) nowego pracownika");
          String sex = read.nextLine();
          prst.setString(4,sex);

          System.out.println("podaj liczbe dzieci nowego pracownika");
          int numberOfChildren = read.nextInt();
          prst.setInt(5,numberOfChildren);

          System.out.println("podaj ile ma zarabiac");
          int payment = read.nextInt();
          prst.setDouble(6,payment);

          System.out.println("podaj wiek");
          int age = read.nextInt();
          prst.setInt(7,age);

          System.out.println("stan cywilny");
          boolean condition = read.nextBoolean();
          prst.setBoolean(8,condition);


          prst.executeUpdate();
          prst.close();

  }

}
