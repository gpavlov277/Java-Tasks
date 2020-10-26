package pack03simpleConditions;

import java.util.Scanner;

public class Ex17PriceForTransport {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		double kilometers = console.nextDouble();
		String period = console.next();
		console.close();
		double finalPrice = 0;
		if (kilometers <20)

			if (period.equals("day"))
				finalPrice = 0.70 + kilometers * 0.79;
			else if (period.equals("night"))
				finalPrice = 0.70 + kilometers * 0.90;

		
		if (kilometers >= 20 && kilometers<100)
			finalPrice =  kilometers * 0.09;
			
		
		if (kilometers >=100)

			
				finalPrice = kilometers * 0.06;
	
		System.out.printf("%.2f",finalPrice);
	}
}
