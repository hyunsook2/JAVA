package regex;

import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String[] args) {
		// 문자열 형태의 정규표현식을 정규식 패턴으로 변화
		String patternString = "^[0-9]*$";
		Pattern pattern = Pattern.compile(patternString);
		// 샘플 문자욜
		String txt1 = "123456";
		String txt2 = "1230숫자";

		boolean res1 = Pattern.matches("^[0-9]*$", txt1);
		System.out.println(res1);
		boolean res2 = Pattern.matches(patternString, txt2);
		System.out.println(res2);

		System.out.println(pattern.pattern());

		Pattern p2 = Pattern.compile(",");
		for (String s : p2.split("12,31,41")) {
			System.out.println(s);
		}
		Pattern p3 = Pattern.compile(",[0-9]{2},");
		for (String s : p2.split("12,31,41,41,55")) {
			System.out.println(s);
		}
		
		System.out.println(p2.asPredicate().test("12,23"));

	}
}
