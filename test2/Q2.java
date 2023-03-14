package test2;

import java.util.ArrayList;

public class Q2 {
	public static void main(String[] args) {
		int[] source = { 9, 12, 14, 21, 16, 13 };
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		for (int s : source) {
			if (s % 2 == 0) {
				even.add(s);
			} else {
				odd.add(s);
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}