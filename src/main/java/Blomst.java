public class Blomst {
    String name;
    int pris;

    public Blomst(String name) {
        this.name = name;
        setPris();
    }

    public String getName() {
        return name;
    }

    public int getPris() {
        return pris;
    }

    public void setPris() {
        switch (this.name) {
            case "Tulipan": this.pris = 40;break;
            case "Rose": this.pris = 50;break;
            case "Lilje": this.pris = 30;break;
            case "Georgine": this.pris = 10;break;
            default:this.pris = 5;
        }

    }
}
