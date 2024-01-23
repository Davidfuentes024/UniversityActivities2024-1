public class Jugador {

    private String name;
    private Position position;
    private Team team;

    public Jugador(String name, Position position){
        this.name = name;
        this.position = position;
    }

    public Jugador(String name, Position position, Team team){
        this.name = name;
        this.position = position;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String toString(){
        return this.team.getName() + " " + name + " " + this.position.name();
    }
}
