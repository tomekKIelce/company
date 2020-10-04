package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectSexAdventage {
    Connector conn = new Connector();
    Scanner read = new Scanner(System.in);
    void selectSexAdventage(){
        try {

            PreparedStatement prstK = conn.con.prepareStatement("SELECT COUNT(*)  FROM pracownicy WHERE sex ='k' GROUP BY sex ");
            PreparedStatement prstM = conn.con.prepareStatement("SELECT COUNT(*)  FROM pracownicy WHERE sex ='m' GROUP BY sex");


            ResultSet rsk = prstK.executeQuery();
            while (rsk.next()){
                int k =rsk.getInt(1);
                System.out.println("tyle jest facetow: "+k);
            }

            ResultSet rsm = prstM.executeQuery();
            while (rsm.next()){
                int m =rsm.getInt(1);
                System.out.println("tyle jest facetow: "+m);
            }




        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
