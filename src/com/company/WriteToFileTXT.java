package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileTXT {

public void createFile(){
    File file = new File("pracownicy.txt");
    try {
        file.createNewFile();
    } catch (IOException e) {
        e.printStackTrace();
    }
    try {
        Scanner read = new Scanner(file);
        while(read.hasNext()){
            System.out.println(read.nextLine());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();

    }


}
}
