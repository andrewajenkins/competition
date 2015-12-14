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

    static List<Team> teams = new ArrayList<>();

    static void getCombinations() {
       run(new Team(), 0, 0, null);  
    }

    //params Team team, int ndex
    static void run(Team team, int index, int posIndex, Position lastPos) {
        if(index >= Team.positions.length) {
            System.out.println("returning "+team);
            teams.add(new Team(team.team));
            return;
        }
        //System.out.println(index+" "+Team.positions[index]+" "+team);
        List<Player> list = posMap.get(Team.positions[index]);
        if(!Team.positions[index].equals(lastPos)) {
            posIndex = 0;
        }
        for(int i = posIndex; i < list.size(); i++) {
            //sleep(500);
            Player p = list.get(i);
            if(!team.hasPlayer(p)) {
                team.set(index, p);
                run(team, index + 1, i + 1, Team.positions[index]);
            }
        }
    }

    static void sleep(long ms) {
        try { Thread.sleep(ms); } catch(Exception e) { /* do nothing */ }
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
        //System.out.println(posMap.keySet());
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
        long start = System.currentTimeMillis();
		loadData(args[0]); // loads list from csv file param
	    //Debug.print(data);
        populatePosMap(); // create map that returns list of players per position
        //Debug.print(posMap);
        getCombinations(); // returns list of teams ordered by total ranking
        long finish = System.currentTimeMillis() - start;
        Debug.print(teams);
        System.out.println("Time: "+finish);
	}
}
