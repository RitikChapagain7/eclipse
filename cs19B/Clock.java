package cs19B;

import java.util.Scanner;
import java.time.LocalTime;

public class Clock {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Set the hour clock");
		int hr =sc.nextInt();
		
		System.out.println("set the min clock");
		int min =sc.nextInt();
		alarm(hr,min);
	}
	public static void alarm(int hr,int min) {
		boolean on=checkAlarm(hr,min);
		boolean off=checkAlarm(hr,min);
		
		while(on) {
			beep();
			on=checkAlarm(hr,min);
		}
		while(off) {
			off=checkAlarm(hr,min);
			over();
		}

		
	}
	public static boolean checkAlarm(int hr,int min) {
		LocalTime now = LocalTime.now(); 
		
		if(hr==now.getHour() && min==now.getMinute()) {
			return true;
		}
		return false;
		
	}
	public static void beep() {
		

		System.out.println("beep beep beep");
		
		//System.out.println("hour"+now.getHour());
		//System.out.println("min"+now.getMinute());
	}
	public static void over() {
		System.out.println("alarm offfffffffffffffff");
		
	}
}
