public enum Team {
    T1("T1 Lol"), GENG("Gen G"), R7("Rainbow Seven");

    private String name;

    private Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
