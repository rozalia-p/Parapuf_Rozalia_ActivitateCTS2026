
public class Main {


    public static void generareSiTiparire(FactoryDocument fabrica) {

        DocumentContabil document = fabrica.creareDocument();
        document.tiparesteDocument();
    }

    public static void main(String[] args) {

        System.out.println("--- Sistem Gestiune: Factory Method ---");


        FactoryDocument fabricaFacturi = new FactoryFactura();
        generareSiTiparire(fabricaFacturi);

        System.out.println("----------------------------------------");


        FactoryDocument fabricaChitante = new FactoryChitanta();
        generareSiTiparire(fabricaFacturi);
        generareSiTiparire(fabricaChitante);

        System.out.println("----------------------------------------");


        FactoryDocument fabricaAvize = new FactoryAviz();
        generareSiTiparire(fabricaAvize);
    }
}