import java.util.Scanner;
import java.util.TreeMap;

public class _11MostFrequentWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		String [] words = input.split("[^a-zA-Z]");
		TreeMap<String,Integer> result = new TreeMap<String,Integer>();
		for(int i=0;i<words.length;i++)
		{
			int value =0;
			if(!result.containsKey(words[i]))
			{
				result.put(words[i], value + 1);
			}
			else
			{
				value++;
				result.put(words[i], value + 1);
			}
			
		}
		int maxValue=0;
		for (String key : result.keySet()) {
			if (maxValue == 0) {
				maxValue = result.get(key);
			} else if (result.get(key) > maxValue) {
				maxValue = result.get(key);
			} else {
				continue;
			}
		}
		for (String key : result.keySet()) {
			if(maxValue==result.get(key))
			{
				System.out.println(key + " -> " + result.get(key) + " times");
			}
		}
			
	}

}