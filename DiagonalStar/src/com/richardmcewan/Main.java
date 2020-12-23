package com.richardmcewan;

/*
Write a method named printSquareStar with one parameter of type int named number.

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).


EXAMPLE INPUT/OUTPUT:

EXAMPLE 1

printSquareStar(5); should print the following:

→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

*****
** **
* * *
** **
*****


Explanation:

*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars


EXAMPLE 2

printSquareStar(8); should print the following:

********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********


The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):

* In the first or last row

* In the first or last column

* When the row number equals the column number

* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)


HINT: Use a nested loop (a loop inside of a loop).

HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" "); prints a space and does not "move" to another line.

HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .

NOTE: The method printSquareStar should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 */

/*
Example the bottom left to top right diagonal
number=8
first and last count?
row 1, col 8
row 2, col 7
row 3, col 6
row 4, col 5
row 5, col 4
row 6, col 3
row 7, col 2
row 8, col 8
note row + col = 9
Note generalised that is sum=number+1
set condition to exclude first and last

 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        printSquareStar(8);

    }

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }
        else {

        for( int row =1; row < number+1; row++){
            for (int column = 1; column < number+1; column ++){
            if (column == number){
                    System.out.print("*");
                    System.out.println();
            }
            else if (row == 1 || row == number){
                System.out.print("*");
            }
            else if (column == 1){
                System.out.print("*");
            }
            else if (row == column){
                System.out.print("*");
            }

            else if (row<number && row+column ==number+1){
                System.out.print("*");
            }

            else {
                System.out.print(" ");
            }
            }
        }

        }
    }
    //end of main curly
}


//a nicer solution

/*
public static void printSquareStar(int number) {
    if (number < 5) {
        System.out.print("Invalid Value");
    } else {
        for (int row=1; row<=number; row++) {
            for (int column=1; column<=number; column++) {
                if ((row == 1) || (row == number) || (column == 1) || (column == number) ||
                        (row == column) || (column == number - row + 1)) {
                    System.out.print("*");
                } else {
                System.out.print(" ");

                }
            }
            System.out.println();

        }

    }
}
 */