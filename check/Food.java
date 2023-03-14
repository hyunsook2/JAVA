package check;
public class Food {
	public static void main(String[] args) {
		String item1 = "치킨";
		int price1 = 25000;
		String item2 = "왕만두";
		int price2 = 5000;
		String item3 = "쌀국수";
		int price3 = 8500;
		int total = price1 * 34 + price2 * 10 + price3 * 12;
		System.out.printf("%s x 34 = %d%n" 
		+ "%s x 10 = %d%n" 
		+ "%s x 12 = %d%n"
		+ "====================%n" 
		+ "총합 : %d",
		item1, price1 * 34, 
		item2, price2 * 10,
		item3, price3 * 12, 
		total);
	}
}