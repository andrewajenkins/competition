public class CorruptedMessage {
	
	public String reconstructMessage(String s, int k) {
		if(k == 0) return s;
		int[] a = new int[26];
		int incase = -1;
		for(int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - 97]++;
		}
		for(int i = 0; i < a.length; i++) {
			if(k + a[i] == s.length()) {
				return buildString(i+97, s.length());
			} else if(a[i] == 0) {
				incase = i;
			}
		}
		return buildString(incase+97, s.length());
	}

	private String buildString(int i , int n) {
		StringBuilder sb = new StringBuilder();
		for(int j = 0; j < n; j++) sb.append((char)i);
		return sb.toString();
	}
}
