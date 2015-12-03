import java.util.Arrays;
import java.util.Scanner;


public class _01SortArrayOfNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputCount = scan.nextInt();
		scan.nextLine();
		String inputs = scan.nextLine();
		String[] array = inputs.split(" ");
		int[] numbers = new int[inputCount];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(array[i]);
		}
		Arrays.sort(numbers);
		for (int num : numbers) {
			System.out.println(num);
		}
	}
}
