import java.util.ArrayList;
import java.util.Scanner;


public class _03LargestSequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] letters = input.split(" ");
		String previous = letters[0];
		String longestWord ="";
		int count = 1;
		int maxCount=1;
		if (letters.length>1) {
			for (int i = 1; i < letters.length; i++) {
				if (letters[i].equals(previous)) {
					count++;
					if (count>maxCount) {
						maxCount=count;
						longestWord = previous;
					}
				}
				else {
					count=1;
					previous=letters[i];
				}
			}
			for (int i = 0; i < maxCount; i++) {
				System.out.print(longestWord + " ");
			}
		}
		else {
			System.out.println(letters[0]);
		}
	}
}
