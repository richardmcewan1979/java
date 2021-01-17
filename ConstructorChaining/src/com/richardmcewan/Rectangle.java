package com.richardmcewan;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    private String color;

    public Rectangle(){
        this(0,0);
        this.color = "red";
    }

    public Rectangle(int width, int height) {
        this(0,0,width, height, "blue");
    }

    public Rectangle(int x, int y, int width, int height, String color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void getRectangle(){
        System.out.println("Rectangle" + " x=" + this.x + " y=" + this.y
            + " width=" + this.width + " height=" + this.height + " color= " + this.color);
    }
}
