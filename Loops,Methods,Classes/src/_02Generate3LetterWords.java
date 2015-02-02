import java.util.Scanner;


public class _02Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letter = input.next();
		String words = "";
		char[] array = letter.toCharArray();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				for (int j2 = 0; j2 < array.length; j2++) {
					words = ""+array[i]+ array[j]+array[j2];
					System.out.print(words + " ");
					
				}
			}
		}
		
	}
}
