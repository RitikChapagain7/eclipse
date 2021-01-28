
package cs19B;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		Scanner day=new Scanner (System.in);
		System.out.println("Please enter day value:");
		
		int daycode = day.nextInt();	
		String schedule;
		String name = null;
			
		switch (daycode) {
		
		case 1 :
			schedule= "Monday "+"Gym in the morning.";
			break;
		
		case 2 :
			schedule="Tuesday "+"Class after work.";
			break;
		
		case 3 :
			schedule="Wednesday "+"Meetings all day.";
			break;
			
		case 4 :
			schedule="Thursday "+"Work from home.";
			break;
			
		case 5 :
			schedule="Friday "+"Game night after work.";
			break;
			
		case 6 :
			schedule="Saturday "+"Free!";
			break;
			
		case 7 :
			schedule="Sunday "+"Free!";
			break;
			
		default :
			schedule="Invalid";
			
		}
	System.out.println(" Its "+schedule);	
	}

}
