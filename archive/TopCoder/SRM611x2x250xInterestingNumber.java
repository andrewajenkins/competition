package prob;

public class SRM611x2x250xInterestingNumber{
	private static final int ASCII = 47;
	
	public String isInteresting(String s){
		char[] c = s.toCharArray();
		for(int i=0; i<c.length; i++){
			if(c[i] == '_') continue;
			if((i+c[i]-ASCII) < c.length){ 
				if(c[i] == c[i+c[i]-ASCII])	c[i] = c[i+c[i]-ASCII] = '_';
				else return "Not interesting";
			}else return "Not interesting";
		} 
		return "Interesting";
	}
}