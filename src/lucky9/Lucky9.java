/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucky9;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Mark
 */
public class Lucky9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner SC = new Scanner(System.in);
       Random RA = new Random();
       System.out.println("--------------------[Welcome to our Lucky 9 Casino game]--------------------");
       System.out.println("Direction: Each players will get two different cards from the dealer");
       System.out.println("Objectives:");
       System.out.println("- The main goal of each player is to defeat the dealer");
       System.out.println("- The game is not about defeating fellow players");
       System.out.println("- Each player must get exact value of 9 or nearest to the 9");
       System.out.println("- Each participant of the game will get the value of their cards \nby adding their 1st and 2nd card");
       System.out.println("- By adding their 1st and 2nd card, If a player gets a total value that \nexceeds to 9, the player needs to remove the first digit of the number \nto get the official value");
       System.out.println("----------------------------------------------------------------------------");
       System.out.println("----------------------------------------------------------------------------");
       
       String Player1_name;
       String Player2_name;
       String Player3_name;
       String Player4_name;
       
       int Player1_choose;
       int Player2_choose;
       int Player3_choose;
       int Player4_choose;
       int Dealer_choose;
      
       int Player1_bet;
       int Player2_bet;
       int Player3_bet;
       int Player4_bet;
          
       final int StartingMoney = 5000;
       
       
       String[] cardType = {"♣", "♦" , "♥" , "♠"};
       String[] choose = {"Additional card", "I'm good" , "Surrender"};

       int Player1_total1;
       int Player1_total2 = 0;
       int Player2_total1;
       int Player2_total2 = 0; 
       int Player3_total1;
       int Player3_total2 = 0; 
       int Player4_total1;
       int Player4_total2 = 0;
       int dealer_total1;
       int dealer_total2 = 0;
       

       
       //PLAYER 1
       
       System.out.print("Name of Player 1: ");
       Player1_name = SC.nextLine();
       System.out.println("Cash on hand: ₱" + StartingMoney);
       System.out.print("Place your bet: ₱"); 
       Player1_bet = SC.nextInt();
       
       int Player1_firstCard = 1 + RA.nextInt(10);
       String Player1firstCard_symbol  = cardType[RA.nextInt(cardType.length)];
       System.out.println(Player1_name + "'s first card is: " + Player1_firstCard + Player1firstCard_symbol);
       int Player1_secondCard = 1 + RA.nextInt(10);
       String Player1secondCard_symbol  = cardType[RA.nextInt(cardType.length)];
       System.out.println(Player1_name + "'s second card is: " + Player1_secondCard + Player1secondCard_symbol); 
       System.out.println("------Choices------");
       System.out.println("[0] " + choose[0]);
       System.out.println("[1] " + choose[1]);
       System.out.println("[2] " + choose[2]);
       System.out.print("Make a decision: ");
       Player1_choose = SC.nextInt();
       
       switch (Player1_choose) {
            case 0:
                int Player1_thirdCard = 1 + RA.nextInt(10);
                String Player1thirdCard_symbol = cardType[RA.nextInt(cardType.length)];
                System.out.println(Player1_name + "'s third card is: " + Player1_thirdCard + Player1thirdCard_symbol);
                Player1_total1 = Player1_firstCard + Player1_secondCard + Player1_thirdCard;
                Player1_total2 = Player1_total1 % 10;
                System.out.println(Player1_name + "'s total value of card is: " + Player1_total2);
                break;
            case 1:
                Player1_total1 = Player1_firstCard + Player1_secondCard;
                Player1_total2 = Player1_total1 % 10;
                System.out.println(Player1_name + "'s total value of cards: " + Player1_total2);
                break;
            case 2:
                System.out.println("You choose to surrender" + "\n" + "Only haft of your bet will be deduct");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
       System.out.println("----------------------------------------------------------------------------");

        
       //PLAYER 2
       
       System.out.print("Name of Player 2: ");
       Player2_name = SC.next();
       System.out.println("Cash on hand: ₱" + StartingMoney);
       System.out.print("Place your bet: ₱"); 
       Player2_bet = SC.nextInt();
       int Player2_firstCard = 1 + RA.nextInt(10);
       String Player2firstCard_symbol = cardType[RA.nextInt(cardType.length)];
       System.out.println(Player2_name + "'s first card is: " + Player2_firstCard + Player2firstCard_symbol);
       int Player2_secondCard = 1 + RA.nextInt(10);
       String Player2secondCard_symbol = cardType[RA.nextInt(cardType.length)];
       System.out.println(Player2_name + "'s second card is: " + Player2_secondCard + Player2secondCard_symbol); 
       System.out.println("------Choices------");
       System.out.println("[0] " + choose[0]);
       System.out.println("[1] " + choose[1]);
       System.out.println("[2] " + choose[2]);
       System.out.print("Make a decision: ");
       Player2_choose = SC.nextInt();
    
        switch (Player2_choose) {
            case 0:
                int Player2_thirdCard = 1 + RA.nextInt(10);
                String Player2thirdCard_symbol = cardType[RA.nextInt(cardType.length)];
                System.out.println(Player2_name + "'s third card is: " + Player2_thirdCard + Player2thirdCard_symbol);
                Player2_total1 = Player2_firstCard + Player2_secondCard + Player2_thirdCard;
                Player2_total2 = Player2_total1 % 10;
                System.out.println(Player2_name + "'s total value of card is: " + Player2_total2);
                break;
            case 1:
                Player2_total1 = Player2_firstCard + Player2_secondCard;
                Player2_total2 = Player2_total1 % 10;
                System.out.println(Player2_name + "'s total value of cards: " + Player2_total2);
                break;
            case 2:
                System.out.println("You choose to surrender" + "\n" + "Only haft of your bet will be deduct");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
       System.out.println("----------------------------------------------------------------------------");
     
       
       //PLAYER 3
       
       System.out.print("Name of Player 3: ");
       Player3_name = SC.next();
       System.out.println("Cash on hand: ₱" + StartingMoney);
       System.out.print("Place your bet: ₱"); 
       Player3_bet = SC.nextInt();
       int Player3_firstCard = 1 + RA.nextInt(10);
       String Player3firstCard_symbol = cardType[RA.nextInt(cardType.length)];
       System.out.println(Player3_name + "'s first card is: " + Player3_firstCard + Player3firstCard_symbol);
       int Player3_secondCard = 1 + RA.nextInt(10);
       String Player3secondCard_symbol = cardType[RA.nextInt(cardType.length)];
       System.out.println(Player3_name + "'s second card is: " + Player3_secondCard + Player3secondCard_symbol); 
       System.out.println("------Choices------");
       System.out.println("[0] " + choose[0]);
       System.out.println("[1] " + choose[1]);
       System.out.println("[2] " + choose[2]);
       System.out.print("Make a decision: ");
       Player3_choose = SC.nextInt();
       
        switch (Player3_choose) {
            case 0:
                int Player3_thirdCard = 1 + RA.nextInt(10);
                String Player3thirdCard_symbol = cardType[RA.nextInt(cardType.length)];
                System.out.println(Player3_name + "'s third card is: " + Player3_thirdCard + Player3thirdCard_symbol);
                Player3_total1 = Player3_firstCard + Player3_secondCard + Player3_thirdCard;
                Player3_total2 = Player3_total1 % 10;
                System.out.println(Player3_name + "'s total value of card is: " + Player3_total2);
                break;
            case 1:
                Player3_total1 = Player3_firstCard + Player3_secondCard;
                Player3_total2 = Player3_total1 % 10;
                System.out.println(Player3_name + "'s total value of cards: " + Player3_total2);
                break;
            case 2:
                System.out.println("You choose to surrender" + "\n" + "Only haft of your bet will be deduct");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
       System.out.println("----------------------------------------------------------------------------");
       
       
       //PLAYER 4
       
       System.out.print("Name of Player 4: ");
       Player4_name = SC.next();
       System.out.println("Cash on hand: ₱" + StartingMoney);
       System.out.print("Place your bet: ₱"); 
       Player4_bet = SC.nextInt();
       int Player4_firstCard = 1 + RA.nextInt(10);
       String Player4firstCard_symbol = cardType[RA.nextInt(cardType.length)];
       System.out.println(Player4_name + "'s first card is: " + Player4_firstCard + Player4firstCard_symbol);
       int Player4_secondCard = 1 + RA.nextInt(10);
       String Player4secondCard_symbol = cardType[RA.nextInt(cardType.length)];
       System.out.println(Player4_name + "'s second card is: " + Player4_secondCard + Player4secondCard_symbol); 
       System.out.println("------Choices------");
       System.out.println("[0] " + choose[0]);
       System.out.println("[1] " + choose[1]);
       System.out.println("[2] " + choose[2]);
       System.out.print("Make a decision: ");
       Player4_choose = SC.nextInt();
       
        switch (Player4_choose) {
            case 0:
                int Player4_thirdCard = 1 + RA.nextInt(10);
                String Player4thirdCard_symbol = cardType[RA.nextInt(cardType.length)];
                System.out.println(Player4_name + "'s third card is: " + Player4_thirdCard + Player4thirdCard_symbol);
                Player4_total1 = Player4_firstCard + Player4_secondCard + Player4_thirdCard;
                Player4_total2 = Player4_total1 % 10;
                System.out.println(Player4_name + "'s total value of card is: " + Player4_total2);
                break;
            case 1:
                Player4_total1 = Player4_firstCard + Player4_secondCard;
                Player4_total2 = Player4_total1 % 10;
                System.out.println(Player4_name + "'s total value of cards: " + Player4_total2);
                break;
            case 2:
                System.out.println("You choose to surrender" + "\n" + "Only haft of your bet will be deduct");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
           
       System.out.println("----------------------------------------------------------------------------");

       
       //DEALER OR BANKER
       
       System.out.println("Name of Dealer: Jibs");
       int dealer_firstCard = 1 + RA.nextInt(10);
       String dealerfirstCard_symbol = cardType[RA.nextInt(cardType.length)];
       System.out.println("Jibs's first card is: " + dealer_firstCard + dealerfirstCard_symbol);
       int dealer_secondCard = 1 + RA.nextInt(10);
       String dealersecondCard_symbol = cardType[RA.nextInt(cardType.length)];
       System.out.println("Jibs's second card is: " + dealer_secondCard + dealersecondCard_symbol); 
       System.out.println("[0] " + choose[0]);
       System.out.println("[1] " + choose[1]);
       System.out.print("Make a choice: ");
       Dealer_choose = SC.nextInt();
       
        switch (Dealer_choose) {
            case 0:
                int dealer_thirdCard = 1 + RA.nextInt(10);
                String dealerthirdCard_symbol = cardType[RA.nextInt(cardType.length)];
                System.out.println("Jibs's third card is: " + dealer_thirdCard + dealerthirdCard_symbol);
                dealer_total1 = dealer_firstCard + dealer_secondCard + dealer_thirdCard;
                dealer_total2 = dealer_total1 % 10;
                System.out.println("Jibs's total value of card is: " + dealer_total2);
                break;
            case 1:
                dealer_total1 = dealer_firstCard + dealer_secondCard;
                dealer_total2 = dealer_total1 % 10;
                System.out.println("Jibs's total value of cards: " + dealer_total2);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
       System.out.println("----------------------------------------------------------------------------");
       System.out.println("----------------------------------------------------------------------------");
       
       
       
       //REMAINING MONEY
       
       //If wins
       int Player1_CashonHandWins = StartingMoney + Player1_bet;
       int Player2_CashonHandWins = StartingMoney + Player2_bet;
       int Player3_CashonHandWins = StartingMoney + Player3_bet;
       int Player4_CashonHandWins = StartingMoney + Player4_bet;
       
       //If lose
       int Player1_CashonHandLose = StartingMoney - Player1_bet;
       int Player2_CashonHandLose = StartingMoney - Player2_bet;
       int Player3_CashonHandLose = StartingMoney - Player3_bet;
       int Player4_CashonHandLose = StartingMoney - Player4_bet;
       
       
                                                    //GAME RESULTS COMPUTATION
       
       System.out.print("Press any key to see the game result: ");
       String key = SC.next();
       System.out.println("----------------------------------------------------------------------------");    
       System.out.println("-------------------------------[GAME RESULTS]-------------------------------");
      
       
       
       //PLAYER 1
       if (Player1_choose == 2){
       int Player1_MoneyAfterBet = StartingMoney - Player1_bet;
       int Player1_MoneyReduction = Player1_bet / 2;
       int Player1_TotalCash = Player1_MoneyAfterBet + Player1_MoneyReduction;
       System.out.println("Player 1: " + Player1_name);      
       System.out.println("Game Results status: Surrendered");
       System.out.println("Total cash before the round start: ₱" +  StartingMoney);
       System.out.println("Total bet: ₱" + Player1_bet);
       System.out.println("Total lose: ₱" + Player1_MoneyReduction);
       System.out.println("Cash on Hand: ₱" +  Player1_TotalCash);
       System.out.println("----------------------------------------------------------------------------"); 
       }
       else if (dealer_total2 > Player1_total2){
       System.out.println("Player 1: " + Player1_name);
       System.out.println("Game Results status: Lose");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player1_bet);
       System.out.println("Total lose: ₱" + Player1_bet);
       System.out.println("Cash on Hand: ₱" + Player1_CashonHandLose);
       System.out.println("----------------------------------------------------------------------------");
       }
       else if (dealer_total2 == Player1_total2) {
       System.out.println("Player 1: " + Player1_name);
       System.out.println("Game Results status: Tied");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player1_bet);
       System.out.println("Cash on Hand: ₱" + StartingMoney);
       System.out.println("----------------------------------------------------------------------------");    
       }
       else if (dealer_total2 < Player1_total2)  {
       System.out.println("Player 1: " + Player1_name);  
       System.out.println("Game Results status: Wins");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player1_bet);
       System.out.println("Total wins: ₱" + Player1_bet);
       System.out.println("Cash on Hand: ₱" + Player1_CashonHandWins);
       System.out.println("----------------------------------------------------------------------------");
       }
      
      
       
       //PLAYER 2
       if (Player2_choose == 2){
       int Player2_MoneyAfterBet = StartingMoney - Player2_bet;
       int Player2_MoneyReduction = Player2_bet / 2;
       int Player2_TotalCash = Player2_MoneyAfterBet + Player2_MoneyReduction;
       System.out.println("Player 2: " + Player2_name);      
       System.out.println("Game Results status: Surrendered");
       System.out.println("Total cash before the round start: ₱" +  StartingMoney);
       System.out.println("Total bet: ₱" + Player2_bet);
       System.out.println("Total lose: ₱" + Player2_MoneyReduction);
       System.out.println("Cash on Hand: ₱" +  Player2_TotalCash);
       System.out.println("----------------------------------------------------------------------------"); 
       }
       else if (dealer_total2 > Player2_total2){
       System.out.println("Player 2: " + Player2_name); 
       System.out.println("Game result status: Lose");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player2_bet);
       System.out.println("Total lose: ₱" + Player2_bet);
       System.out.println("Cash on hand: ₱" + Player2_CashonHandLose);
       System.out.println("----------------------------------------------------------------------------");
       }
       else if (dealer_total2 == Player2_total2) {
       System.out.println("Player 2" + Player2_name);
       System.out.println("Game result status: Tied");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player2_bet);
       System.out.println("Cash on Hand: ₱" + StartingMoney);
       System.out.println("----------------------------------------------------------------------------");
       }
       else if  (dealer_total2 < Player2_total2){
       System.out.println("Player 2: " + Player2_name);   
       System.out.println("Game result status: Wins");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player2_bet);
       System.out.println("Total wins: ₱" + Player2_bet);
       System.out.println("Cash on Hand: ₱" + Player2_CashonHandWins);
       System.out.println("----------------------------------------------------------------------------");
       }
       
      
       
       //PLAYER 3
       if (Player3_choose == 2){
       int Player3_MoneyAfterBet = StartingMoney - Player3_bet;
       int Player3_MoneyReduction = Player3_bet / 2;
       int Player3_TotalCash = Player3_MoneyAfterBet + Player3_MoneyReduction;
       System.out.println("Player 3: " + Player3_name);      
       System.out.println("Game Results status: Surrendered");
       System.out.println("Total cash before the round start: ₱" +  StartingMoney);
       System.out.println("Total bet: ₱" + Player3_bet);
       System.out.println("Total lose: ₱" + Player3_MoneyReduction);
       System.out.println("Cash on Hand: ₱" +  Player3_TotalCash);
       System.out.println("----------------------------------------------------------------------------"); 
       }
       else if (dealer_total2 > Player3_total2){
       System.out.println("Player 3: " + Player3_name);
       System.out.println("Game Results status: Lose");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player3_bet);
       System.out.println("Total lose: ₱" + Player3_bet);
       System.out.println("Cash on Hand: ₱" + Player3_CashonHandLose);
       System.out.println("----------------------------------------------------------------------------");
       }
       else if (dealer_total2 == Player3_total2) {
       System.out.println("Player 3: " + Player3_name);
       System.out.println("Game Results status: Tied");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player3_bet);
       System.out.println("Cash on Hand: ₱" + StartingMoney);
       System.out.println("----------------------------------------------------------------------------");
       }
       else if (dealer_total2 < Player3_total2) {
       System.out.println("Player 3: " + Player3_name);
       System.out.println("Game Results status: Wins");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player3_bet);
       System.out.println("Total wins: ₱" + Player3_bet);
       System.out.println("Cash on Hand: ₱" + Player3_CashonHandWins);
       System.out.println("----------------------------------------------------------------------------");
       }

       
       
       //PLAYER 4
       if (Player4_choose == 2){
       int Player4_MoneyAfterBet = StartingMoney - Player4_bet;
       int Player4_MoneyReduction = Player4_bet / 2;
       int Player4_TotalCash = Player4_MoneyAfterBet + Player4_MoneyReduction;
       System.out.println("Player 4: " + Player4_name);      
       System.out.println("Game Results status: Surrendered");
       System.out.println("Total cash before the round start: ₱" +  StartingMoney);
       System.out.println("Total bet: ₱" + Player4_bet);
       System.out.println("Total lose: ₱" + Player4_MoneyReduction);
       System.out.println("Cash on Hand: ₱" +  Player4_TotalCash);
       System.out.println("----------------------------------------------------------------------------"); 
       }
       else if (dealer_total2 > Player4_total2){
       System.out.println("Player 4: " + Player4_name); 
       System.out.println("Game Results status: Lose");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player4_bet);
       System.out.println("Total lose: ₱" + Player4_bet);
       System.out.println("Cash on Hand: ₱" + Player4_CashonHandLose); 
       System.out.println("----------------------------------------------------------------------------");
       }
       else if (dealer_total2 == Player4_total2) {
       System.out.println("Player 4: " + Player4_name); 
       System.out.println("Game Results status: Tied");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player4_bet);
       System.out.println("Cash on Hand: ₱" + StartingMoney);
       System.out.println("----------------------------------------------------------------------------");
       }
       else if (dealer_total2 < Player4_total2) {
       System.out.println("Player 4: " + Player4_name);   
       System.out.println("Game Results status: Wins");
       System.out.println("Total cash before the round start: ₱" + StartingMoney);
       System.out.println("Total bet: ₱" + Player4_bet);
       System.out.println("Total wins: ₱" + Player4_bet);
       System.out.println("Cash on Hand: ₱" + Player4_CashonHandWins);
       System.out.println("----------------------------------------------------------------------------");
       }
       System.out.println("----------------------------------------------------------------------------");
       System.out.println("---------------------------------[GAME ENDS]--------------------------------");
       System.out.println("----------------------------------------------------------------------------");
    }
       }
    


    

