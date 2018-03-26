package com.company;

/*
 * This is a class that tests the Card class.
 */

public class CardTester {

    /*
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
	

    public static void main(String[] args) {
		Card firstOne = new Card("3", "Diamonds", 3);
        Card secondOne = new Card("6", "Hearts", 6);
        Card thirdOne = new Card("Jack", "Spades", 11);

        System.out.println(firstOne.suit());
        System.out.println(firstOne.rank());
        System.out.println(firstOne.pointValue());
        System.out.println(firstOne.matches(secondOne));
        System.out.println(firstOne.toString());
        System.out.println();

        System.out.println(secondOne.suit());
        System.out.println(secondOne.rank());
        System.out.println(secondOne.pointValue());
        System.out.println(secondOne.matches(thirdOne));
        System.out.println(secondOne.toString());
        System.out.println();

        System.out.println(thirdOne.suit());
        System.out.println(thirdOne.rank());
        System.out.println(thirdOne.pointValue());
        System.out.println(thirdOne.matches(firstOne));
        System.out.println(thirdOne.toString());
        System.out.println();
    }
}
