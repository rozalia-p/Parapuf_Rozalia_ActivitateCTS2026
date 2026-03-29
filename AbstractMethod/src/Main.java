public class Main {


    public static void aplicaSetariGrafice(FactoryInterfataGrafica fabrica) {
        Buton butonAplicatie = fabrica.creareButon();
        CasetaSelectare casetaAplicatie = fabrica.creareCasetaSelectare();

        System.out.println("Se randeaza interfata...");
        butonAplicatie.afiseazaButon();
        casetaAplicatie.afiseazaCaseta();
        System.out.println("Interfata incarcata cu succes!\n");
    }

    public static void main(String[] args) {
        System.out.println("--- Sistem GUI: Abstract Factory ---");


        System.out.println("Setari sistem: LIGHT MODE");
        FactoryInterfataGrafica fabricaLight = new FactoryTemaLight();
        aplicaSetariGrafice(fabricaLight);


        System.out.println("Setari sistem: DARK MODE");
        FactoryInterfataGrafica fabricaDark = new FactoryTemaDark();
        aplicaSetariGrafice(fabricaDark);
    }
}