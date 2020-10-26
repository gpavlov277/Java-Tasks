import java.util.Scanner;

public class SquareOfStars {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.close();
		String stars = "*";
		String spaces = " ";
		System.out.println(stars.repeat(count));
		for (int i = 0; i < count - 2; i++) {
			System.out.print("*");
			System.out.print(spaces.repeat(count - 2));
			System.out.println("*");
		}
		System.out.println(stars.repeat(count));
	}
}