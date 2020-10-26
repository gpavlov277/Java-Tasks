package pack03simpleConditions;

import java.util.Scanner;

public class Ex18PoolPipe {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int poolVolume = console.nextInt();
		int firstPipe = console.nextInt();
		int secondPipe = console.nextInt();
		double hours = console.nextDouble();
		console.close();

		firstPipe = (int) (firstPipe * hours);
		secondPipe = (int) (secondPipe * hours);

		double sumOfPipes = (double) secondPipe + (double) firstPipe;

		if (sumOfPipes > poolVolume) {
			System.out.printf("For %.2f hours the pool overflows with: ", hours);
			System.out.println(sumOfPipes - poolVolume + " liters.");
		} 
		else if (sumOfPipes < poolVolume) {
			double poolPercents = (sumOfPipes / poolVolume) * 100;

			double firstPipePercent = (firstPipe / sumOfPipes) * 100;
			double secondPipePercent = (secondPipe / sumOfPipes) * 100;
			System.out.printf("The pool is %.0f ", poolPercents);
			System.out.print("% full. ");
			System.out.printf("Pipe 1: %.0f", firstPipePercent);
			System.out.print("%. ");
			System.out.printf("Pipe 2: %.0f", secondPipePercent);
			System.out.print("%.");
		}
	}

//System.out.printf("The pool is %.0f% full. Pipe 1: %.0f. Pipe 2: %.0f .",poolPercents,firstPipePercent,secondPipePercent);

}
