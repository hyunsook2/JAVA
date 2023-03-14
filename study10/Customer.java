package study10;

public class Customer implements Buy,Sell {
	//추상메소드 구현
	@Override
	public void sell() {
		System.out.println("고객판매");
	}
	@Override
	public void buy() {
		System.out.println("고객구매");
	}
	//중복된 메소드의 재정의
	@Override
	public void order() {
		System.out.println("고객 주문");
	}
	//추가 메소드
	public void comp() {
		System.out.println("고객 불만");
	}
}