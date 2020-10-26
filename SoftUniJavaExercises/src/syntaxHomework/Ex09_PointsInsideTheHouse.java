package syntaxHomework;

import java.util.Scanner;

public class Ex09_PointsInsideTheHouse {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		double X = console.nextDouble();
		double Y = console.nextDouble();
	
		console.close();


		double position = ((22.5 - 12.5) * (Y - 8.5) - (8.5 - 8.5) * (X - 12.5));

		System.out.println(position);

		double positionB = ((17.5 - 12.5) * (Y - 8.5) - (3.5 - 8.5) * (X - 12.5));

		System.out.println(positionB);
		
		
		double positionC =((17.5 - 22.5) * (Y - 8.5) - (3.5 - 8.5) * (X - 22.5));
		System.out.println(positionC);
		if(position<=0&& positionB>=0 &&positionC<=0)
			System.out.println("Inside");
		else System.out.println("Outside");
	}
}
