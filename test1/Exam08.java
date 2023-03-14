package test1;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
	int value;
	Calculator() {
		this.value = 0;
	}
	void add(int val) {
		this.value += val;
	}
	int getValue() {
		return value;
	}
	boolean isEven(int num) {
		return num%2==0 && num!=0;
		//if(num%2==0&&num!=0) {
		//	return true;
		//}
		//return false;
	}
	double avg(int[] arr) {
		double sum=0;
		for(int o:arr) {
			sum+=o;
		}
		return sum/arr.length;
	}
	double avg(ArrayList<Integer> arr) {
		double sum=0;
		for(int o:arr) {
			sum+=o;
		}
		return sum/arr.size();
	}
}
class UpgradeCalculator extends Calculator{
	void minus(int val) {
		this.value -= val;
	}
}

class MaxLimitCalculator extends Calculator{
	int max;
	MaxLimitCalculator(int max){
		this.max = max;
	}
	@Override
	void add(int val) {
		this.value += val;
		if(this.value > max) {
		this.value=max;
		}
	}
}

public class Exam08 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10);
		System.out.println(cal.getValue());//
		
		UpgradeCalculator cal1 = new UpgradeCalculator();
		cal1.add(10);
		cal1.minus(7);
		System.out.println(cal1.getValue());//3
		
		MaxLimitCalculator cal3 = new MaxLimitCalculator(120);
		cal3.add(80);
		cal3.add(60);
		System.out.println(cal3.getValue());//100		
		
		Calculator cal4 = new Calculator();
		System.out.println(cal4.isEven(3)); //짝수여부 판단 false(홀수)
		System.out.println(cal4.isEven(4)); //짝수여부 판단 true(짝수)
		System.out.println(cal4.isEven(0)); //짝수여부 판단 false(0인경우 홀수)
		
		
		Calculator cal5 = new Calculator();
		int[] data1 = {1,3,5,7,9};
		System.out.println( (int)Math.round(cal5.avg(data1)) );// 5
		
		ArrayList<Integer> data2 = new ArrayList<>(
				Arrays.asList(1,3,5,7,9));
		System.out.println( cal5.avg(data2) );// 5
		
		
		
	}
}