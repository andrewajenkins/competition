import java.util.*;
import java.io.*;

/**
 * FanDuel Problem: Given a list of players and their positions, ratings,
 * and cost, find a team (1 player per position) subset that has total
 * cost no greater than totalSalary, and maximizes total rating.
 * Input: a csv file available on each contest page.
 * Usage: javac FanDuelKnapsack.java; java FanDuelKnapsack <csv-file-name>
 */
public class FanDuelKnapsack {

	static List<Player> data = new ArrayList<>();

    static Map<Position, List<Player>> posMap = new HashMap<>();

    static void getCombinations() {
        populatePosMap();
    }

    static void populatePosMap() {
        for(Position p : Position.values()) {
            posMap.put(p, new LinkedList<Player>());
        }
        for(Player p : data) {
            List<Player> l = posMap.get(p.position);
            l.add(p);
            posMap.put(p.position, l);
        }
        System.out.println(posMap.keySet());
    }

	static void loadData(String fileName) {
		String csvFile = "FanDuel-NFL-2015-12-13-13913-players-list.csv";
		if(fileName != null) {
			csvFile = fileName;
		}
		try {
			Scanner sc = new Scanner(new File(csvFile));
			sc.nextLine(); //burn the header field
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split(",");
				for(int i = 0; i < line.length; i++) {
					String s = line[i];
					line[i] = s.replaceAll("\"", "");
				}
				Player p = new Player(line);
				data.add(p);
			}
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		loadData(args[0]);
	    Debug.print(data);
        getCombinations();
        Debug.print(posMap);
	}
}
