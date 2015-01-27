import java.util.Scanner;


public class _04TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double smallest = Math.min(a,Math.min(c, b));
		System.out.println(smallest);
	}

}
