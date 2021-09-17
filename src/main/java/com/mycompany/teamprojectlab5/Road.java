package com.mycompany.teamprojectlab5;


public class Road {
    private int miles;
    private String destination;

    public Road(int miles, String destination) {
        this.miles = miles;
        this.destination = destination;
    }

    
    public String print() {
        return "Miles: " + miles + " Destination: " + destination;
    }
    
    
}
