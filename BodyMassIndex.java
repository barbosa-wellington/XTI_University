import java.util.Scanner;


/**
 * @author Wellington B
 * @version 1.0
 * @date = 3/01/2024
 * 
 * Detail: This script java has the purpose to identify the Body Mass index of an individual by
 * asking the user to type his weight and tall. The Body Mass inde is obtained through the 
 * calculation of weight / (tall * tall)
 * 
 * This program will use the if/else condiction ot determine if the user are classify under one of
 * the following scenario
 * 
 * 
 * 
 * Underweight <18,5
	* Normal weight 18,5 - 24,9
	 * Overweight 25-29,9
	 * Obesity (class I) 30-34,9
	 * Obesity (class II) 35.0 - 39,9
	 * Obesity (class III) >40
 * */



public class BodyMassIndex {
	


	public static void main (String [] args){

		Scanner s = new Scanner(System.in);


		System.out.println("Enter your weight: ");
		String w = s.nextLine();	
		Integer weight = Integer.parseInt(w);

		System.out.println("Enter your tall");
		String t = s.nextLine();
		Double tall = Double.parseDouble(t);

		Double bmi = (weight /( tall * tall));

		System.out.println(bmi);

		if (bmi < 18.5)
		{
			System.out.println("You are underweight by having the bmi as: " + bmi);
		} 
		else if ((bmi > 18.5) && (bmi < 24.9)) {
			System.out.println("You are Normal weight by having the bmi as: " + bmi);
		} 
		else if ((bmi > 25) && (bmi < 29.9)) {
			System.out.println("You are Overweight by having the bmi as: " + bmi);
		} 
		else if ((bmi > 30) && (bmi < 34.9)) {
			System.out.println("You are Obessity Class I by having the bmi as: " + bmi);
		} 
		else if ((bmi > 35) && (bmi < 39.9)) {
			System.out.println("You are Obessity Class II by having the bmi as: " + bmi);
		} 
		else if (bmi >= 40){
			System.out.println("You are Obessity Class III by having the bmi as: " + bmi);
		}
	}
}