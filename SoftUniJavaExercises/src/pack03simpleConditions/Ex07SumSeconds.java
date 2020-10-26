package pack03simpleConditions;

import java.util.Scanner;

public class Ex07SumSeconds {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	int secondsA= console.nextInt();
	int secondsB= console.nextInt();
	int secondsC= console.nextInt();
	console.close();
	
	int seconds=(secondsA+secondsB+secondsC);
	int minutes=seconds/60;
	
	int lastsec=seconds-(minutes*60);
	
	
	System.out.print(minutes+":");
	if(lastsec<10)
		System.out.print("0");
	System.out.println(lastsec);
	
	
	
	
	
	
}
}
