package study15_2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		boolean result = isAnagram(a, b);
		System.out.print("두단어는 : ");
		System.out.println(result ? "Anagram이다." : "Anagram이 아니다.");
	}
	static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (a.length() != b.length()) {
			return false;
		}
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();
		Arrays.sort(aArray);
		Arrays.sort(bArray);
		
		return Arrays.equals(aArray, bArray);
	}
}

