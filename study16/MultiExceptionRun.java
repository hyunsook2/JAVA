package study16;

public class MultiExceptionRun {
	public static void main(String[] args) {
		CalTest cal = new CalTest();
		cal.excptionProc(1, 2);
		cal.excptionProc(2, 0);
		cal.excptionProc(4, 2);
		cal.excptionProc(0, 2);
	}
}
class CalTest{
	private int[] arr= new int[3];
	CalTest() {
		arr[0]=0;
		arr[1]=100;
		arr[2]=10;
	}
	public void excptionProc(int first,int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException"); // 0으로 나눌때 오류 (무한)
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException"); //인덱스가 배열의 크기보다 크거나 음수가 나온다면 오류
																//인덱스 0 1 2 뿐인데 4를 넣어서 ㅇㅇ
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("finally");
		}
	}
}