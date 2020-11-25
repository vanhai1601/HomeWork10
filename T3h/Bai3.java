package T3h;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bai3 {
	public static void main(String[] args) {
		List<Character> list1 = new ArrayList<>();
		String characters = "qwertyuiopasdfghjklzxcvbnm";
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			list1.add(characters.charAt(random.nextInt(characters.length())));
		}
		System.out.println("Original list: ");
		for (Character list : list1) {
			System.out.print(list + " ");
		}
		List<Character> list2 = new ArrayList<>();
		for (int i = list1.size() - 1; i >= 0; i--) {
			list2.add(list1.get(i));
		}
		
		System.out.println("\n\nCopy list: ");
		for (Character list : list2) {
			System.out.print(list + " ");
		}
	}
}
