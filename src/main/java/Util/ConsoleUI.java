package Util;
import java.util.Scanner;

public class ConsoleUI {
    Scanner ms;
    public ConsoleUI() {
        ms = new Scanner(System.in);
    }

    public String getString() {
        String msg = "";
        msg = ms.nextLine();
        return msg;
    }
    public int getInt() {
        int retVal = 0;
        retVal = ms.nextInt();
        return retVal;
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }

}
