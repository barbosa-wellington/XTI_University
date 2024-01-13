import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


/**
 * @author Wellington B
 * @version 1.0
 * @date = 13/01/2024
 * 
 * Detail: This script java is a Game based on simple procedures that take an user
 * imput and the program will validate if the input is the same as the machine
 * generated number. If it is correct, then the program will presen the information 
 * "Your bet was correct", otherwise the program will print the correct bet.
 * 
 * Good lucky!
 * 
 * */

 public class GameDice {
 	public static void main (String [] args){

 	
 		Scanner sc = new Scanner(System.in);
 		Random r = new Random();
 		
 		System.out.println("Inform your bet: ");
 		int bet = sc.nextInt();

 		int randomBet = r.nextInt(6); 

 		if (bet == randomBet){
 			System.out.println("Your bet was correct: " + bet);
 		} else {
 			System.out.println(" Your bet was wrong! the correct bet was: " + randomBet);
 		}

 	}
 }