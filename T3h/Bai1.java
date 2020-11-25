package T3h;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai1 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Nhập chuỗi:");
			String input = scanner.nextLine();
			input = input.replaceAll(" ", "");
			String[] lists = input.split("");
			Set<String> hSets = new HashSet<String>();
			for (String list : lists) {
				hSets.add(list);
			}
			for (String hSet : hSets) {
				int count = 0;
				for (String list : lists) {
					if (list.equals(hSet)) {
						count += 1;
					}
				}
				System.out.println("Có " + count + " kí tự " + hSet);
			}
		}

	}
}
