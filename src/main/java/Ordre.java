public class Ordre {
    static int orderCounter=12200;
    Buket buket;
    Adresse adresse;
    int ordreId;
    int pris;

    public Ordre(){
        this.ordreId=orderCounter;
        orderCounter++;
    }

    public void setPris() {
        int tmpPris = 0;
        tmpPris = buket.getPris();
        if (adresse != null) {
            tmpPris = tmpPris + 140;
        }
        this.pris=tmpPris;
    }

    public int getPris() {
        return this.pris;
    }

    public static void setOrderCounter(int orderCounter) {
        Ordre.orderCounter = orderCounter;
    }

    public void setBuket(Buket buket) {
        this.buket = buket;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
