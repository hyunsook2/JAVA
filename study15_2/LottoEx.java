package study15_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoEx {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		new LottoEx().lottoStart();
	}
	public void lottoStart() {
		while(true) {
			//탈출조건 ->메뉴
			//메뉴출력(구매,종료)
			lottoMenu();
			//메뉴입력
			System.out.println("메뉴선택:");
			int menu = scan.nextInt();
			if(menu==2) {
				System.out.println("종료");
				break;
			}else if(menu==1) {
				getLotto();
			}else {
				System.out.println("입력오류");
			}
			//반복 끝
		}
	}
	public void getLotto() {
		//구입금액입력
		System.out.println("금액입력:");
		int money = scan.nextInt();
		if(money<1000) {
			System.out.println("1000원 이상을 넣어주세요.");
			return;
		}else if(money>100000) {
			System.out.println("십만원 초과 금액은 구매불가");
			return;
			
		}
		//로또 번호 생성
		makeLotto(money);
		//기타 정보
		System.out.println("받은금액:"+money+"원");
		System.out.println("거스름돈:"+(money%1000)+"원");
		
	}
	public void makeLotto(int money) {
		ArrayList<TreeSet<Integer>> lottoList = new ArrayList<>();
		//로또번호 생성->로또출력
		int count = money/1000;
		for(int i=0;i<count;i++) {
			TreeSet<Integer> lottoSet = new TreeSet<>();
			while(lottoSet.size()<6) {
				lottoSet.add((int)(Math.random()*45+1));
			}
			lottoList.add(lottoSet);
		}
		System.out.println("로또 번호 출력");
		for(TreeSet<Integer> lotto:lottoList) {
			System.out.println("로또번호 "+lotto);
		}
		for(int i=0;i<count;i++) {
			TreeSet<Integer> lottoSet = new TreeSet<>();
			while(lottoSet.size()<6) {
				lottoSet.add((int)(Math.random()*45+1));
			}
			System.out.println("로또번호:"+lottoSet);
		}	
	}
	public void lottoMenu() {
		System.out.println("Lotto 판매점");
		System.out.println("==메뉴======");
		System.out.println("1.Lotto 구입");
		System.out.println("2.종료");
		System.out.println("===========");
		
	}
}