package T3h;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Bai2 {
	public static void main(String[] args) {
		List<Integer> lists = new LinkedList<Integer>();
		Random random = new Random();
		int total = 0;
		for (int i = 0; i < 25; i++) {
			lists.add(random.nextInt(101));
		}
		System.out.println("LinkedList:");
		for (Integer list : lists) {
			System.out.print(list + " ");
		}

		System.out.println("LinkedList:");
		for (Integer list : lists) {
			System.out.print(list + " ");
		}

		System.out.println("\n\nSắp xếp giảm dần:");
		Collections.sort(lists, Collections.reverseOrder());
		for (Integer list : lists) {
			System.out.print(list + " ");
			total += list;
		}

		System.out.println("\n\nTrung bình = " + (total * 1.0) / (lists.size()));
	}
}
