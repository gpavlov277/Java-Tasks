package pack02simpleCalculations;

import java.util.Scanner;

public class Ex05_CircleArea {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.print("Enter radius r= ");
	double r=console.nextDouble();
	
	System.out.println("Perimeter= "+ 2*Math.PI*r);
	System.out.println("Area= "+ Math.PI*r*r);
	console.close();
}
}
