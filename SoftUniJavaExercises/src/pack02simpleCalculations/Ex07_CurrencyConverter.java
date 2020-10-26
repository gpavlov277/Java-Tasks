package pack02simpleCalculations;

import java.util.Scanner;

public class Ex07_CurrencyConverter {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		double amount = console.nextDouble();
		String currencyOne = console.next();
		String currencyTwo = console.next();
	
		console.close();
		
		
		
		double result=0,bgn=0;
		
		
		if (currencyOne.equals("USD")) {bgn=amount*1.79540;}
		if (currencyOne.equals("BGN")) {bgn=amount*1;}
		if (currencyOne.equals("EUR")) {bgn=amount*1.95583;}
		if (currencyOne.equals("GBP")) {bgn=amount*2.53405;}
		
		
		if(currencyTwo.equals("BGN")) {result=bgn*1;}
		if(currencyTwo.equals("EUR")) {result=bgn/1.95583;}
		if(currencyTwo.equals("USD")) {result=bgn/1.79549;}
		if(currencyTwo.equals("GBP")) {result=bgn/2.53405;}
			
			
			
		System.out.printf("%.2f %s" ,result,currencyTwo);
		
		}

	}

