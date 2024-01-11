import java.util.ArrayList;

public class ListArray {


	public static void main (String [] args){



		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("White");


		// This command will print the element existent on the array
		System.out.println(colors.toString());


		// The array can be modify according to the user.
		//colors.add(0, "White");

		// This command will identify the size of the arrayList
		System.out.println(colors.size());

		//This command will return as the result the element located at position 2
		System.out.println("Element=2 " + colors.get(2));

		//This command will identify the index of an existent element
		System.out.println(colors.indexOf("White"));


		// This command will remove the element white from the arrayList
		colors.remove("White");

		// This command will verify if an element exist in the ArrayList and return an boolean 
		System.out.println("The color red is in this array? " + colors.contains("Red"));
		
	}
	
	



}