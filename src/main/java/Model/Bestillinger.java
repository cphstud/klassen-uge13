package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestillinger {
    ArrayList<Ordre> orders;
    LocalDate localDate;
    public Bestillinger() {
        orders = new ArrayList<>();
        localDate = LocalDate.now();
    }

    public void addOrder(Ordre ordre) {
        orders.add(ordre);
    }

    public ArrayList<Ordre> getOrders() {
        return orders;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
