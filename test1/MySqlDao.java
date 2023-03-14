package test1;

public class MySqlDao implements DataAccessObject{

	public void select() { 
		System.out.println("MySql DB검색");
	}
	public void insert() {
		System.out.println("MySql DB삽입");
	}
	public void update() {
		System.out.println("MySql DB수정");
	}
	public void delete() {
		System.out.println("MySql DB삭제");
	}
}
