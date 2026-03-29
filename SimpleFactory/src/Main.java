public class Main {
    public static void main(String[] args) {

        System.out.println("--- Sistem E-Commerce: Simple Factory ---");

        // Instanțiem Factory-ul
        FactoryPlata factoryPlata = new FactoryPlata();

        try {

            Plata plataClient1 = factoryPlata.crearePlata(TipPlata.CARD);
            Plata plataClient2 = factoryPlata.crearePlata(TipPlata.CASH);
            Plata plataClient3 = factoryPlata.crearePlata(TipPlata.TRANSFER_BANCAR);


            plataClient1.proceseazaPlata(150.50);
            plataClient2.proceseazaPlata(45.00);
            plataClient3.proceseazaPlata(1200.00);

        } catch (Exception e) {
            System.out.println("Eroare la procesarea comenzii: " + e.getMessage());
        }
    }
}