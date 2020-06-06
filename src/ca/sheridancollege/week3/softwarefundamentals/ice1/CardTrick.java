/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

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
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
       
            c.setValue(c.getRandomValue());
            c.setSuit(Card.SUITS[c.getRandomSuit()]);
            magicHand[i] = c;
            //c.setSuit(Card.SUITS[input.nextInt()]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Card userObj = new Card();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired integar from 1 to 13 for the card value.");
        userObj.setValue(input.nextInt());
        System.out.println("Enter the desired suit, put 0 for Hearts, 1 for Diamonds, 2 for Spades, 3 for Clubs for the card value.");
        userObj.setSuit(Card.SUITS[input.nextInt()]);
        
       int j = 0;
       for (int i = 0; i<magicHand.length; i++){
           if(userObj.getValue() == magicHand[i].getValue() && userObj.getSuit()==magicHand[i].getSuit()){
               j++;
           }
       }
       if (j>=1){
        
           System.out.println("The entered card number matches with the card present in the magic hand.");
       }
       else {
            System.out.println("The entered card number does not matches with the cards present in the magic hand.");       
                   }
           
       }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here to find matching card is in array or not
        //Then report the result here
    }
    
