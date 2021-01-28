package cs19B;

public class LuckyNumber {
	public static void main(String[] args) {
		int r1=rollNumber(10) ;
		System.out.println("first 10 sided roll:"+r1);
		int r2=rollNumber(6);
		System.out.println("second 6 sided roll:"+r2);
	}
		public static int rollNumber(int x){
		// random numbers from 0 to almost 1
		
		double randomNumber = Math.random();
		
		// changing range from 0 to almost 10
		randomNumber =randomNumber *x;
		// Converting double to integer
		int randomInt=(int)randomNumber;
		
		// Shifting the range
		randomInt=randomInt+1;
		System.out.println("Final Random Number ranging (1-10):"+randomInt);
		return randomInt;
		
}

}
