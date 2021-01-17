package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
	
	Shape shape = new Shape(5,7);
        Rectangle rectangle = new Rectangle(40,70);
        Rectangle square = new Rectangle(30,30,30,30);

        System.out.println(shape);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
