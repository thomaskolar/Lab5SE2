
package com.mycompany.teamprojectlab5;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;


public class City {
    private String name;
    private List<String> roads;
    
    HashSet<String> city = new HashSet<String>();
    
    public City(String name, List<String> roads) {
        this.name = name;
        this.roads = roads;
    }

    public String print() {
        return "City: " + name + "\n" + "Roads in " + name + ": " + roads;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roads);
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
        final City other = (City) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        return true;
    } 
}  