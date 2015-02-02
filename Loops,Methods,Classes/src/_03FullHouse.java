
public class _03FullHouse {

	public static void main(String[] args) {
		String[] cardType = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K" , "A"};
		String[] suitType = {"♣", "♦", "♥" , "♠"};
		int count = 0;
		for (int i = 0; i < cardType.length; i++) {
			for (int i1 = 0; i1 < suitType.length; i1++) {
				for (int i2 = i1+1; i2 < suitType.length; i2++) {
					for (int i3 = i2+1; i3 < suitType.length; i3++) {
						if (!suitType[i1].equals(suitType[i2])&&!suitType[i1].equals(suitType[i3])&&!suitType[i3].equals(suitType[i2])) {
							for (int j = 0; j < cardType.length; j++) {
								if (!cardType[j].equals(cardType[i])) {
									for (int j1 = 0; j1 < suitType.length; j1++) {
										for (int j2 = j1+1; j2 < suitType.length; j2++) {
											if (!suitType[j1].equals(suitType[j2])) {
												count++;
												System.out.println("("+cardType[i]+suitType[i1]+cardType[i]+suitType[i2]+cardType[i] +suitType[i3]+ cardType[j]+suitType[j1]+cardType[j]+suitType[j2]+")");
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
		}
		System.out.println(count);
	}
	
}
