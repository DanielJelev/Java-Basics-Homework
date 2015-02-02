import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class _06RandomHandsOf5Cards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] cardType = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K" , "A"};
		String[] suitType = {"♣", "♦", "♥" , "♠"};
		for (int i = 0; i < n; i++) {
			ArrayList<String> currentCards= new ArrayList<>();
			String suit ="";
			while (currentCards.size()<5) {
				suit = cardType[randInt(0, cardType.length-1)]+ suitType[randInt(0, suitType.length-1)];
				if (!currentCards.contains(suit)) {
					currentCards.add(suit);
				}
			}
			for (String string : currentCards) {
				System.out.print(string+" ");
			}
			System.out.println();
		}
			
		}
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
}
