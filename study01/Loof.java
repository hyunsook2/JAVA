package study01;

public class Loof {

	public static void main(String[] args) {
		int num = 1; // 초기화
		int sum = 0; // 합계

		while (num <= 10) { // 조건식
			sum += num;
			num++; // 증감식
		}
		System.out.println("합계:" + sum); // while문은 조건이안맞으면 아예 실행안함

		num = 1; // 초기화
		sum = 0; // 합계

		do {
			sum += num;
			num++; // 증감식
		} while (num <= 10); // 조건식
		System.out.println("합계:" + sum); // do문은 조건이 안맞아도 첫번째꺼 한번 실행함

		sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합계:" + sum); // for문

		// 구구단
		for (int dan = 2; dan <= 9; dan++) {
			for (int t = 1; t <= 9; t++) {
				System.out.println(dan + "X" + t + "=" + (dan * t));
			}
			System.out.println();
		}

		int dan = 2;
		while (dan <= 9) {
			int t = 1;
			while (t <= 9) {
				System.out.println(dan + "x" + t + "=" + (dan * t));
				t++;
			}
			System.out.println();
			dan++;
		}

		for (int i = 3; i <= 9; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}

		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.println("합계" + total);

		total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue;
			}
			total += i;
		}
		System.out.println("짝수합" + total);

		total = 0;
		for (int i = 2; i <= 100; i += 2) {
			total += i;
		}
		System.out.println("홀수합" + total);

		for (dan = 1; dan <= 9; dan++) {
			for (int t = 1; t <= 9; t++) {
				if (dan == 5) {
					break;
				}
				System.out.println(dan + "X" + t + "=" + dan * t);
			}
			System.out.println();
		}

		out: for (dan = 2; dan <= 9; dan++) {
			for (int t = 1; t <= 9; t++) {
				if (dan == 5) 
					break out;
				System.out.println(dan + "X" + t + "=" + dan * t);
			}
			System.out.println();
		}
	}
}
