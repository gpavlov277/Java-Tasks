package pack02simpleCalculations;

import java.util.Scanner;

public class Ex06_SquareAreoFromPonts {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	double y1=console.nextDouble();
	double x1=console.nextDouble();
	double y2=console.nextDouble();
	double x2=console.nextDouble();
	
	console.close();
	
	double sideA=Math.max(y1, y2)-Math.min(y1,y2);
	
	double sideB=Math.max(x1, x2)-Math.min(x1,x2);
	
	double resultArea=sideA*sideB;
	double resultPerimeter=2*(sideA+sideB);
	System.out.println(resultArea);
	System.out.println(resultPerimeter);
	
	
}
}
