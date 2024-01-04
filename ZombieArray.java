import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Wellington B
 * @version 1.0
 * @date = 3/01/2024
 * 
 * Detail: This is a game base on the Array datastructure. The game has the purpose of
 * create a profile by type of character and weapon to fight against the zombie. The game
 * will have 3 three pre-filled arrays:
 * 
 * 1 This arrays has a number of character which has strenght and weakness to combat the zombies.
 * 2 This arrays has differet weapon to combat the zombies.
 * 3 This arrays has a range of different zombies types.
 * 
 * The goal of this game is to select a character and a weapon which can beat the zombie. This
 * will be happen though the class Random which will be randomly pick up one element in each
 * array and print the selected elements at the end.
 * 
 * Good lucky and enjoy it.
 * 
 * 
 * */


public class ZombieArray {
	


	public static void main(String [] args){


		String[] zombies = {"Runner","Stalker","Clicker","Bloater","Shambler","Rat King"};
		String[] character_p = {"Ally", "Bill", "Tessa", "Bob", "Joel"};
		String[] weapon = {"Machete","Baseball Bat","Pump Shotgun","Bol-Action Rifle","Semi-Auto Rifle", "Hunting Pistol"}; 



		System.out.println(Arrays.toString(zombies));
		System.out.println(Arrays.toString(character_p));
		System.out.println(Arrays.toString(weapon));


	
		Random r = new Random();

		int nf = r.nextInt(zombies.length);

		System.out.print(zombies[nf]);





	}
}