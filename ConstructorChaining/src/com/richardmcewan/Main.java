package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle alpha = new Rectangle();
        Rectangle beta = new Rectangle(20, 50);
        Rectangle gamma = new Rectangle(20,40,60,160, "green");

        alpha.getRectangle();
        beta.getRectangle();
        gamma.getRectangle();
    }
}
