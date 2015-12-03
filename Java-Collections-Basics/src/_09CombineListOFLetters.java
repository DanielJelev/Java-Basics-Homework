import java.util.ArrayList;
import java.util.Scanner;


public class _09CombineListOFLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Character> l1 = new ArrayList<>();
		ArrayList<Character> l2 = new ArrayList<>();
		ArrayList<Character> result = new ArrayList<>();
		String firstLine = scan.nextLine();
		String secLine = scan.nextLine();
		String [] first = firstLine.split(" ");
		String [] sec = secLine.split(" ");
		for(int i=0;i<first.length;i++)
		{
			l1.add(first[i].charAt(0));
		}
		for(int i=0;i<sec.length;i++)
		{
			l2.add(sec[i].charAt(0));
		}
		result.addAll(l1);
		for(int i=0;i<l2.size();i++)
		{
			if(result.contains(l2.get(i)))
			{
				continue;
			}
			else
			{
				result.add(l2.get(i));
			}
		}
		
		for (char c : result) {
			System.out.print(c + " ");
		}
	}

}