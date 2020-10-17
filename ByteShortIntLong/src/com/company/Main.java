package com.company;

public class Main {

    public static void main(String[] args) {
	int myNumber = 10_000;
	int myMinValue = Integer.MIN_VALUE;
	int myMaxValue = Integer.MAX_VALUE;

	System.out.println("My min value: " + myMinValue);
	System.out.println("My min value: " + myMaxValue);

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("My min byte value: "  + myMinByteValue);
    System.out.println("my max byte value: " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("My min Short value: "  + myMinShortValue);
    System.out.println("my max Short value: " + myMaxShortValue);

    long myLongValue = 100L;
    System.out.println("The myLongValue is: " + myLongValue);

    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("My min Long value: "  + myMinLongValue);
    System.out.println("my max Long value: " + myMaxLongValue);

    //The L forces java to use a long not an int
    //Else java will treat number as an int and reject if out of range
    long bigLongLiteralValue = 2_147_483_647_567L;
        System.out.println("My bigLongLiteralValue: " + bigLongLiteralValue);
    }
}
