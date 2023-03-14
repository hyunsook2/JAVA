package test1;

public class Exam04 {
	public static void main(String[] args) {
		//System.out.println(Math.random());
		//2개의 주사위를 던졌을 때 눈의 합의 5면 코드정지
		//12가나오면 감탄사 , 나오는값은 출력
		while(true) {	
			int i = (int)(Math.random()*6)+1;
			int j = (int)(Math.random()*6)+1;
			
			System.out.println("DICE GAME");
			System.out.printf("rolling...[%d,%d]\n",i,j);
			System.out.println(" 주사위 합 : "+ (i+j));
			if(i+j == 5) {
				break;
				}
			else if(i+j == 12 ) {
				System.out.println("럭키");
			}
			
	}

	}
}
