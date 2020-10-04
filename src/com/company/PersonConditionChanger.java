package com.company;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonConditionChanger {
    DisplayEmployees de = new DisplayEmployees();
    Connector conn = new Connector();
    Scanner read = new Scanner(System.in);
    public void personConditionChanger(){
        try {

            PreparedStatement prst = conn.con.prepareStatement("UPDATE pracownicy SET conditionOfEmployee=? WHERE  idEmployee=?");
            System.out.println("zonaty = true, rozwiedzieony/kawaler = false");
            boolean changeCondtion = read.nextBoolean();
            prst.setBoolean(1,changeCondtion);

            System.out.println("podaj id pracownika do zmiany");
            int idEmployee= read.nextInt();
            prst.setInt(2,idEmployee);

            prst.executeUpdate();
            prst.close();



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
de.displayAllEmpolyyesFromDB();
    }
}
