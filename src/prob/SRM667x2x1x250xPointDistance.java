public class SRM667x2x1x250xPointDistance {
	public int[] findPoint(int x1, int y1, int x2, int y2) {

		int[][] pos = {{100, -100},{100, 100},{-100, 100},{-100, -100}};
		
		for(int i = 0; i < 4; i++) {
			int xA = x1 - pos[i][0];
			int yA = y1 - pos[i][1];
			int xB = x2 - pos[i][0];
			int yB = y2 - pos[i][1];
			double distA = Math.sqrt((xA*xA)+(yA*yA));
			double distB = Math.sqrt((xB*xB)+(yB*yB));
			if(distA > distB) {
				return pos[i];
			}
		}
		return null;
	}
}
