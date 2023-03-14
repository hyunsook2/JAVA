package study11_1;

public class ClassMain2 {
	public static void main(String[] args) {
		Calculator c1 = new MyMath();
		double res = c1.oper(3.0, 7.0);
		System.out.println(res);

		// 익명클래스 x*y <---- Caluclator

		Calculator c2 = new Calculator() {
			public double oper(double x, double y) {
				return x * y;
			}
		};
		System.out.println(c2.oper(3.0, 7.0));

		// 익명클래스 x^y <---- Calculator
		Calculator c3 = new Calculator() {
			public double oper(double x, double y) {
				return Math.pow(x, y);
			}
		};
		System.out.println(c3.oper(3.0, 7.0));
	}
}

interface Calculator {
	public double oper(double x, double y);
}

//class MyMath <-----Caculator
// x+y

class MyMath implements Calculator {
	public double oper(double x, double y) {
		return x + y;
	}
}