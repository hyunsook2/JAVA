package study06;

public class Professor {
	 static String name = "";
	 static String group = "";
	 static int level = 0;
	
		void professorMain() {
			name = "이재용";
			group = "삼성";
			level = 9;
		}
		void professorMain(String name, String group, int level) {
		Professor.name = "이재용";
		Professor.group = "삼성";
		Professor.level = 9;
		}
		void check() {
			this.check();
			System.out.println("출석체크");
		}
		void quest() {
			this.quest();	
			System.out.println("과제내주기");
		}
		void score() {
			this.score();
			System.out.println("학점주기");
		}
	public static void main(String[] args) {
		System.out.printf(name,group,level);
	}
}
