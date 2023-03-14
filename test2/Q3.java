package test2;

public class Q3 {
	public static void main(String[] args) {
		String socialNumber = "871130-1463217";
		String[] sNums = socialNumber.split("-");
		int code = Integer.parseInt(sNums[1].substring(0,1));
		String birthDate = null;
		String gender = null;
		if(code==1 || code==2) {
			birthDate = "19"+sNums[0].substring(0,2);
			gender = code==1?"남자":"여자";
		}else if(code==3 || code==4) {
			birthDate = "20"+sNums[0].substring(0,2);
			gender = code==3?"남자":"여자";
		}
		System.out.println(birthDate+"년"+sNums[0].substring(2,4)+"월"+sNums[0].substring(4,6)+"일"
				+" | 성별:"+gender);
	}
}


