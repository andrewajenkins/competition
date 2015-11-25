package prob;

public class SRM144x2x2xBinaryCode {

	public String[] decode(String message) {
		String[] result = new String[2];
		result[0] = getString(message, '0');
		result[1] = getString(message, '1');
		return result;
	}
	
	private static String getString(String message, char c){
		int startIteration = 1;
		int runTo = message.length()-1;
		char[] p = new char[message.length()];
		char[] q = message.toCharArray();
		p[0] = c;
		p[1] = (char) ((q[0]-'0') - (p[0]-'0') + '0');
		for (int i = startIteration; i < runTo; i++) {
			p[i+1] = (char) ((q[i]-'0') - (p[i]-'0') - (p[i-1]-'0') + '0');
			if(p[i+1] > '1') {
				p = "NONE".toCharArray();
				break;
			}
		}
		return new String(p);
	}
}
