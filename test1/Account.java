package test1;

public class Account {
	//필드
	int id;
	String password;
	String ownerName;
	int balance;
	//생성자
	Account(int id,String password,String ownerName){
		this.id=id;
		this.password=password;
		this.ownerName=ownerName;
		this.balance=0;
	}
	//메소드
	void deposit(int money) {
		balance += money;
	}
	int withdraw(int money,String password) {
		if(isCorrectPassword(password)) {
			if(balance>=money)
			balance -= money;			
			return balance;
		}else {
			return -1;
		}
	}
	int checkBalance(String password) {
		if(isCorrectPassword(password)) {
			return balance;
		}else {
			return -1; 
		}
	}
	boolean isCorrectPassword(String password) {
		return this.password.equals(password) ? true:false; 			
	}
	
	public static void main(String[] args) {	
		//계좌 생성
		Account account = new Account(1,"password!@#","park");
		//10만원 입금
		account.deposit(100000);
		//잔액 확인
		System.out.println(account.checkBalance("password!@#"));
		//2만원 출금
		account.withdraw(20000,"password!@#");
		//잔액확인
		System.out.println(account.checkBalance("password!@#"));
	}
}
