package com.richardmcewan;

/*
This is challenge is to experiment with inheritance.

The story doesn't make sense :$

*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ship mother = new Ship(200,200, "Ship", false);
        Baddie baddie= new Baddie(100,150, "Baddie", false, 5);
        Boss boss = new Boss(50,50, "Boss",
                false, 3, 5);

        System.out.println("SHIP*************");
        mother.getName();
        mother.move(20,30);
        mother.isDead();
        System.out.println("SHIP*************");

        System.out.println("\nBaddie***********");
        baddie.getName();
        baddie.move(10,10);
        baddie.isDead();
        System.out.println("Baddie***********");

        System.out.println("\n Boss************");
        boss.getName();
        boss.move(40,35);
        boss.isDead();
        System.out.println("Boss****************");

    }


}
