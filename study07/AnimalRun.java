package study07;

class Animal{
	String name;
	public void setName(String name) {
		this.name=name;
	}
	void sleep() {
	System.out.println("zzz");
	}
}
class Dog extends Animal{
	void sleep() {
		System.out.println("그르렁 그르르렁");
	}
}
class Cat extends Animal{
	void sleep() {
		System.out.println("갸르릉 갸르릉");
	}
}
class Human extends Animal{
	void sleep() {
		System.out.println("쿨쿨");
	}
}
class PetDog extends Dog{
	PetDog(){}
	PetDog(String name){
	this.setName(name);
	}
	@Override //annotation
	void sleep() {
		System.out.println(name+"는 골골 집에서 잡니다.");
	}
	//오버로딩
	void sleep(int hours) {
		System.out.println(name+"는"+hours+"시간 동안 잘 잡니디");
	}
}
public class AnimalRun {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("멍멍이");
		System.out.println(dog.name);
		dog.sleep();
		Cat cat = new Cat();
		cat.setName("야옹이");
		System.out.println(cat.name);
		cat.sleep();
		Human human = new Human();
		human.setName("인간");
		System.out.println(human.name);
		human.sleep();
		PetDog pDog = new PetDog();
		pDog.setName("해피");
		pDog.sleep(10);
		//자식 클래스의 객체는 부모 클래스의 자료형으로 사용 ( is - a 관계 )
		Animal dog2 = new Dog();
		dog2.setName("개");
		dog2.sleep();
		
		System.out.println(dog2.name);		
	}
}
