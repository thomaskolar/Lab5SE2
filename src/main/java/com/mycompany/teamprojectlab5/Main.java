
package com.mycompany.teamprojectlab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

  

public class Main {
    public static void main(String[] args) {
        //creating a hashSet
        Set<City> city = new HashSet<>();
        try {
            //Create file class, text file as input
            File myObj = new File("citiesInfo.txt");
            Scanner myReader = new Scanner(myObj);
            //read each line of text file
            while(myReader.hasNextLine()) {
                //stores the current line
                String data = myReader.nextLine();
                City c = new City(data,Arrays.asList("roads"));
                //prints the hashSet
                System.out.println(c.print());
                c.writer();
            }
            myReader.close();
            //If file isn't found it exits
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException ee) {
            System.out.println("Can't write.");
            ee.printStackTrace();
        }
    }
}

