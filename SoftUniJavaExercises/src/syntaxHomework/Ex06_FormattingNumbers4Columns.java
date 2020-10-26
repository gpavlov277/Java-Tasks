package syntaxHomework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06_FormattingNumbers4Columns {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int a = console.nextInt();
		double b = console.nextDouble();
		double c = console.nextDouble();

		console.close();

		String aHexDecimal = Integer.toHexString(a).toUpperCase();
		String aBinary = Integer.toBinaryString(a);

		DecimalFormat df = new DecimalFormat("###.##");
		DecimalFormat df2 = new DecimalFormat("###.###");
		String bTwoDigits = df.format(b);
		String cThreeDigits = df2.format(c);

		String symbol = " ";
		String symbolZero = "0";

		int count = 10 - aHexDecimal.length();
		int countBin = 10 - aBinary.length();
		int countBSection = 10 - bTwoDigits.length();
		int countCSection = 10 - cThreeDigits.length();

		System.out.printf("|%s", aHexDecimal);

		System.out.print(symbol.repeat(count) + "|");

		System.out.print(symbolZero.repeat(countBin));
		System.out.print(aBinary + "|");

		System.out.print(symbol.repeat(countBSection) + bTwoDigits + "|");

		System.out.print(cThreeDigits);
		System.out.println(symbol.repeat(countCSection) + "|");

	}
}
