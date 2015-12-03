import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _07CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String pattern = scan.nextLine();
		pattern = "(" + pattern;
		Pattern p = Pattern.compile(pattern + ")");

		int count = 0;
		Matcher matcher = p.matcher(input);
		while (matcher.find()) {
			count++;
			int firstIndex = matcher.start();
			matcher.region(firstIndex + 1, input.length());
		}
		System.out.print(count);
	}
}