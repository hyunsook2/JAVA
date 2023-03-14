package study15_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class PersonInfo {
	private String name;
	private String address;
	private String telNum;

	public PersonInfo(String name, String telNum, String address) {
		this.name = name;
		this.telNum = telNum;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

}

class PersonInfoList {
	private HashMap<String, PersonInfo> pList;

	PersonInfoList() {
		pList = new HashMap<String, PersonInfo>();
	}

	void addPersonInfo(String name, String telNum, String address) {
		PersonInfo pInfo = new PersonInfo(name, telNum, address);
		pList.put(name, pInfo);
		pList.put(telNum, pInfo);
		pList.put(address, pInfo);
	}

	String getPersonInfoWithName(String name) {
		Set<Entry<String, PersonInfo>> etr = pList.entrySet();
		Iterator<Entry<String, PersonInfo>> itr = etr.iterator();
		while (itr.hasNext()) {
			Entry<String, PersonInfo> en = itr.next();
			PersonInfo pInfo = en.getValue();
			if (pInfo.getName().contains(name)) {
				String eName = pInfo.getName();
				String eTel = en.getKey();
				String eAddr = en.getValue().getAddress();

				return "||이름 : " + eName + " ||전화번호 : " + eTel + " ||주소 : " + eAddr + "||";
			}
		}
		return "해당 검색 대상이 없습니다.";
	}

	String getPersonInfoWithTel(String telNum) {
		Set<Entry<String, PersonInfo>> etrr = pList.entrySet();
		Iterator<Entry<String, PersonInfo>> itrr = etrr.iterator();
		while (itrr.hasNext()) {
			Entry<String, PersonInfo> ten = itrr.next();
			PersonInfo pInfo = ten.getValue();
			if (pInfo.getTelNum().contains(telNum)) {
				String eName = pInfo.getName();
				String eTel = pInfo.getTelNum();
				String eAddr = ten.getValue().getAddress();

				return "||이름 : " + eName + " ||전화번호 : " + eTel + " ||주소 : " + eAddr + "||";
			}
		}
		return "해당 검색 대상이 없습니다.";
	}
	public HashMap<String, PersonInfo> getpList() {
		return pList;
	}

	public void setpList(HashMap<String, PersonInfo> pList) {
		this.pList = pList;
	}
}

public class HashMapPrac {
	public static void main(String[] args) {
		PersonInfoList pList = new PersonInfoList();
		pList.addPersonInfo("인순이", "010-1111-1111", "서울");
		pList.addPersonInfo("권보아", "010-2222-2222", "대전");
		pList.addPersonInfo("이보람", "010-3333-3333", "대구");
		Scanner scan = new Scanner(System.in);
		System.out.println("<<전화번호 목록>>");
		while (true) {
			System.out.println("조회대상 선택\n1.이름\n2.전화번호");
			System.out.println("3.종료");
			System.out.println("선택:");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.println("<검색>\n이름:");
				String search = scan.next();
				String result = pList.getPersonInfoWithName(search);
				System.out.println(result);
			} else if (menu == 2) {
				System.out.println("<검색>\n전화번호:");
				String search = scan.next();
				String result = pList.getPersonInfoWithTel(search);
				System.out.println(result);
			} else {
				System.out.println("검색종료");
				break;
			}
		}
	}
}