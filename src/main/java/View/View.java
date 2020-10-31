package View;

import Util.ConsoleUI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class View {
    ConsoleUI ui;

    public View(ConsoleUI ui) {
        this.ui = ui;
    }
    public String getFlower(){
        String retFlower = "";
        ui.showMessage("Du kan ..");
        showFlowers();
        retFlower = ui.getString();
        return  retFlower;
    }

    public ArrayList<String> getAddress() {
        ArrayList<String> retValList = new ArrayList<>();

        ui.getString();
        return  retValList;
    }

    public void showFlowers() {
        ui.showMessage("Tulipan");
        ui.showMessage("Rose");
        ui.showMessage("Lilje");
        ui.showMessage("Georgine");
    }

    public String getTilbehør(){
        String retTilbehør = "";
        ui.showMessage("Du kan vælge:");
        showTilbehør();
        return  retTilbehør;
    }

    public void showTilbehør() {
        ui.showMessage("Ramsløg");
        ui.showMessage("Mos");
        ui.showMessage("Gran");
        ui.showMessage("Græs");
    }

}
