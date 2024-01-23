public class Main {
    public static void main(String[] args) {

        Jugador zeus = new Jugador("Zeus", Position.TOP, Team.T1);
        Jugador oner = new Jugador("Zeus", Position.JG, Team.T1);
        Jugador faker = new Jugador("Zeus", Position.MID, Team.T1);
        Jugador gumayusi = new Jugador("Zeus", Position.BOT, Team.T1);
        Jugador keria = new Jugador("Zeus", Position.SUP, Team.T1);

        System.out.println(zeus.toString());
        System.out.println(oner.toString());
        System.out.println(faker.toString());
        System.out.println(gumayusi.toString());
        System.out.println(keria.toString());
    }
}
