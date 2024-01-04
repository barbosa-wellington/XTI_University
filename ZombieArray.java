import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 * @author Wellington B
 * @version 1.0
 * @date = 3/01/2024
 * 
 * Detail: This is a game base on the Array data structure. The game has the purpose of
 * create a profile by choosing of character and weapon to fight against the zombie. The game
 * will have 3 three pre-filled arrays:
 * 
 * 1 This arrays has a number of character which has strenght and weakness to combat the zombies.
 * 2 This arrays has differet weapon to combat the zombies.
 * 3 This arrays has a range of different zombies types.
 * 
 * The goal of this game is to select a character and a weapon which can beat the zombie. This
 * will be happen through the class Random which will be randomly pick up one element in each
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
		String[] weapon = {"Machete","Shotgun", "Rifle","Pistol"};
		Integer[] damage = {2,4, 6, 5};
		

		//System.out.println(Arrays.toString(zombies));
		//System.out.println(Arrays.toString(character_p));
		//System.out.println(Arrays.toString(weapon));

		Random r = new Random();
		Scanner s = new Scanner(System.in);

		//.getClass()
		// this method will idetify the type of class a perticula data structure is return
		
		System.out.print("Please select one character from The last of Us: " +'\n');
		System.out.println(Arrays.toString(character_p));
		
		String c = s.nextLine();
		
		// Possible mistake
		// the method equals will compare the full string which means
		// if the user only type the first letter of the character name,
		// it will return false. Because the name is full name.

		//System.out.println(c.equals(character_p[0]));

		if ( c.equals(character_p[0])) {
			System.out.println("You chose: " + character_p[0]);
		} else if (c.equals(character_p[1])) {
			System.out.println("You chose: " + character_p[1]);
		} else if (c.equals(character_p[2])) {
			System.out.println("You chose: " + character_p[2]);
		} else if (c.equals(character_p[3])) {
			System.out.println("You chose: " + character_p[3]);
		}else if (c.equals(character_p[4])) {
			System.out.println("You chose: " + character_p[4]);
		} else {
			System.out.println(" You did not selected any character");
		}

		System.out.print("Please select one weapon from The last of Us: " +'\n');
		System.out.println(Arrays.toString(weapon));
		
		String w = s.nextLine();

		if ( w.equals(weapon[0])) {
			System.out.println("You chose: " + weapon[0]);
		} else if (w.equals(weapon[1])) {
			System.out.println("You chose: " + weapon[1]);
		} else if (w.equals(weapon[2])) {
			System.out.println("You chose: " + weapon[2]);
		} else if (w.equals(weapon[3])) {
			System.out.println("You chose: " + weapon[3]);
		} else if (w.equals(weapon[4])) {
			System.out.println("You chose: " + weapon[4]);
		} else {
			System.out.println(" You did not selected any character");
		}

		System.out.println('\n');
		System.out.println("Your character is: " + c + " and the weapon to fight is a: " + w);

		// this command will select a zombie by using the random class
		// the first command will obtain the number of elements on the array Zombies.
		// then the variable nf will receive this random number.
		int nf = r.nextInt(weapon.length);

		// the zomby variable will receive the name of the zombie which had being set at the array zombie possiotn
		String zomby = zombies[nf];

		// This command will display which zombie the character will fight against
		System.out.println("You will fight against the zombie: " + zomby);
		JOptionPane.showMessageDialog(null, zomby);
		

	}
}