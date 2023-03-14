package study15_2;

public class GenericEx {
	public static void main(String[] args) {
		Integer[] intArr = { 1, 2, 3 };
		String[] strArr = { "Hello", "World" };

		printArray(intArr);
		printArray(strArr);

	}

	public static <T> void printArray(T[] t) {
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
}