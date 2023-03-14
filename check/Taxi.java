package check;

import study07.Car;

public class Taxi extends Car {
	Taxi(){
		super();
		//this.carNum;//private
		//int speed = c.speed; //default
		this.getSpeed(); //protected
		this.getCarNum();//public
	
	}

}
