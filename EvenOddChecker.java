import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your an integer:");
		int integer = scanner . nextInt();
		 if (integer % 2 == 0)
		  System.out.println(integer + "Is an Even Number");   
		 else
	      System.out.println(integer +"Is an Odd Number");

	}

}