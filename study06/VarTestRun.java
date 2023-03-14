package study06;

public class VarTestRun {
	
	int k=0;
	
	int localVal(int l) {
		this.k++;
		return l+1;
	}
	
	public static void main(String[] args) {
		int a = 1;
		VarTestRun vtr = new VarTestRun();
		a = vtr.localVal(a);
		System.out.println(a);
		//객체.멤버변수명
		System.out.println(vtr.k);
	}

}
