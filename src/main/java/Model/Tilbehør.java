package Model;

public class Tilbehør {
    String name;
    int pris;
    public Tilbehør(String name) {
        this.name = name;
        this.pris = 20;
    }

    public String getName() {
        return name;
    }

    public int getPris() {
        return pris;
    }
}
