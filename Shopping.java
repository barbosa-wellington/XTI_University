import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Wellington B
 * @version 1.0
 * @date = 3/01/2024
 * 
 * Detail: This script java is a excercise of switch condition where
 * the user will choose one option so that he will shopping in the virtual market.
 * 
 * This program will utilize the data collection ArrayList and the conditional
 * structure called switch case.
 * 
 * */




public class Shopping {
	
	public static void main (String [] args) {


		Scanner sc = new Scanner(System.in);
		ArrayList<String> fruitList = new ArrayList<String>();
		ArrayList<String> drinkList = new ArrayList<String>();
		ArrayList<String> meatList = new ArrayList<String>();
		ArrayList<String> vegList = new ArrayList<String>();

		String[] market = {"Fruit", "Drink", "Meat", "Vegetable"};

		System.out.println("--------------This is the online SuperMarket----------");
		
		for(int i =0; i < market.length; i++){
			System.out.println(i + " Option: " + market[i]);
		}

		System.out.println(" Enter one option: ");
		String option = sc.nextLine();

		switch(option){

		case "Fruit":
			System.out.println("You have just chosen Fruit");
			break;
		case "Drink":
			System.out.println("You have just chosen Drink");
			break;
		case "Meat":
			System.out.println("You have just chosen Meat");
			break;
		case "Vegetable":
			System.out.println("You have just chosen Vegetable");
			break;
		default:
			System.out.println("No option has been chosen.");
			break;

		}

	}

}