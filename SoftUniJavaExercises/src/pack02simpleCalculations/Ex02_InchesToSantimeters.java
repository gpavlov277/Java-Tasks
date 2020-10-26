package pack02simpleCalculations;
import java.util.Scanner;

public class Ex02_InchesToSantimeters {
public static void main(String args[]) {
	Scanner console = new Scanner(System.in);
	System.out.print("Enter Inches= ");
	double inches=console.nextDouble();
	
	console.close();
	double santimeters=inches*2.54;
	System.out.println(inches+" inches = "+ santimeters);
	
}
}
