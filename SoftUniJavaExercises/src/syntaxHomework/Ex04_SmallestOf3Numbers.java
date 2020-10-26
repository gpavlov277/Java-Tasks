package syntaxHomework;

import java.util.Scanner;

public class Ex04_SmallestOf3Numbers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double a = console.nextDouble();
		double b = console.nextDouble();
		double c = console.nextDouble();
		console.close();

		if (a < b && a < c) {
			System.out.println(a);

		} else if (b < a && b < c) {
			System.out.println(b);

		} else
			System.out.println(c);
	}
}
