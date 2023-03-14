package study11_1;

import java.util.StringTokenizer;

public class StringTest {
	public static void main(String[] args) {
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
		String str = new String(bytes);
		System.out.println(str);

		str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		// "자바"없으면 "자바 없음"
		// 있으면 "자바"->"Java" 바꿔서 출력
		if (str.contains("자바") == false) {
			System.out.println("자바없음");
		} else {
			System.out.println(str.replaceAll("자바", "Java"));
		}

		// 이 한개의 문자열을 다 쪼개기
		// 1. split()

		str = "1,2,3,4,5,6,7,8,9,10";
		int res = 0;
		String[] token = str.split(",");
		for (int i=0;i<token.length;i++) {
			System.out.print(token[i]);
		}
		for (String s : token) {
			System.out.print(" "+s);
			res += Integer.parseInt(s);
		}
		System.out.println("\n"+res);
		res=0;

		StringTokenizer stk = new StringTokenizer(str, ",");
		while (stk.hasMoreTokens()) {
			int temp = Integer.parseInt(stk.nextToken());
			System.out.print(" "+temp);
			res += temp;
		}
		System.out.println();
		System.out.println(res);
	}
}
