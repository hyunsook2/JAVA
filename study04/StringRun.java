package study04;

import java.util.Arrays;
import java.util.StringTokenizer;

import study01.Sysout;

public class StringRun {

	public static void main(String[] args) {
		//String class
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1==str2);
		String str3 = "bcd";
		String str4 = "bcd";
		System.out.println(str3==str4);
		String a = "hello";
		String b = "world";
		String c = "hello";
		String d = new String("hello");
		
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		
		//indexOf() 해당문자열의 시작 인덱스
		String e = "Hello Java!!";
		System.out.println(e.indexOf("Jav")); //문자열 시작하는 인덱스가 몇번째냐 0123~ 6번부터시작
		System.out.println(e.contains("va")); //검색기능 va가 포함이냐 아니냐 T/F
		//charAt() 특정 위치의 문자 반환
		System.out.println(e.charAt(4)); // 특정위치의 문자 반환 4번째칸 o
		System.out.println(e.replaceAll("Java", "HTML"));//특정단어를 교체 (앞에껄 뒤로)
		String f = e.replaceAll("Java", "HTML");
		System.out.println(f);
		
		System.out.println(e.substring(1,7));// 앞부터 뒤까지 출력
		
		System.out.println(e.toUpperCase());//대문자출력
		System.out.println(e.toLowerCase());//소문자출력
		System.out.println(e.toString());
		
		String str = new String ("abcd");
		System.out.println(str.compareTo("bcde"));
		System.out.println(str.compareTo("abcd"));
		System.out.println(str.compareTo("AbCd"));
		System.out.println(str.compareToIgnoreCase("AbCd"));
		
		//
		System.out.println(e.concat(str));
		System.out.println(e+str);
		
		int num=3,num2=4;
		String str5 = "5",str6="6";
		char ch ='4',ch2='5';
		System.out.println(num+num2);
		System.out.println(str5+str6);
		System.out.println(str5+num);
		System.out.println(num+str5);
		System.out.println(ch+ch2);
		System.out.println(ch+num2);
		System.out.println(num2+ch);
		System.out.println(3+5);
		//trim()문자열의 맨앞 맨 뒤의 공백 제거
		String g = "     Java    Java    ";
		System.out.print("|||");
		System.out.print(g.trim());
		System.out.println("|||");
		//length() isEmpty()
		System.out.println(g.length());
		System.out.println(g.isEmpty());
		//split
		String test = "이 문장은 문자열- 입니다./This is the String.";
		String[] token = test.split(" ");
		System.out.println(Arrays.toString(token));
		token = test.split("");
		System.out.println(Arrays.toString(token));
		token = test.split("i");
		System.out.println(Arrays.toString(token));
		token = test.split("-");
		System.out.println(Arrays.toString(token));
		//StringTokenizer class
		//기본
		//StringTokenizer stk = new StringTokenizer(test);
		//StringTokenizer stk = new StringTokenizer(test,"-");
		StringTokenizer stk = new StringTokenizer(test,"-",true);
		
		System.out.println(stk.countTokens());
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}

}
