import java.util.ArrayList;
import java.util.List;

public class Ospatar {

    private List<ComandaRestaurant> carnetelComenzi;

    public Ospatar() {
        this.carnetelComenzi = new ArrayList<>();
    }


    public void preiaComandaDeLaClient(ComandaRestaurant comanda) {
        carnetelComenzi.add(comanda);
        System.out.println("[OSPATAR] Am notat comanda pe carnetel.");
    }


    public void trimiteComenziLaBucatarie() {
        System.out.println("\n--- Ospatarul a predat bonul in bucatarie! (" + carnetelComenzi.size() + " preparate) ---");

        for (ComandaRestaurant comanda : carnetelComenzi) {
            comanda.executa();
        }

        carnetelComenzi.clear();
        System.out.println("--- Bonul a fost procesat integral ---\n");
    }
}