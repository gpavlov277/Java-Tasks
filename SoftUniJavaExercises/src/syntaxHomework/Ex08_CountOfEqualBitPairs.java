package syntaxHomework;

import java.util.Scanner;

public class Ex08_CountOfEqualBitPairs {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();

		console.close();
		int counter = 0;

		String binary = Integer.toBinaryString(n);
		char[] chars = binary.toCharArray();

		for (int i = 0; i <chars.length-1; i++) {
			if (chars[i] == chars[i+1]) {

				counter+=1;

				
			}
			continue;
		}
		System.out.println(counter);
	}
}
