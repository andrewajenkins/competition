import java.util.Arrays;

public class Team {
    //TODO move to football subclass
    public static final Position[] positions = {Position.QB, Position.RB,
        Position.RB, Position.WR, Position.WR, Position.WR, Position.TE,
        Position.K, Position.D};

    public Player[] team;

    public Team() {
        set(new Player[positions.length]);
    }

    public Team(Player[] team) {
        set(team);
    }

    public void set(Player[] team) {
        this.team = team;
    }

    public void set(int i, Player p) {
        team[i] = p;
    }

    public boolean hasPlayer(Player p) {
        for(int i = 0; i < team.length; i++) {
            if(team != null && team[i] != null && p.equals(team[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(team);
    }
}
