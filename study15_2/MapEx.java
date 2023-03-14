package study15_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		//   이름  ,  점수
		Map<String,Integer> map = new HashMap<>();
		//값 추가
		map.put("lee", 96);
		map.put("hong", 86);
		map.put("white", 92);
				
		String name = "";
		int maxPoint = 0;
		int totalPoint = 0;

		//keyset
//		Set<String> keySet = map.keySet();
//		Iterator<String> iter = keySet.iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			int value = map.get(key);
//			totalPoint += value;
//			maxPoint = (maxPoint<value)?value:maxPoint;
//			name = (maxPoint<= value)?key:name;
//		}
		
		//entryset
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String,Integer> entry = iter.next();
			String name2 = entry.getKey();
			int point = entry.getValue();
			totalPoint += point;
			maxPoint = (maxPoint<= point)?point:maxPoint;
			name = (maxPoint<= point)?name2:name;
		}
//		for(Iterator iter = entrySet.iterator();
//			iter.hasNext();) {
//			System.out.println(iter.next());
//		}
		System.out.println("평균점수:"+totalPoint/map.size());
		System.out.println("최고 점수:"+maxPoint);
		System.out.println("최고 득점자:"+name);
	}
}
