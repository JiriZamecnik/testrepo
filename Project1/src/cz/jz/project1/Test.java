package cz.jz.project1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("Start.");
		List<Integer> list = Arrays.asList(1, 2, 3, 5, 4, 8, 6, 7, -1, 2, 16, 11, 13, -15, 45);

		System.out.println(list);

		list.sort(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1.compareTo(i2);
			}
		});
		System.out.println(list);

		System.out.println("Stop.");
	}

}
