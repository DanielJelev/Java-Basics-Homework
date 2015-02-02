import java.util.Scanner;


public class _05AngleUnitConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = 0; i < input; i++) {
			double value = scan.nextDouble();
			String letter = scan.next("\\w+");
			if (letter.equals("rad")) {
				double radToDeg = (180/Math.PI)*value;
				System.out.println(String.format("%.6f deg", radToDeg));
			}
			else if (letter.equals("deg")) {
				double degToRad = (value*Math.PI)/180;
				System.out.println(String.format("%.6f rad", degToRad));
			}
			
			
		}
	}

}
