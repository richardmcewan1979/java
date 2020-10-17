package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //note single quotes
        //two bytes or 16bits as uses Unicode
        //unicode-table.com
        char myChar = 'D';
        char myUnicode = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicode);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        System.out.println(isCustomerOverTwentyOne);

        //recap of primitive data types we have looked at

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //String is not a primitive, it is a class
        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);
    }
}
