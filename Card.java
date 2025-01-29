//Nick King
//Lab Prog Assignment 2
//January 26, 2024

public class Card {
    private String suit;
    private String rank;
    private int value;

    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}