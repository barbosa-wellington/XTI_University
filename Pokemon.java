import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Wellington B
 * @version 1.0
 * @date = 6/01/2024
 * 
 * Detail: This script is a java game which utilize the array data structure. 
 * the goal of this game is to create an array of pokemon and battle against the 
 * machine.
 * 
 *  
 * Good lucky and enjoy the game. 
 * 
 * */


public class Pokemon {


	public static void main (String []args){

	String[] pokemons = {"Bulbasaur", "Ivysuar", "Venusaur",
	"Charmander", "Charmeleon", "Charizard","Squirtle","Wartortle","Blastoise",
						"Caterpie","Metapod","Butterfree"};


	Random r = new Random();

	int pokemon = r.nextInt(pokemons.length);

	System.out.println(pokemons[pokemon]); 	

	}
}