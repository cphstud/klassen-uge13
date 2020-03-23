import java.awt.image.TileObserver;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        View view = new View();
        boolean takeOrders = true;
        while(takeOrders) {
            // Bruger dialog
            // Vis blomsterudvalg
            // Q: Hvilken blomst?
            //A: "Tulipan"
            // return brugervalg blomst
            String userFlower = view.getFlower();
            Blomst userBlomst = new Blomst(userFlower);
            String tilbeHoer = view.getTilbehør();
            Tilbehør tilbehør = new Tilbehør(tilbeHoer);
            // Adresse?
            Adresse address = null;
            Buket buket = new Buket(userBlomst,tilbehør);
            buket.setPris();
            //int buketPris = buket.getPris();
            //boolean ok = view.getConfirmation(buketPris);
            Ordre order = new Ordre();
            order.setBuket(buket);
            order.setAdresse(address);
            order.setPris();
            System.out.println(order.getPris());
            // gem ordrer .. hvor?



            // validering af ordre
            // afgivelse af ordre

            takeOrders=false;

        }

        /*

            public static String orderFlowers() {
                Scanner myScan = new Scanner(System.in);
                String flowerOrder = "";
                String flowerOrderAdress = "";

                // blomster objekter. Abstrakt klasse
                // listen af blomster vises
                System.out.println("Hvilke blomster skal indgå? Adskil med komma - feks roser,tulipaner");
                String flowers = myScan.nextLine();
                // hent brugerens input som tal
                System.out.println("Skal der grønt med?(Ja/Nej)");
                String green = myScan.nextLine();
                green += " til grønt";
                System.out.println("Hvad må den koste?");
                int price = myScan.nextInt();
                System.out.println("Skal den leveres?(Ja/Nej)");
                myScan.nextLine();
                String deliver = myScan.nextLine();
                if (deliver.equals("Ja")) {
                    System.out.println("Navn");
                    String name = myScan.nextLine();
                    System.out.println("Indtast vej navn og nr:");
                    String street  = myScan.nextLine();
                    System.out.println("Indtast postnr og by:");
                    String postal  = myScan.nextLine();
                    flowerOrderAdress = String.format("%s;%s;%s", name,street,postal);
                }
                flowerOrder = String.format("%s;%s;%d;",flowers,green,price);
                flowerOrder += flowerOrderAdress;
                return flowerOrder;
            }

        }
	// write your code here

         */
    }
}
