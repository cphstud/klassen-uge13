import java.util.Scanner;
public class View {
    static Scanner ms = new Scanner(System.in);
    public static String getFlower(){
        String retFlower = "";
        System.out.println("Du kan vælge:");
        showFlowers();
        retFlower = ms.nextLine();
        return  retFlower;
    }

    public static void showFlowers() {
        System.out.println("Tulipan");
        System.out.println("Rose");
        System.out.println("Lilje");
        System.out.println("Georgine");
    }

}
