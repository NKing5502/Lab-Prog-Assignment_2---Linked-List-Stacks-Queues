//Nick King
//Lab Prog Assignment 2
//January 26, 2024

public class WarGame {
    private Player player1;
    private Player player2;
    private Deck deck;

    public WarGame() {
        player1 = new Player();
        player2 = new Player();
        deck = new Deck();
        dealCards();
    }

    private void dealCards() {
        while (deck.drawCard() != null) {
            player1.addCardToHand(deck.drawCard());
            player2.addCardToHand(deck.drawCard());
        }
    }

    public void playGame() {
        while (player1.hasCards() && player2.hasCards()) {
            Card card1 = player1.playCard();
            Card card2 = player2.playCard();

            System.out.println("Player 1 plays: " + card1);
            System.out.println("Player 2 plays: " + card2);

            if (card1.getValue() > card2.getValue()) {
                player1.addWonCard(card1);
                player1.addWonCard(card2);
                System.out.println("Player 1 wins the round.");
            } else if (card1.getValue() < card2.getValue()) {
                player2.addWonCard(card1);
                player2.addWonCard(card2);
                System.out.println("Player 2 wins the round.");
            } else {
                System.out.println("It's a tie!");
            }
        }

        if (player1.getTotalCards() > player2.getTotalCards()) {
            System.out.println("Player 1 wins the game!");
        } else if (player1.getTotalCards() < player2.getTotalCards()) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("The game is a tie!");
        }
    }

    public static void main(String[] args) {
        WarGame game = new WarGame();
        game.playGame();
    }
}