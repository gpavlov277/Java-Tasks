import java.util.Scanner;

public class RectangleArea {
public static void main(String[] args) {
	System.out.print("Strna A= ");
	Scanner console= new Scanner(System.in);
	int a=Integer.parseInt(console.nextLine());
	System.out.print("Strana B= ");
	int b=console.nextInt();
	console.close();
	int result=a*b;
	System.out.println(result);
}
}
