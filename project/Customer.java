package project;

import java.util.ArrayList;

import project.Customer;

public class Customer {
	static int seqNum = 1000;
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer() {
		customerId = seqNum++;
		customerGrade = "Silver";
		bonusRatio = 0.01;
		System.out.println("경마게임");
		System.out.println();
	}

	public Customer(String customerName) {
		this();
		this.customerName = customerName;
	}

	public int calcPirce(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String getCustomerInfo() {
		return "이름 : " + customerName + "|등급:" + customerGrade + "|보너스포인트:" + bonusPoint;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public int calcPrice(int price) {
		return 0;
	}

	static void showCustomer(ArrayList<Customer> cusList) {
		System.out.println("====고객====");
		for(Customer cus1:cus) {
			System.out.println(cus1.getCustomerInfo());
		}
	}
	static void calcPriceAll(ArrayList<Customer> cus,int price) {
		System.out.println("====가격계산====");
		System.out.println("가격 : "+price);
		for(Customer cus1:cus) {
			int cost = cus1.calcPirce(price);
			System.out.printf("%s 고객님의 구매금액은 %d원입니다.\n",cus1.getCustomerName(),cost);
			System.out.println(cus1.getCustomerInfo());
		}
		
	}
	public class VipC‎⁮ustomer extends Customer {
		private double saleRatio;// 할인율

		public VipC‎⁮ustomer(String customerName) {
			super(customerName);
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
			System.out.println("VIPcustomer 생성자");

		}

		@Override
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price - (int) (price * saleRatio);
		}

		@Override
		public String getCustomerInfo() {
			return super.getCustomerInfo();
		}
	}
}
