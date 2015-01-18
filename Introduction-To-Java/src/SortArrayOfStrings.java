import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArrayOfStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		for (int i = 0; i <=5; i++) {
			String letters = input.next("\\w+");
			list.add(letters);
		}
		Collections.sort(list);
		String[] city = list.toArray(new String[list.size()]);
		for (int i = 0; i < city.length; i++) {
			System.out.println(city[i]);
		}
	}
}