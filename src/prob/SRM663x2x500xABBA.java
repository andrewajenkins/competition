package prob;

import java.util.*;
public class SRM663x2x500xABBA {
	public String canObtain(String initial, String target) {
		List<String> que = new ArrayList<String>();
		int i = 0;
		que.add(initial);
		while(i<que.size()) {
			String cur = que.get(i++);
			String withA = cur + "A";
			String revB = rev(cur) + "B";
			if(target.contains(withA) || target.contains(rev(withA)))
				que.add(withA);
			if(target.contains(revB) || target.contains(rev(revB)))
				que.add(revB);
		}
		if(que.contains(target))
			return "Possible";
		else
			return "Impossible";
	}
	
	public String rev(String s) {
		return new StringBuilder(s).reverse().toString();
	}
}