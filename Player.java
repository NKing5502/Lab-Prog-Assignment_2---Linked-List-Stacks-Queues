//Nick King
//Lab Prog Assignment 2
//January 26, 2024

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Player {
    private Queue<Card> hand;
    private Stack<Card> wonCards;

    public Player() {
        hand = new LinkedList<>();
        wonCards = new Stack<>();
    }

    public void addCardToHand(Card card) {
        hand.offer(card);
    }

    public Card playCard() {
        return hand.poll();
    }

    public void addWonCard(Card card) {
        wonCards.push(card);
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }

    public int getTotalCards() {
        return hand.size() + wonCards.size();
    }
}