package study01;

public class Variable {
	public static void main(String[] args) {
		// 변수 선언
		int 숫자십 = 10;
		System.out.println(숫자십);
		// 진수 표현
		int binNum = 0B1010;
		System.out.println(binNum);
		int 십일 = 013;
		System.out.println(십일);
		int 이십육 = 0x1A;
		System.out.println(이십육);
		// String binary = Integer.toBinaryString(num);
		// System.out.println("2진수:"+binary);
		int sum = 숫자십 + binNum + 십일 + 이십육;
		System.out.println("sum:" + sum);
		// 변수명 가독성
		byte byteData = -128;
		System.out.println(byteData);
		byteData = (byte) -129;
		System.out.println(byteData);

		int integerNum = 1234567; // 기본이 int라서 롱타입만 L을 붙히면된다.
		long longNum = 22324123412L; // 뒤에 L을 붙혀서 롱타입으로 설정(int를 벗어나기때문에)
		short shortNum = 1212; // int에 넣는 short라서 그냥넣어도됨

		char ch = 'A'; // 아스키코드
		System.out.println(ch);
		ch = 66;
		System.out.println(ch);
		int chin = 'A';
		System.out.println(chin);

		double doubleNum = 3.14;
		float floatNum = 3.14f; // 기본이 더블이니까 F를 뒤에 붙혀야한다.
		System.out.println(doubleNum + "A" + floatNum);

		final double PI = 3.1419; // 상수
		// PI = 234.1; //상수는 재할당 불가
		System.out.println(PI);

		int iNum = binNum;
		System.out.println(iNum);
		iNum = (int) longNum;
		System.out.println(longNum + " " + iNum);
		iNum = (int) floatNum;
		System.out.println(floatNum + "+" + iNum);
		doubleNum = floatNum + iNum;
		System.out.println(doubleNum);

		floatNum = 0.9f;

		int iNum1 = (int) (doubleNum + floatNum);
		int iNum2 = (int) doubleNum + (int) floatNum;
		System.out.println(iNum1 + "  " + iNum2);
	}
}
