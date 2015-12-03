import java.util.Scanner;


public class _02SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] letters = input.split(" ");
		String previous = letters[0];
		for (int i = 0; i < letters.length; i++) {
			if (letters[i].equals(previous)) {
				System.out.print(letters[i]+ " ");
			}
			else {
				System.out.println();
				System.out.print(letters[i]+ " ");
			}
			previous=letters[i];
		}
	}
}
