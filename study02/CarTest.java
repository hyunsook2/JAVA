package study02;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		//c.carNum; //private 접근불가 (동일클래스내만가능)
		int speed = c.speed; //default
		c.getSpeed(); //protected
		c.getCarNum(); //public
	}

}
