package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {
    DisplayEmployees de = new DisplayEmployees();
    AddNewEmploye addNew = new AddNewEmploye();
    RemoveEmployee re = new RemoveEmployee();
    DataChangerMenu dcm = new DataChangerMenu();



    public void menu() throws SQLException, ClassNotFoundException {
            Scanner read= new Scanner(System.in);
        System.out.println("----------------------------------");
            System.out.println("Witaj w menu glwonym cochcesz zrobic:");
        System.out.println("----------------------------------");
            System.out.println("1. wypisz pracownikow");
        System.out.println("----------------------------------");
        System.out.println("2. dodaj pracownika");
        System.out.println("----------------------------------");
            System.out.println("3. eksport pracownikow do txt");
        System.out.println("----------------------------------");
            System.out.println("4. usun pracownika");
        System.out.println("----------------------------------");
            System.out.println("5. edytuj pracownika");
        System.out.println("----------------------------------");
        System.out.println("6. płaca praconika nie mneijsza niz");
        System.out.println("----------------------------------");


           int a = read.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Lista pracownikow");
                    de.displayAllEmpolyyesFromDB();

                    break;
                case 2:

                    addNew.addNewEmployee();
                    break;
                case 3:
                    System.out.println("funkcja niedostepna");
                    break;
                case 4:

                    re.removeEmployee();
                    System.out.println("usunoles");
                    break;

                case 5:
                    dcm.dataChangerMenu();
                    break;



            }


        }
    }
