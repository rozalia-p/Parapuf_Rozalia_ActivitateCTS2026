public class Main {
    public static void main(String[] args) {

        System.out.println("--- Sistem Comenzi Burgeri (Builder Pattern) ---");
        ComandaBurger meniuComplet = new ComandaBurgerBuilder()
                .setCartofiPrajiti(true)
                .setBauturaRacoritoare(true)
                .setFaraCeapa(true)
                .build();

        System.out.println("Comanda 1 (Meniu complet, fara ceapa):");
        System.out.println(meniuComplet);
        System.out.println("--------------------------------------------------");


        ComandaBurger burgerSatios = new ComandaBurgerBuilder()
                .setCarneDubla(true)
                .setSosExtra(true)
                .build();

        System.out.println("Comanda 2 (Burger dublu, extra sos):");
        System.out.println(burgerSatios);
        System.out.println("--------------------------------------------------");

        ComandaBurger burgerSimplu = new ComandaBurgerBuilder()
                .build();

        System.out.println("Comanda 3 (Simplu):");
        System.out.println(burgerSimplu);
    }
}