package pack03simpleConditions;

import java.util.Scanner;

public class Ex14TimeAfter15Minutes {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	int hour=console.nextInt();
	int mins=console.nextInt();
	
	console.close();
	int minsAfter=mins+15;
	int hoursAfter=hour;
	
	if(minsAfter>=60) {
		mins=minsAfter-60;
		hoursAfter+=1;
	}
	
	else
		mins+=15;
	if(hoursAfter==24)
		hoursAfter=0;
	System.out.print(hoursAfter+":");
	if(mins<10)
	System.out.print("0");
	System.out.println(mins);
}
}
