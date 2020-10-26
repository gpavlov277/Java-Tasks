package pack02simpleCalculations;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

 
public class Ex08_ThousandDaysAfterBirth {
public static void main(String[] args) {
	Scanner console=new Scanner(System.in);
	String date=console.next();

	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	console.close();
	
	LocalDate BG= LocalDate.parse(date,format);
	
	LocalDate plusDays = BG.plus(Period.ofDays(999));
	String formatedPlusDays= plusDays.format(format);
	
	System.out.println(formatedPlusDays);
	
	
	
	 
	
}
}
