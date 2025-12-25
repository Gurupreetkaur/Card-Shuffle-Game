import java.util.Random;

public class SimpleCardGame {

public static void main(String[] args) {

// Define the ranks and suits

String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades");

String ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace";

// Create a random number generator

Random random = new Random();

// Player 1 draws a card

String player1 Rank = ranks[random.nextInt(ranks.length)];

String player1 Suit = suits[random.nextInt(suits.length)];

System.out.println("Player 1 drew: " + player1 Rank + " of " + player1 Suit);

// Player 2 draws a card

String player2Rank = ranks[random.nextInt(ranks.length)];

String player2Suit = suits[random.nextInt(suits.length)];

System.out.println("Player 2 drew: " + player2Rank +" of " + player2Suit);

// Compare the cards

int winner = compareRanks(player1 Rank, player2Rank, ranks); if (winner 1) {

System.out.println("Player 1 wins!");

} else if (winner = 2) {

System.out.println("Player 2 wins!");

} else {

System.out.println("It's a tie!");


}

// Method to compare card ranks

public static int compareRanks(String rank1, String rank2,

String[] ranks) {

int rank 1 Value = getRankValue(rank1, ranks);

int rank2Value = getRank Value(rank2, ranks);

if (rank 1 Value > rank2Value) {

return 1;

} else if (rank2 Value > rank 1 Value) {

}

return 2;

return 0;

}

// Method to get the rank value

public static int getRankValue(String rank, String[] ranks) {

for (int i = 0; i < ranks.length; i++){

if (ranks[i].equals(rank)) {

return i;

}

}

return -1;

}

}