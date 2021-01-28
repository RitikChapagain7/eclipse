package cs19B;
import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("plz enter your marks");
		int marks = sc.nextInt();

		if (marks <=40) {
		System.out.println("failed");
		}else if (marks>=60 && marks <=70) {
		System.out.println("first division");
		}else if (marks>70) {
		System.out.println("distinction");
		}else {
		System.out.println("StackOverfow");
		}


		}

		

}
