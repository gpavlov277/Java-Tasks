package syntaxHomework;

import java.util.Scanner;

public class Ex03_PointsInsideAFigure {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double x = console.nextDouble();
		double y = console.nextDouble();
		console.close();
		if ((x >= 12.5 && x <= 22.5) && (y >= 6 && y <= 8.5))
			System.out.println("Inside");

		else if (((x >= 12.5 && x <= 17.5) || (x >= 20 && x <= 22.5)) && (y >= 8.5 && y <= 13.5))
			System.out.println("Inside");
		else
			System.out.println("Outside");

	}
}
