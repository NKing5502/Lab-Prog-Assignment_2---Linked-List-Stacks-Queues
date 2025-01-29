//Nick King
//Lab Prog Assignment 2
//January 26, 2024

import java.util.LinkedList;
import java.util.Collections;

public class Deck {
    private LinkedList<Card> cards;

    public Deck() {
        cards = new LinkedList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(suit, ranks[i], values[i]));
            }
        }
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.poll();
    }
}