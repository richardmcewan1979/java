package com.richardmcewan;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

    }
}

/*
This is the challenge exercise.

So let's type up what the challenge is.

[NOISE] So this is the encapsulation challenge to create a class and

to demonstrate proper encapsulation techniques such

you've learned in the previous video.

The class to create will be called printer, and

it's going to simulate a real computer printer a laser printer.

So some of the fields that should exist in the class, should be one for

the toner level, the percentage of how much toner level is left, the number of

pages that have been printed, and also whether it's a duplex printer.

Now duplex printer is capable of printing on both sides of the paper.

So you'll want to add methods to fill up the toner,

which should fill it up to a maximum of 100% based on the current value.

So if it's only 50% full, you have to figure out a way to make sure that

it doesn't go up beyond 100%, and you need to add another method to simulate printing

a page, which should increase the number of pages printed variable as well.

And you also want to take into account the duplex functionality,

and print out a message if the printer is a duplex printer when it's printing.

Finally, decide on the scope, whether to use constructors or anything

else you think is needed to demonstrate proper encapsulation techniques.
 */