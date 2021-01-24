package com.richardmcewan;

public class Boss extends Baddie{
    private int megaBombs;

    public Boss(int x, int y, String name, boolean isDead, int bullets, int megaBombs) {
        super(x, y, name, isDead, bullets);
        this.megaBombs = megaBombs;
    }

    private void circle(){
        System.out.println("Boss.circle() called");
    }

    private void flameOut(){
        System.out.println("Boss.flameOut() called.");
    }

    @Override
    public void move(int a, int b) {
        circle();
        this.megaBombs -= 1;
        if (megaBombs > 0) {
            System.out.println("Boss deploy megaBomb weapon");
            for(int i=0; i < megaBombs; i++){
                System.out.println("boom, boom, BOOM!");
            }
        }
        else {
            System.out.println("no megaBombs left!");
        }
        super.move(a, b);
    }


    @Override
    public void isDead() {
        flameOut();
        System.out.println("Self-destruct in 3 seconds!!!!");
        super.isDead();
    }
}
