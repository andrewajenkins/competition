public class Uniques{
	public static void main(String args[]){
		System.out.println(isAllUniques(args[0]));
	}

	public static boolean isAllUniques(String st){
		char[] c = new char[256];
		for(int i=0; i<st.length(); i++){
			if(c[st.charAt(i)]==1)
				return false;
			else
				c[st.charAt(i)]=1;
		}
		return true;
	}
}