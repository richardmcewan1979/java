package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isALien = false;

        //this is confusing and bad practice use a code block
        if (isALien == true) //do NOT put semi-colon
            //will not be printed
            System.out.println("it is not an alien");
        //will be printed
        System.out.println("and I am scared of aliens");

        if (isALien == true) {
            //skipped first
            System.out.println("it is not an alien");
            System.out.println("and I am scared of aliens");
        }

        if (isALien == false) {
            System.out.println("and now it is not an alien");
            System.out.println("and now I am scared of aliens");
        }

        if (isALien == true) {
            System.out.println("it is not an alien");
        }
        else {  System.out.println("with else...I am scared of aliens");
        }

        int topScore = 80;
        if (topScore != 100) {
            System.out.println("\n You have not got the highscore!");
        }

        if (topScore > 100) {
            System.out.println("\n You have got the highscore!");
        }

        if (topScore >= 100) {
            System.out.println("\n You have got at least the highscore!");
        //note >= or <=
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("greater than top score and less than 100");
        }

        //clearer
        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("Either or both conditions are true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("isCar true");
        }
        else {
            System.out.println("isCar false");
        }

        if (isCar == true) {
            System.out.println("isCar true");
        }
        else {
            System.out.println("isCar false");
        }

        if (!isCar) {
            System.out.println("isCar true");
        }
        else {
            System.out.println("isCar not false");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        boolean statementA = true;
        boolean statementB = statementA ? true : false;
        //more interesting to reverse
        //boolean statementB = statementA ? false : true;
        if (statementA == true) {
            System.out.println("T Statement A " + statementA + "  statementB " + statementB);
        } else {
            System.out.println("F Statement A " + statementA + "  statementB " + statementB);
        }

        int ageOfClient = 19;
        boolean isEighteenOrOver = ageOfClient >= 18 ? true: false;
        System.out.println("isEighteenOverTwenty: " + isEighteenOrOver);

        //task
        
        double myFirstValue = 20d;
        double mySecondValue = 80d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100;
        System.out.println("MyValuesTotal: " + myValuesTotal);
        double theRemainder = myValuesTotal % 7d;
        boolean isNotRemainder = theRemainder == 0 ? true: false;

        if (isNotRemainder == true){
            //as a debug check print theRemainder
            System.out.println("Remainder 0:  " + theRemainder);
        } else {
            System.out.println("The remainder is: " + theRemainder);
        }
    }
}
