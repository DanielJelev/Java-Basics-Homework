import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class _07DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SimpleDateFormat formatDate = new SimpleDateFormat("dd-mm-yyyy");
		String firstDate = input.nextLine();
		String secondDate = input.nextLine();
		Date dateOne = null;
		Date dateTwo = null;
		try {
	         dateOne = formatDate.parse(firstDate); 
	         dateTwo = formatDate.parse(secondDate);
	      } catch (ParseException e) { 
	         System.out.println("Parse Exception");
	      }
		long diff = dateTwo.getTime() - dateOne.getTime();
		long days=diff/86400000;
		days=days%86400+10;
		System.out.println(days);
	}

}
