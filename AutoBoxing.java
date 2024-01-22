public class AutoBoxing {
	public static void main(String [] args){

		// version 5 of java 
		Integer  x = new Integer(555);

		// In the old Java version to be able to incresment the number x
		// the programmer needed to unpakage the variable
		int a = x.intValue();
		a++;

		x = new Integer(a);// re-pakage
		System.out.println(x.intValue());

		// The new version
		Integer j = 555;
		j++; //umboxng, incrementation, repakage
		System.out.println(j);

	}
}