import java.util.Random;
import java.util.Arrays;


/**
 * @author Wellington B
 * @version 1.0
 * @date = 3/01/2024
 * 
 * Detail: This scrip is a java program that will utilize two different arrays the type string
 * which has been filled up with the card sequence. By using the class Random and Array, the
 * output of programming execution will be a card number and its respective nipe.
 * 
 * */



public class CardGuessing {


	public static void main(String [] args){


		Random r = new Random();

		// Create 2 arrays for game card dack
		String[] faces = {"A","2","3","4","5","6","7","8","9","10","King","Queen","Jack"};	
		String[] nipes = {"heart","diamond","club","spade"};



		int indexFaces = r.nextInt(faces.length);
		int indexNipes = r.nextInt(nipes.length);

		String face = faces[indexFaces];
		String nipe = nipes[indexNipes];

		System.out.println(face + " " + nipe);


	}
	

}