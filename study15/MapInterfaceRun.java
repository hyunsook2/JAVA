package study15;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import study15.CompareMemberTreeSet;

public class MapInterfaceRun {
	public static void main(String[] args) {
		CompareMemberTreeSet cts = new CompareMemberTreeSet();
		HashMap<Integer, String> hmap = new HashMap<>();
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		
		lmap.put(103, "Kim");
		lmap.put(102, "Kim");
		lmap.put(101, "Kim");
		lmap.put(102, "Hong");
		System.out.println(lmap.toString());
		System.out.println(lmap.size());
		hmap.put(103, "Kim");
		hmap.put(102, "Kim");
		hmap.put(101, "Kim");
		hmap.put(102, "Hong");
		System.out.println(hmap.toString());
		System.out.println(hmap.size());
		Member lee = new Member(103, "Lee", 0);
		cts.addMember(lee);
		Member koo = new Member(102, "Kim", 0);
		cts.addMember(koo);
		Member song = new Member(101, "Kim", 0);
		cts.addMember(song);
		Member hong = new Member(102, "Hong", 0);
		cts.addMember(hong);
		cts.showAll();

	}
}

class CompareMemberTreeSet {
	private TreeSet<Member> tset;
	CompareMemberTreeSet() {
		tset = new TreeSet<Member>();
	}
	void addMember(Member mem) {
		tset.add(mem);
	}
	void showAll() {
		for (Member mem : tset) {
			System.out.print((mem.getMemberId() +"="+ mem.getMemberName()+" "));
		}
	}
}