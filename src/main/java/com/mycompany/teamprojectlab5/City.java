
package com.mycompany.teamprojectlab5;

import java.util.List;


public class City {
    private String name;
    private List<String> roads;

    public City(String name, List<String> roads) {
        this.name = name;
        this.roads = roads;
    }

    public String print() {
        return "City: " + name + "\n" + "Roads in " + name + ": " + roads;
    }
    
    
    
}
