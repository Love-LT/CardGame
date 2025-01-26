/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in)){
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()* 13)+ 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
        }
        
       // System.out.println("Pick a card between (1-13): ");
       // int value = scanner.nextInt();
        
       // System.out.println("Pick a suit from (0 = Hearts, 1 = Diamonds, 2 = Spades, 3 =  Clubs");
       // int suitChoice = scanner.nextInt();
    
    
   // Card userChosenCard = new Card();
   // userChosenCard.setValue(value);
   // userChosenCard.setSuit(Card.SUITS[suitChoice]);

Card luckyCard = new Card(); // hard coding my lucky card
luckyCard.setValue(9);
luckyCard.setSuit("Hearts");

// boolean isCardfound = false;
// for (Card card : magicHand) {
   // if (card.getValue() == userChosenCard.getValue() &&
     //       card.getSuit().equals(userChosenCard.getSuit())) {
       //     isCardfound = true;
         //   break;
   // }
// }

boolean isTheLuckyCardFound = false;
    for (Card card: magicHand) {
    if (card.getValue() == luckyCard.getValue() &&
        card.getSuit().equals(luckyCard.getSuit())) {
        isTheLuckyCardFound = true;
        break;
    }
}


// if (isCardfound) {
   // System.out.println("Awesome! Your card is in the magic hand.");
// } else {
   // System.out.println("Sorry, your card was not in the magic hand");
// }
            if (isTheLuckyCardFound) {
                System.out.println("Your luck is at the highest, the lucky card is in the magic hand :) ");
            } else {
                System.out.println("The lucky card is not in the magic hand :( ");
            }
        }
    }
}
