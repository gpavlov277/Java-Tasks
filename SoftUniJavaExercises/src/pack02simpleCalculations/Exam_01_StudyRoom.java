package pack02simpleCalculations;

import java.util.Scanner;

public class Exam_01_StudyRoom {
public static void main(String[] args) {
	Scanner console=new Scanner(System.in);
	double h=0.0;
	double w =0.0;
	do {
		h = console.nextDouble();
		w = console.nextDouble();
		
	}while(h<3 || w>100);
	console.close();
	
	double countOnH= (h*100)/120;
	countOnH=Math.floor(countOnH);
	
	
	double countOnW=((w*100)-100)/70;
	countOnW=Math.floor(countOnW);
	
	double maxSpaces= (countOnH*countOnW)-3;
	System.out.printf("%.0f",maxSpaces);
}
}
