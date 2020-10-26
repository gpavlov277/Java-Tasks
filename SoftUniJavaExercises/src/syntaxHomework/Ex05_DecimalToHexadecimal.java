package syntaxHomework;

import java.util.Scanner;

public class Ex05_DecimalToHexadecimal {
public static void main(String[] args) {
	Scanner console=new Scanner(System.in);
	int num=console.nextInt();
	console.close();
	System.out.println(Integer.toHexString(num).toUpperCase());
	System.out.println(Integer.toBinaryString(num).toUpperCase());
	
}
}
