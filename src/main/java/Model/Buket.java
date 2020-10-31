package Model;

public class Buket {
    Blomst blomst;
    Tilbehør tilbehør;
    int pris;

    public Buket(Blomst blomst, Tilbehør tilbehør) {
        this.blomst = blomst;
        this.tilbehør=tilbehør;
    }

    public void setPris() {
        int tmpPris = 0;
        tmpPris = blomst.getPris();
        tmpPris = tmpPris + tilbehør.getPris();
        this.pris = tmpPris;
    }

    public Blomst getBlomst() {
        return blomst;
    }

    public Tilbehør getTilbehør() {
        return tilbehør;
    }

    public int getPris() {
        return pris;
    }
}
