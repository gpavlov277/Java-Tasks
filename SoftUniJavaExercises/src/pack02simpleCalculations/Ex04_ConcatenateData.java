package pack02simpleCalculations;

import java.util.Scanner;

public class Ex04_ConcatenateData {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.print("Enter your fusrt name ");
	String firstName = console.nextLine();
	System.out.print("Enter your second name ");
	String secondName = console.nextLine();
	System.out.print("Enter your age ");
	int age=Integer.parseInt(console.nextLine());
	System.out.print("Enter your town ");
	String town=console.nextLine();
	console.close();
	System.out.printf("You are %s %s, a %d - years old person from %s.\n",firstName,secondName,age,town);
	
	
	
}
}
