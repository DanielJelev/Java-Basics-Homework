import java.util.ArrayList;
import java.util.Scanner;


public class _04LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] letters = input.split(" ");
		int previous = Integer.parseInt(letters[0]);
		int nextValue =0;
		String result = "";
		int count =1;
		int maxCount=1;
		ArrayList<Integer> list = new ArrayList();
		for (int i = 0; i < letters.length; i++) {
			nextValue=Integer.parseInt(letters[i]);
			if (previous<nextValue+1) {
				result += nextValue + " ";
				count++;
			}
			else {
				
			}
			previous=nextValue;
		}
		System.out.println(result);
	}

}
