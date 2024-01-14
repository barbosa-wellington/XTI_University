public class ChallengeFibo{


		public static void main (String [] agrs){



			int new_fibonacci = 1;
			int old_fibonacci = 0;
			

			System.out.println("old_fibonacci: " + old_fibonacci + " new_fibonacci: " + new_fibonacci );

			while(new_fibonacci < 100){

				new_fibonacci = new_fibonacci + old_fibonacci;
				old_fibonacci = new_fibonacci - old_fibonacci;
				System.out.println(new_fibonacci);


			}

		}
	
}