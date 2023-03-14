package test1;

import java.util.Random;
import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {

		Random random = new Random();
		try (Scanner scanner = new Scanner(System.in)) {
			// 게임에서 사용할 변수
			int com1, com2, com3, com4;
			int user1, user2, user3, user4;
			int randomCnt = 0;// 난수생성 카운트
			int gameCount = 0;// 게임 카운트
			int strikeCnt = 0, ballCnt = 0;// 스크라이크,볼 카운트

			// 게임전체반복
			while (true) {
				// 중복되지 않는 3개의 난수생성
				while (true) {
					// 몇번만에 난수가 생성되는지 확인
					randomCnt++;
					// 1~9사이의 난수생성
					com1 = random.nextInt(100) % 9 + 1;
					com2 = random.nextInt(100) % 9 + 1;
					com3 = random.nextInt(100) % 9 + 1;
					com4 = random.nextInt(100) % 9 + 1;
					if (!(com1 == com2 || com2 == com3
						||com3 == com1 || com1 == com4
						||com2 == com4 || com3 == com4)) {
						break;
					}
				} //// while end

				System.out.println();

				while (true) {
					System.out.println("4개의정수를 입력하세요(1~9)");
					System.out.println("스페이스로 구분하시고 마지막에 Enter를 눌러주세요");
					user1 = scanner.nextInt();
					user2 = scanner.nextInt();
					user3 = scanner.nextInt();
					user4 = scanner.nextInt();

					// 게임카운트 1회 증가
					gameCount++;

					// 판단1 - 스크라이크(숫자와 위치까지 일치)
					if (com1 == user1)
						strikeCnt++;
					if (com2 == user2)
						strikeCnt++;
					if (com3 == user3)
						strikeCnt++;
					if (com4 == user4)
						strikeCnt++;
					// 판단2 - 볼(숫자는 일치하나 위치가 다를때)
					if (com1 == user2 || com1 == user3 || com1 == user4)
						ballCnt++;
					if (com2 == user1 || com2 == user3 || com2 == user4)
						ballCnt++;
					if (com3 == user1 || com3 == user2 || com3 == user4)
						ballCnt++;
					if (com4 == user1 || com4 == user2 || com4 == user3)
						ballCnt++;
					// 게임종료판단
					if (strikeCnt == 4) {
						System.out.println("4스트라이크 게임종료");
						System.out.println(gameCount + "번만에 맞추셨습니다.");
						break;// 루프탈출
					} else {
						// 하나도 못맞추는 경우
						if (strikeCnt == 0 && ballCnt == 0) {
							System.out.println("아웃입니다");
						} else {
							System.out.printf("%d스트라이크, %d볼\n", strikeCnt, ballCnt);
						}

						strikeCnt = 0;
						ballCnt = 0;
					}
				}

			}
		}
	}
}