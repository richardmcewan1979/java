package com.richardmcewan;

//copying Tim B walk through on inheritance

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        Fish fish = new Fish("Goldy", 3, 12, 2, 2, 2);
        animal.eat();
        animal.move();

        dog.eat();
        dog.walk();
        dog.run();

        System.out.println("*****");
        dog.move();
        System.out.println("*****");
        dog.move(100);
        System.out.println("****************");
        fish.move(25);

    }
}
