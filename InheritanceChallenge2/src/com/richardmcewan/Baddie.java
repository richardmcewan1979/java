package com.richardmcewan;

public class Baddie extends Ship {

    private int bullets;

    public Baddie(int x, int y, String name, boolean isDead, int bullets) {
        super(x, y, name, isDead);
        this.bullets = bullets;
    }

    private void attack(){
        System.out.println("Baddie.attack() called");
        for(int i=0; i<bullets; i++){
            System.out.println("fire");
        }
    }

    private void evade(int a, int b){
        System.out.println("Death is imminent. Taking evasive action.");
        System.out.println("Get us out of here!");
        attack();
        super.move(a, b);
    }

    public void selfdestruct(){
        System.out.println("Baddie.selfDestruct() called");
    }

    @Override
    public void isDead() {
        System.out.println("Baddie.isDead() called");
        evade(-40,-30);
        System.out.println("It is too late!");
        selfdestruct();
        super.isDead();
    }
}
