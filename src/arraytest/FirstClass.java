package arraytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class FirstClass {
	public static void main(String args[]) {

		String[] suit = { "S", "D", "C", "H" };
		String[] value = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" };
		//1. Create an array of 52 cards S1-S13, D1-D13, C1-C13, H1-H13
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < value.length; j++) {
				al.add(suit[i] + value[j]);
			}
		}		
	//	System.out.println(al);
		 
		//2. Shuffle the array
		Random random=new Random();
		for(int i=al.size();i>0;i--) {
			int rno=random.nextInt(i+1);
			 Collections.swap(al, 1, rno);
		}
		//System.out.print(al);
		
		//3.Pick top 13 cards and insert in another array
		ArrayList<String> al2 = new ArrayList<String>();
		for(int i=0;i<13;i++) {
			al2.add(al.get(i));
		}
		
		//4. Print the array
		//System.out.print(al2);
		
		
		//5. Sort the 13 cards array in Suit wise and value wise
		Collections.sort(al2);		
		System.out.println(al2);
		
		//6. Print the final sorted array
		Collections.sort(al);		
		//System.out.print(al);
		
		
		
	}
}
