package com.richardmcewan;

/*
Document stuff here
 */

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("holden")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
