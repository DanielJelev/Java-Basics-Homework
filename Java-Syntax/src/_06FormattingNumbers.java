import java.util.Scanner;


public class _06FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		String convert = Integer.toHexString(a);
		String hex = convert.toUpperCase();
		String binaryConvert = Integer.toBinaryString(a);
		String binary = String.format("%10s", binaryConvert).replace(' ', '0');
		String decimalTwo = String.format("%.2f", b);
		String decimalThree = String.format("%.3f", c);
		System.out.printf("|%-10s|"+"%10s|"+"%10s|"+"%-10s|",hex,binary,decimalTwo,decimalThree);
	}

}
