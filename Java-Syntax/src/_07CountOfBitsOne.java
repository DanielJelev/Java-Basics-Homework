import java.util.Arrays;
import java.util.Scanner;


public class _07CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = 0;
		int n = input.nextInt();
		String binary = Integer.toBinaryString(n);
		char[] array = binary.toCharArray();
		/*for (int i = 0; i < array.length; i++) {
			if (array[i]=='1') {
				t+=1;
			}
		}*/
		Arrays.sort(array);
		String str=new String(array);
		System.out.println(str.length()-str.indexOf("1"));
	}

}
