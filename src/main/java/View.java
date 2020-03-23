import java.util.Scanner;
public class View {
    static Scanner ms = new Scanner(System.in);
    public String getFlower(){
        String retFlower = "";
        System.out.println("Du kan vælge:");
        showFlowers();
        retFlower = ms.nextLine();
        return  retFlower;
    }

    public void showFlowers() {
        System.out.println("Tulipan");
        System.out.println("Rose");
        System.out.println("Lilje");
        System.out.println("Georgine");
    }

    public String getTilbehør(){
        String retTilbehør = "";
        System.out.println("Du kan vælge:");
        showTilbehør();
        retTilbehør = ms.nextLine();
        return  retTilbehør;
    }

    public void showTilbehør() {
        System.out.println("Ramsløg");
        System.out.println("Mos");
        System.out.println("Gran");
        System.out.println("Græs");
    }

}
