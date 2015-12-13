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

	static Map<Integer,Player> data = new HashMap<>();

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
				data.put(p.id, p);
			}
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		loadData(args[0]);
		for(int id : data.keySet()) {
			System.out.println(data.get(id));
		}
	}

	static class Player {
		int id, played, salary;
		String position, firstName, lastName, game, team,
		       opponent, injury, deets;
		Double rating;
		Player(String[] sa) {
			id = Integer.parseInt(sa[0]);
			position = sa[1];
			firstName = sa[2];
			lastName = sa[3];
			rating = Double.parseDouble(sa[4]);
			played = Integer.parseInt(sa[5]);
			salary = Integer.parseInt(sa[6]);
			game = sa[7];
			team = sa[8];
			opponent = sa[9];
			injury = sa[10];
			deets = sa[11];
		}
		@Override
		public String toString() {
			return firstName + ", " + lastName;
		}
	}
}
