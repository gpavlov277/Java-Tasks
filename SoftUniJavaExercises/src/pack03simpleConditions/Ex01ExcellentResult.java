package pack03simpleConditions;

import java.util.Scanner;

public class Ex01ExcellentResult {
public static void main(String[] args) {
	Scanner console =new Scanner(System.in);
	double grade=console.nextDouble();
	console.close();
	if (grade>=5.50) {
		System.out.println("Excellent!");
	}
	else
		System.out.println("Not excellent.");
}
}
