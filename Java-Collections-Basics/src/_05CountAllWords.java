import java.awt.List;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _05CountAllWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String[] input= scan.nextLine().split("[^a-zA-Z0-9]+");
//		System.out.println(input.length);	
		String input = scan.nextLine();
		Pattern p = Pattern.compile("[a-zA-Z]");
		Matcher m = p.matcher(input);
		int count = 0;
		while (m.find() ==true ) {
			count++;
		}
		System.out.println(count);
	}
}
