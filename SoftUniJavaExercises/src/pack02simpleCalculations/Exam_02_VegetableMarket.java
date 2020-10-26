package pack02simpleCalculations;

import java.util.Scanner;

public class Exam_02_VegetableMarket {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	
	double priceVegetables=console.nextDouble();
	double priceFruits = console.nextDouble();
	double vegetablesKg = console.nextDouble();
	double fruitsKg=console.nextDouble();
	
	
	console.close();
	
	System.out.println(((priceVegetables*vegetablesKg)+(priceFruits*fruitsKg))/1.94);
	
	
}
}
