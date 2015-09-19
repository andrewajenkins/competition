public class SRM666x2x440xGoodString {
	public String isGood(String s) {
		while(s.contains("ab")) {
			s = s.replaceAll("ab","");
		}
		return s.length() < 1 ? "Good" : "Bad";
	}
}