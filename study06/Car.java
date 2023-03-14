package study06;

public class Car {
	
	private String name = "";
	private String model = "";
	private int size = 0;
	
		void CarMain() {
			name = "벤츠";
			model = "eClass";
			size = 350;
		}
		void CarMain(String name, String model, int size){
		this.name = "벤츠";
		this.model = "eClass";
		this.size = 350;
		}
		static void brake() {
			Car.brake();
			System.out.println("브레이크");
		}
		static void gearChange() {
			Car.gearChange();	
			System.out.println("기어변경");
		}
		static void accelerate() {
			Car.accelerate();
			System.out.println("가속");
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}	
		
		public static void main(String[] args) {
			System.out.println();
		}
}
