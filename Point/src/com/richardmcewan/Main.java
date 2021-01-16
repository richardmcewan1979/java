package com.richardmcewan;

public class Main {

    public static void main(String[] args) {


        Point moon = new Point(-30, 60);
        Point star = new Point(100,200);

        System.out.println("Distance between moon and star " + moon.distance(star) + " unit lengths.");
        System.out.println("Should be same and correct....");
        System.out.println("Distance between star and moon " + star.distance(moon) + " unit lengths.");

        /*
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        Could introduce a function to round answers.
        For example,
        double value = 191.049731745428;
        value = (double)Math.round(value * 100d) / 100d;
        System.out.println("Check=" + value); 
        */

    }
}



