public class Fluxo {
	
	public static void main (String [] args){



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




	}



}