import java.util.ArrayList;
import java.util.Scanner;


public class Fluxo {
	
	public static void main (String [] args){

		/*

		int age = 45;
		
		boolean approved = true;

		if(age <= 11){
			System.out.println("You are a child");
		} else if (age > 11 && age <= 18){
			System.out.println("You are an Adolencent ");
		} else if (age > 18 && age <= 60){
			System.out.println("You are an adult");
		} else {
			System.out.println(" Enjoy your days");
		}

		int num = 11;

		if (num %2 == 0){
			System.out.println("it is even number");
		} else {
			System.out.println("it is odd number"); 
		}


		char gender = 'F';

		switch(gender) {
		case 'M':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Female");
			break;
		default:
			System.out.println("Binary");

		}

		//String technology = "postgresql";
		String technology = "Cobol";

		switch(technology){
		case "Java":
		case "C++":
		case "Cobol":
			System.out.println("Programming language");
			// Without the instruction break the progra would print the database 
			// print
			break;

		case "oracle":
		case  "sqlserver":
		case "postgresql":
			System.out.println("DataBase");
			break;
		default:
			System.out.println("Technology unknown");
		}

		//Execelent exercise for print figures
		for (int i = 1; i <= 5; i++){
			for(int j =1; j <=5;j++){
				System.out.print("* ");
			}
			System.out.println("*");
			
		}

		
		int i = 1;
		while (i < 10){
			System.out.println(i);
			i++;

		}
	
		

		Scanner sc= new Scanner(System.in);
		ArrayList<String> products = new ArrayList<String>();
		String product = "";

		do {
			System.out.print("Inform a product name: ");
			product = sc.nextLine();

			products.add(product);

			if (product.equals("Close")){
				products.remove(product);
			}

		} while (!"Close".equals(product));


		for(String prod : products){
			System.out.println(prod);
		}

		

		System.out.println("----------This is a Fibonacci calculation----------");

		int old_n = 0;
		int next_n = 1;
		
		while(next_n <= 2000){

			next_n = next_n + old_n;
			old_n = next_n - old_n;
			System.out.println("fibonacci now is : " + next_n);


		}

		
		break; // This command will stop the loop when the number appears.
		continue;// this command will skip the number or validation and will continue.

	
		for(int i =0; i <10; i++){
			if (i == 5){
				break; // This command will stop the loop when the number appears.
			}
			System.out.println(i);
		}

	*/

		boolean[][] matrix= 
		{
			{false, true, false, false, false},
			{false, false, false, false, false}
		};

		search:
		for(int a =0; a < matrix.length; a++){
			System.out.print("A ");
			for(int b= 0; b < matrix[a].length; b++){
				if (matrix[a][b]){
					System.out.print("TRUE");
					break search;
				}
				System.out.print("B ");

			}
		}

	}
}