package arraytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FirstClass {
	public static void main(String args[]) {

		String[] suit = { "S", "D", "C", "H" };
		String[] value = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" };
		// 1. Create an array of 52 cards S1-S13, D1-D13, C1-C13, H1-H13
		List<String> cards = new ArrayList<>();
		for (String s : suit) {
			for (String v : value) {
				cards.add(s + v);
			}
		}
		// System.out.println(cards);

		// 2. Shuffle the array
		Collections.shuffle(cards);
		 System.out.println(cards);

		// 3.Pick top 13 cards and insert in another array
		List<String> top13Cards = cards.subList(0, 12);

		// 4. Print the array
		 System.out.println(top13Cards);

		// 5. Sort the 13 cards array in Suit wise and value wise

		// 1).Suit wise
		Collections.sort(top13Cards);
		System.out.println(top13Cards);

		// 2). Value wise
		Collections.sort(top13Cards, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return extractInt(o1) - extractInt(o2);
			}

			int extractInt(String s) {
				String num = s.replaceAll("\\D", "");
				// return 0 if no digits found
				return num.isEmpty() ? 0 : Integer.parseInt(num);
			}
		});
		System.out.println(top13Cards);

		// 6. Print the final sorted array
		 Collections.sort(cards);
		 System.out.print(cards);
	}
}
