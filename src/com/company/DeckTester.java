package com.company;

public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     * @param args is not used.
     */
    public static void main(String[] args) {
        String [] aRank = {"Ace", "2", "3"};
        String [] aSuit = {"Hearts", "Diamonds", "Clubs"};
        int [] aVal = {2, 1, 6};
        String [] bRank = {"4", "7", "6"};
        String [] bSuit = {"Spades", "Clubs", "Hearts"};
        int [] bVal = {5, 3, 8};
        String [] cRank = {};
        String [] cSuit = {};
        int [] cVal = {};

        Deck one = new Deck(aRank, aSuit, aVal);
        Deck two = new Deck(bRank, bSuit, bVal);
        Deck three = new Deck(cRank, cSuit, cVal);

        System.out.println(one.size());
        System.out.println(one.isEmpty());
        //System.out.println(one.deal());
        System.out.println(two.size());
        System.out.println(two.isEmpty());
        //System.out.println(two.deal());
        System.out.println(three.size());
        System.out.println(three.isEmpty());
        //System.out.println(three.deal());
    }
}