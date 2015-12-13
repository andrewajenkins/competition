class Player {
    int id, played, salary;
    String firstName, lastName, game, team,
           opponent, injury, deets;
    Double rating;
    Position position;
    Player(String[] sa) {
        id = Integer.parseInt(sa[0]);
        position = Position.valueOf(sa[1].toUpperCase());
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
