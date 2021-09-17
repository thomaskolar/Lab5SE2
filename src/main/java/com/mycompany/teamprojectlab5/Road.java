package com.mycompany.teamprojectlab5;

import java.util.Objects;


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

    @Override
    public int hashCode() {
        return Objects.hashCode(this.destination);
    }

    @Override
    public boolean equals(Object obj) { 
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Road other = (Road) obj;
        if (this.miles != other.miles) {
            return false;
        }
        if (!Objects.equals(this.destination, other.destination)) {
            return false;
        }
        return true;
    }
}  