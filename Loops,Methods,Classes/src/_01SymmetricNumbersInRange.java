import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;


public class _01SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		for (int i = start; i <= end; i++) {
			String number = Integer.toString(i);
			String reversed = "";
			char[] array = number.toCharArray();
			for (int j = array.length-1; j >=0; j--) {
				reversed+=array[j];
			}
			if (number.equals(reversed)) {
				System.out.println(reversed);
				
			}
		}
	}

}
