package pack02simpleCalculations;

import java.util.Scanner;

public class Ex03_NameGreeting {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = console.nextLine();
		System.out.println("Hello, " + name+"!");

		console.close();

	}
}
