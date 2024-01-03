import java.util.Scanner;


/**
 * @author Wellington B
 * @version 1.0
 * @date = 3/01/2024
 * 
 * Detail: This is a simple script which has the purpose to request an user input
 * to identify which stage fo life he/she may be. The validation of this script will
 * be done by the conditon if/else of the java library
 * 
 * */


public class AgeGuessing {


	public static void main(String [] args){

		Scanner s = new Scanner(System.in);


		System.out.println(" What is your age: ");
		String ageU = s.nextLine();

		// To know what is the type of the variable getClass()
		System.out.println(ageU.getClass());

		// Convert the type for a integer
		Integer age = Integer.parseInt(ageU);
		//System.out.println("the conversion of the str is: " + age + " and the new type is: " + age.getClass());


		//Guessing the age of a user and identify which stage of life may they are
		//int age = 61;
		if (age < 11) {
			System.out.println("Child");

		} else if (age > 11 && age <=18){
			System.out.println("Adolencent");

		} else  if (age > 18 && age <= 60){
			System.out.println("Adult");

		} else {
			System.out.println("Elder");
		}
	}



	
}