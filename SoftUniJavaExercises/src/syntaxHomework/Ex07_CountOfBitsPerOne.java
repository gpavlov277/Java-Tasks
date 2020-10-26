package syntaxHomework;

import java.util.Scanner;

public class Ex07_CountOfBitsPerOne {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	int n=console.nextInt();
	int counter=0;
	String binary=Integer.toBinaryString(n).toString();
	char[] chars=binary.toCharArray();
	
	for (char ch :chars) {
		if (ch=='1')
			counter++;
		
	}
	System.out.println(counter);
	console.close();

}
}
