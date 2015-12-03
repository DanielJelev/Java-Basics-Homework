import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


public class _10ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().toLowerCase().trim().split("[^a-zA-Z]");
		TreeSet<String>letters = new TreeSet<String>();
		letters.addAll(Arrays.asList(input));
		for (String str : letters) {
			System.out.println(str);
		}
	}

}
