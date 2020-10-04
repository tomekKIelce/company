package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class DataChangerMenu {
    Scanner read = new Scanner(System.in);
    PersonNameChanger pnc = new PersonNameChanger();
    PersonSurnameChanger psc = new PersonSurnameChanger();
    PersonNumberOfSectionChanger posc = new PersonNumberOfSectionChanger();
    PersonPaymentChanger ppc = new PersonPaymentChanger();
    PersonAgeChanger pac = new PersonAgeChanger();
    PersonNumberOfChildrenChanger pocc = new PersonNumberOfChildrenChanger();
    PersonConditionChanger pcc = new PersonConditionChanger();



    public void dataChangerMenu () throws SQLException, ClassNotFoundException {
        System.out.println("1. zmien imie dla praconwika");
        System.out.println("----------------------------------");
        System.out.println("2. zmien nazwisko praconika");
        System.out.println("----------------------------------");
        System.out.println("3. zmien number sekcji praconika");
        System.out.println("----------------------------------");
        System.out.println("4. zmien plec praconika");
        System.out.println("----------------------------------");
        System.out.println("5. zmien liczbe dzieci praconika");
        System.out.println("----------------------------------");
        System.out.println("6. zmien place praconika");
        System.out.println("----------------------------------");
        System.out.println("7. zmien wiek praconika");
        System.out.println("----------------------------------");
        System.out.println("8. zmien stan cywilny praconika");
        System.out.println("----------------------------------");

        int pickUPFromMenu = read.nextInt();
        switch (pickUPFromMenu) {
            case 1:
                System.out.println("nie da sie zmienic imienia");
              //  pnc.personNameChnager();
                break;
            case 2:
                psc.surnameChanger();
                break;
            case 3:
                posc.personNumberOfSectionChanger();
                break;
            case 4:
                System.out.println("nie da sie zmienic plci cewlu");
                break;
            case 5:pocc.personNumberOfChildrenChanger();
                break;
            case 6:
                ppc.personPaymentChanger();
            case 7:
                pac.personAgeChanger();
            case 8:
                pcc.personConditionChanger();

        }
    }
}
