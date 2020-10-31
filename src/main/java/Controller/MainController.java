package Controller;

import Model.*;
import Util.ConsoleUI;
import View.View;

import java.util.ArrayList;

public class MainController {
    View view;
    ConsoleUI ui;
    Bestillinger bestillinger;

    public MainController(View view, Bestillinger bestillinger) {
        this.bestillinger = bestillinger;
        this.view = view;
        this.ui = new ConsoleUI();
    }

    public void run() {
        int mainChoice = 0;
        int exitValue = 9;
        // TODO: Vis hovedfunktioner (opret ordre, gem dagens bestillingsliste, kør statistik)

        while(mainChoice != exitValue) {
            switch (mainChoice) {
                case 1:
                    createOrder();
                    break;
                case 2:
                    runStatistics();
                    break;
                case 3:
                    finishTheDay();
                    break;
                default:mainChoice=exitValue;
            }
        }
    }

    public void createOrder() {
        int orderChoice = 0;
        int orderExitValue = 9;
        while(orderChoice != orderExitValue) {
            switch (orderChoice) {
                case 1:
                    doOrder();
                    break;
                case 2:
                    findOrder();
                    break;
                case 3:
                    confirmOrder();
                    break;
                default:
                    orderChoice = orderExitValue;
            }
        }
    }


    public void doOrder() {
        // initialiser model-dele som view-delen returnerer fra brugerdialogen
        // Kører en dialog som ender med at tilføje en ordre til bestillinger
        // få lavet blomster .. buketter
        // få dem tilføjet en ordre
        // få tilføjet ordren til bestillinger.

        Ordre ordrer = new Ordre();

        while(takeOrders) {

            ArrayList<Blomst> blomster = new ArrayList<>();
            ArrayList<String> adressedele = new ArrayList<>();
            String flowerExitValue = "Slut";
            String flowerChoice = "";
            String tilbeHoerChoice = "";
            Blomst blomst = null;

            while(!flowerChoice.equals(flowerExitValue)) {
                ui.showMessage("Vælg navn. Skriv Slut for at afslutte blomstervalg");
                view.showTilbehør();
                flowerChoice = ui.getString();
                Blomst blomst = new Blomst(flowerChoice);
                blomster.add(blomst);
            }
            ui.showMessage("Vælg tilbehør");
            view.showTilbehør();
            tilbeHoerChoice = ui.getString();
            Tilbehør tilbehør = new Tilbehør(tilbeHoerChoice);
            // Model.Adresse?
            adressedele = view.getAddress();
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
        boolean takeOrders = true;
    }

    public void runStatistics() {

    }
    public void finishTheDay() {

    }
    public void findOrder() {

    }

    public void confirmOrder() {

    }
}

