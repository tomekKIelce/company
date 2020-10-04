package com.company;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonNumberOfChildrenChanger {
    DisplayEmployees de = new DisplayEmployees();
    Scanner read = new Scanner(System.in);
    Connector conn = new Connector();
    public void personNumberOfChildrenChanger(){
        try {
            PreparedStatement prst = conn.con.prepareStatement("UPDATE pracownicy SET numberOfChildren=? WHERE idEmployee=?");
            System.out.println("podaj nowa liczbe dzieci");
            int newNumberOfChildren= read.nextInt();
            prst.setInt(1,newNumberOfChildren);

            System.out.println("podaj id pracownika");
            int idEmployee = read.nextInt();
            prst.setInt(2,idEmployee);

            prst.executeUpdate();
            prst.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    de.displayAllEmpolyyesFromDB();

    }
}
