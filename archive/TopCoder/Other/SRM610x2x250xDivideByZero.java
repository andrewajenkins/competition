package prob;

import java.util.*;

public class SRM610x2x250xDivideByZero{
	public int CountNumbers(int[] numList){
		if (numList.length < 2) return numList.length;
		List<Integer> al = new ArrayList<Integer>();
		for(int i: numList) 
			al.add(i);
		for(int i=0; i<al.size();i++){
			int a = al.get(i);
			for(int j=i+1; j<al.size();j++){
				int b = al.get(j);
				if( a>b && !al.contains(a/b)) 
					al.add(a/b);
				if( b>a && !al.contains(b/a)) 
					al.add(b/a);
			}
		}
		return al.size();
	}
}
