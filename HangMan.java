import java.util.Arrays;
import java.util.Scanner;



/**
 * @author Wellington B
 * @version 1.0
 * @date = 3/01/2024
 * 
 * Detail: This scrip is a java program that will utilize the Array data structure.
 * The game is the classic hand Man which the user will try to game the word chosen
 * via a random engine. The user will have a ocuple of guessing, if the user cannot 
 * guess what is the word, the game will show up and the user will lose.
 * 
 * Good lucky!
 * 
 * */


public class HangMan {


	public static void main(String []args){


		String[] chosenWords = {};
		String[] guessingWords = {};
		String[] vocabulary = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","W","Y","Z"};

		String[] animals = {"dog","cat","bird","lion"};
		String[] colors = {"blue","red","green","black"};


		Scanner s = new Scanner(System.in);

		System.out.println("Inter a letter: ");
		String l = s.nextLine();

		char c = l.charAt(0);

		System.out.println("the letter was: " + c);



	}
}