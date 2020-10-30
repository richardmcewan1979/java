/*
This file is junk.

I got frustrated with a challenge and resorted to string/int conversions as a work around. 

Aside from a bad approach, what made it worse was hopping all over the place rather than sytematically build/debug/test. 

A painful lesson. 

Here is tuor feedback for my reference:

I would not have thought to use String.valueOf since it hasn't been taught at this point in the course and since using any String function isn't preferred when handling integer calculations.

That said, yes, it is weird that you code works on IDE (sort of...I'll point out the errors) but gives that weird null for input string error.  So here's the reason your code doesn't work in the Udemy online solution checker.

1.  Your reverse method uses String.valueOf.  I'm not sure why it doesn't affect getDigitCount method, but it's definitely the culprit.  I replaced it with a simple method using while loop that Tim demonstrated and it gets rid of the weird null for input string error.

2.  You are missing an else if (number == 0) statement to handle if number is just 0.

3.  You need to put a space after each numbered word in the switch case so that they don't merge all together.

I noticed several minor issues worth mentioning, but they don't affect the code function...just good to know.

1.  You used the variable int numberToWord in the method numberToWord().  Even though the program knows which is which, it's not preferred to name variables the same name and lower case camel case as a method...since you should be writing code for human's to read.

2.  In the switch/case you have a default that adds the string result += "Debug: Launch default value" and a return.  Although the entire default is unnecessary, it is good practice to have a default even though it is theoretically impossible to reach this code.  However, since it's the last statement, you don't need a return to prevent the program from reading past the final statement.  Plus, the use of result += ""; is preferred although you technically can put anything you want in this string.

3.  For getDigitCount, you used String.valueOf(number).length() which works and didn't give any error.  But a more straight-forward approach that was taught in the course and much easier to read is using a do while loop that increments count for each loop.  I only mention it because the second most important point in code writing after correctness is clarity...and the loop is much easier to read and understand.  I suspect that some of your headache is also caused from the readability.

4.  In your reverse method, you use flag as a boolean.  Java naming convention would be to use a meaningful name to the flag using "is" something, so maybe isNegative since you are handling the number by multiplying by -1.

Anyhow, here is the refactored code that will pass the Udemy online solution checker.

Better refactor code offered by Eddie the tutor:

*/

public class NumberToWords {
 
    public static void numberToWords(int number) {
 
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
 
        int count = getDigitCount(number);
        number = reverse(number);
 
        while (count > 0) {
            count --;
            switch (number % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
            }
            number /= 10;
        }
    }
 
    public static int reverse(int number) {
        int reverse = 0;
 
        while (number != 0) {
            reverse = (reverse * 10) + number % 10;
            number /= 10;
        }
        return reverse;
    }
 
    public static int getDigitCount(int number) {
        int count = 0;
 
        if (number < 0) return -1;
        if (number == 0) count++;
 
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
