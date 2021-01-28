package cs19B;

import java.util.Scanner;

public class SmartCoffee {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("plz enter your passcode");
		
		int passcode = sc.nextInt();
		String coffeeType;
		
		if (passcode ==555) {
		coffeeType ="Espresso";
		
		}else if (passcode ==312) {
		coffeeType="vannila latte";
		
		}else if (passcode ==629) {
		coffeeType="cappuccino";
		
		}else {
		coffeeType="Unknown";
		}
		
		
		System.out.println("your drink is " + coffeeType);
		}

		
	}

