package test3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamTest3 {
	public static void main(String[] args) {
		question1();
		question2();
	private final static List<String> SPELLS = Arrays.asList
			("TOMAS", "a", "hELLO", "B", "korea", "X", "nutella","apple", "banana");

// list에 저장된 단어에 첫번째 문자가 각각 몇개있는지
// Map<String,Integer>로 반환 예 : ("X",1)("a",1)...
	static Map<String, Integer> question1() {
		Map<String,Integer> result = new HashMap<>();
		for(String spell:SPELLS) {
			String head = spell.substring(0, 1);
			if(!result.containsKey(head)) {
				result.put(head, 1);
			}else {
				result.put(head,result.get(head)+1);
			}
		}
		return result;
	}
// list에 저장된 단어들 중에서 단어의 길이가 2이상인 경우에
// 모든 단어를 대문자로 변환하여 구분자를 스페이스로 하는 문자열로 반환
	static String question2() {
		String result="";
		for(String spell:SPELLS) {
			if(spell.length()>=2) {
				result += spell.toUpperCase()+" ";
			}
		}
		return result;
	}
}
