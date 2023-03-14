package study15;

import java.util.HashMap;

enum CoffeeType{
	Americano,IcedAmericano,CafeLatte
}

public class EnumPrac {
	static void printCoffeePrice(CoffeeType type){
		HashMap<CoffeeType , Integer> priceMap = new HashMap<>();
		priceMap.put(CoffeeType.Americano,3000);
		priceMap.put(CoffeeType.IcedAmericano,4000);
		priceMap.put(CoffeeType.CafeLatte,5000);
		int price = priceMap.get(type);
		System.out.printf("가격은 %d원입니다.\n",price);		
	}
	public static void main(String[] args) {
		printCoffeePrice(CoffeeType.Americano);
		printCoffeePrice(CoffeeType.IcedAmericano);
		printCoffeePrice(CoffeeType.CafeLatte);
	}
}