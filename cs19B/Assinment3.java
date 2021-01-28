package cs19B;
import java.util.Scanner;
public class Assinment3 {
	public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter which dice you want to roll, 6 or 10:");
        int diceNumber=sc.nextInt();
        diceRoll(diceNumber);
       
    }
public static void diceRoll(int diceNumber) {
    while(true) {
        double randomNumber=Math.random();
        randomNumber*=diceNumber;
        int dice=(int)randomNumber;
        dice++;
        System.out.println(dice);
        if (dice==diceNumber) {
            System.out.println("You won-->" +dice);
            break;
        }
        else if (dice==diceNumber/2) {
            System.out.println("You lost-->" +dice);
            break;
        }
       
    }
}

}
