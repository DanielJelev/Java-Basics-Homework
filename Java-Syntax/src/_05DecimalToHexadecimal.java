import java.util.Scanner;


public class _05DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String convert = Integer.toHexString(number);
		String hex = convert.toUpperCase();
		System.out.println(hex);

	}

}
