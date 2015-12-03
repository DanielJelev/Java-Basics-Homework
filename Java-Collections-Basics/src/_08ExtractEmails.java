import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _08ExtractEmails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Pattern p = Pattern.compile("([\\w\\.\\-_]+)?\\w+@[\\w-_]+(\\.\\w+){1,}");
		Matcher m = p.matcher(input);
		while(m.find()){
			System.out.println(m.group());
		}
	}

}
