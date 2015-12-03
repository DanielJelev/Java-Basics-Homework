import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _06CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		String word = scan.nextLine().toLowerCase();
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m = p.matcher(input);
		int count=0;
		while (m.find()) {
			if (m.group().equals(word)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
