public class FacturaRestaurant {
    private String client;
    private double totalDePlata;


    private ModPlata strategieCurenta;

    public FacturaRestaurant(String client, double totalDePlata) {
        this.client = client;
        this.totalDePlata = totalDePlata;

        this.strategieCurenta = new PlataCash();
    }

    public void setModPlata(ModPlata nouaStrategie) {
        this.strategieCurenta = nouaStrategie;
    }

    public void incaseaza() {
        System.out.println("\n--- Se proceseaza nota pentru masa lui " + client + " ---");
        if (strategieCurenta != null) {

            strategieCurenta.proceseazaPlata(client, totalDePlata);
        }
    }
}