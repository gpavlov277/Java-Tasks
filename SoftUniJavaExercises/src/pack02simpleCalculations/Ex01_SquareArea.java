package pack02simpleCalculations;

import java.util.Scanner;

public class Ex01_SquareArea {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("Enter side A= ");
		int a=console.nextInt();
		System.out.print("Enter side B= ");
		int b=console.nextInt();
		console.close();
		int result = a*b;
		System.out.println("Area is " + result);
	}
}
