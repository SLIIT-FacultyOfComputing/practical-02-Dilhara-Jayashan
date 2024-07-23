import java.util.Scanner;

public class string {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter first name:");
		String first = keyboard.nextLine();
		System.out.print("Enter middle name:");
		String middle = keyboard.nextLine();
		System.out.print("Enter last name:");
		String last = keyboard.nextLine();
		
		System.out.println(last+"," +first+" " +middle);
		
		StringBuilder fulname1 = new StringBuilder();
		fulname1.append(last+"," +first+" " +middle);
		

	}
}
