package study02;

class Birthday {
	// 필드 멤버변수
	private int date;
	private int month;
	private int year;
	// 생성자
	public Birthday() {
		//this.year = 1996;this.month = 8;this.date =27;
		this(1996,8,27);
	}

	public Birthday(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public Birthday(double d) {
	}

	// 변수 관련 메소드 getter setter
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String showBirthday() {
		return year + "년" + month + "월" + date + "일";
	}
}

public class BirthData {
	public static void main(String[] args) {
		Birthday day1 = new Birthday();
		System.out.println(day1.getDate());
		System.out.println(day1.getYear());
		day1.setYear(2000);
		System.out.println(day1.getYear());
		System.out.println(day1.showBirthday());

		Birthday day2 = new Birthday(2000, 10, 8);
		System.out.println(day2.showBirthday());
	}
}