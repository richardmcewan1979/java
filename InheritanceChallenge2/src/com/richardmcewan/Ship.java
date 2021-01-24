package com.richardmcewan;

public class Ship {

    private int x;
    private int y;
    private String name;
    private boolean isDead;

    public void getName(){
        System.out.println("Ship.getName() called");
        System.out.println("Name is: " + this.name);
    }
    public Ship(int x, int y, String name, boolean isDead) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.isDead = isDead;
    }

    public void isDead(){
        this.isDead = true;
        System.out.println("Ship.isDead() called. Ship is dead");
    }

    public void move(int a, int b){
         this.x = x + a;
         this.y = y + b;
        System.out.println("Ship.move() called. \n New (x, y)= " + x + ", " + y);
    }


}
