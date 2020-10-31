import Controller.MainController;
import Model.*;
import Util.ConsoleUI;
import View.View;
public class Main {

    public static void main(String[] args) {

        ConsoleUI ui = new ConsoleUI();
        View view = new View(ui);
        Bestillinger bestillinger = new Bestillinger();
        MainController mainController = new MainController(view,bestillinger);
        mainController.run();
    }
}
