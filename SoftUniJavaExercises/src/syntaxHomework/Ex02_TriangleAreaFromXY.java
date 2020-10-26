package syntaxHomework;

import java.util.Scanner;

public class Ex02_TriangleAreaFromXY {
public static void main(String[] args) {
	Scanner console  = new Scanner(System.in);
	
	int aX=console.nextInt();
	int aY=console.nextInt();
	int bX=console.nextInt();
	int bY=console.nextInt();
	int cX=console.nextInt();
	int cY=console.nextInt();
	
	double area=aX*(bY-cY)+bX*(cY-aY)+cX*(aY-bY);
	Math.abs(area);
	System.out.printf("%.0f",area/2 );
	
	console.close();
	
}
}
