
package com.mycompany.teamprojectlab5;

import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        City FortWorth = new City("Fort Worth",Arrays.asList("Washington St","US-377","I-20"));
        System.out.println(FortWorth.print());
        Road WashingtonSt = new Road(2,"377");
        Road ThreeSeventySeven = new Road(54,"I-20");
        Road I20 = new Road(10,"Fort Worth");
        System.out.println(WashingtonSt.print());
        System.out.println(ThreeSeventySeven.print());
        System.out.println(I20.print());
    }
}
