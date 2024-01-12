import java.util.ArrayList;

public class ListArray {


	public static void main (String [] args){

		/**

		// The arrayList is a data collection which is different from data structure.

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
		*/



		ArrayList<ArrayList<String>> storeAldi = new ArrayList<ArrayList<String>>();


		// If the program was copile, it would generate an error 
		// because the ArrayList meatList, vegeList and fruitList 
		// has not been created yet.
		//storeAldi.add(meatList);
		//storeAldi.add(vegeList);
		//storeAldi.add(fruitList);

		//
		ArrayList<String> meatList = new ArrayList<String>();
		meatList.add("Lamb");
		meatList.add("Beef");
		meatList.add("Pork");
		meatList.add("fish");

		ArrayList<String> vegeList = new ArrayList<String>();
		vegeList.add("Cabbage");
		vegeList.add("Carrot");
		vegeList.add("Onion");

		ArrayList<String> fruitList= new ArrayList<String>();
		fruitList.add("Banana");
		fruitList.add("Watermelon");
		fruitList.add("Apple");


		// This command will utilizing the for condition to print 
		// all the elements in the meat list arrayList
		// The arrayList is a good option to store collection of data.
		//for (int i = 0; i < meatList.size(); i++){
		//	System.out.println(meatList.get(i));
		//}


		storeAldi.add(meatList);
		storeAldi.add(vegeList);
		storeAldi.add(fruitList);

		// This command will print the element of the list of fruit.
		// remembering that data structure in Java begins with 0
		System.out.println(storeAldi.get(2).get(0));



	}
	
	



}