package test1;

public class OracleDao implements DataAccessObject{
	
	public void select() { 
		System.out.println("Oracle DB검색");
	}
	public void insert() {
		System.out.println("Oracle DB삽입");
	}
	public void update() {
		System.out.println("Oracle DB수정");
	}
	public void delete() {
		System.out.println("Oracle DB삭제");
	}
}
