package com.richardmcewan;

public class Player{
    public Player(){

    }
    public void blast(Alien enemy){
        System.out.println("Player blasts an enemy");
        enemy.die();
    }
}