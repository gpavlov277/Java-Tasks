package pack03simpleConditions;

import java.util.Scanner;

public class Ex06BonusScore {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	double mainScore=console.nextDouble();
	double bonusScore=0;
	console.close();
	
	if(mainScore%2==0)
		bonusScore=1;
	if(mainScore%10==5)
	bonusScore=2;
	
	if(mainScore<=100)
		bonusScore+=5;
	else if(mainScore>100 && mainScore<=1000)
		bonusScore+=mainScore*0.20;
	else if(mainScore>1000)
		bonusScore+=mainScore*0.10;
	 System.out.println(bonusScore);
	 System.out.println(bonusScore+mainScore);
}
}
