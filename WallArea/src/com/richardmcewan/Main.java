package com.richardmcewan;

/*
There are some subtle but interesting differences with another student's code.
I'm waiting for feedback from the discussion forum on the significance of the other approach.

One is:

the class method
public double getArea(){
return getWidth*getHeight;

and some others I'll report on.

}

and


 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall = new Wall(-1.25,-1.25);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}


/*

TEST EXAMPLE

→ TEST CODE:

1 Wall wall = new Wall(5,4);
2 System.out.println("area= " + wall.getArea());
3
4 wall.setHeight(-1.5);
5 System.out.println("width= " + wall.getWidth());
6 System.out.println("height= " + wall.getHeight());
7 System.out.println("area= " + wall.getArea());

→ OUTPUT:

area= 20.0
width= 5.0
height= 0.0
area= 0.0

 */