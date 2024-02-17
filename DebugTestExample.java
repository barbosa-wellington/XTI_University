

public class DebugTestExample {

	
	int result;
	
	public int squareRoot(int num) {
		
		int nroot = 0, evenN = 1;
		while(num >= evenN) {
			
			num -= evenN;
			evenN += 2;
			++nroot;
		
			System.out.println(nroot + " "+ evenN + " "+ num + " ");
		}
		
		return num;
		
	}
	
	
	public static void main(String [] args) {
		
		int numberA = 16;
		DebugTestExample example1 = new DebugTestExample();
		
		int sroot = example1.squareRoot(numberA);
		
		if(sroot == 4) {
			System.out.println("The squreroot is correct!");
			
		}
		
		
		
	}
	
}
