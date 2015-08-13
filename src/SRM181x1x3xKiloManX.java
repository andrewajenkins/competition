import java.util.*;
public class SRM181x1x3xKiloManX {

	/*
	 * Java users unfortunately have to do a bit of makeshift work, 
	 * as there is not a direct implementation of the Heap structure. 
	 * We can approximate it with the TreeSet structure which will 
	 * do full ordering of our dataset. It is less space efficient, 
	 * but will serve our purposes fine.
	 */
	boolean debugAllWeapons = true;
	public int leastShots(String[] damageChart, int[] bossHealth) {
		boolean[] visited = new boolean[32768];
		TreeSet<node> que = new TreeSet<node>();
		que.add(new node(0, 0));
		int numWeapons = 0;
		while(!que.isEmpty()) {
			node top = que.first();
			que.remove(que.first());
			//make sure we dont visit the same configuration twice
			if(visited[top.weapons]) {
				continue;
			}
			visited[top.weapons] = true;
			//trick to check if we have all the weapons
			if(top.weapons == (1 << numWeapons) -1) {
				return top.shots;
			}
			for(int i = 0; i < damageChart.length; i++) {
				// check if we've already visited this boss, then dont try again
				if(((top.weapons >> i) & 1) > 0) {
					continue;
				}
				// which is best weapon for this boss
				int best = bossHealth[i];
				for(int j = 0; j < damageChart.length; j++) {
					if(i == j) {
						continue;
					}
					if((((top.weapons >> j) & 1) == 1) && damageChart[j].charAt(i) != '0') {
					//we have this weapon, so lets try it on boss
						int shotsNeeded = bossHealth[i] / (damageChart[j].charAt(i)	- '0');
						best = Math.min(best, shotsNeeded);
					}
				}
				node n = new node(top.weapons | (1 << i), top.shots + best);
				que.add(n);
			}
		}
		return 0;
	}
	
	class node implements Comparable<node> {
		int weapons;
		int shots;
		@Override
		public int compareTo(node n) {
			if(shots != n.shots)
				return (shots < n.shots)? 1 : -1;
			if(weapons != n.weapons) 
				return (weapons < n.weapons)? 1 : -1;
			return 0;
		}
		node(int weapons, int shots){
			this.weapons = weapons;
			this.shots = shots;
		}
		@Override
		public String toString() {
			return "node:" + weapons + " " + shots;
		}
	}
}