
public class Main {
    public static void main(String[] args) {

        System.out.println("--- Sistem Aeroport (Facade Pattern) ---");


        Pasager pasager1 = new Pasager("Ionescu Maria", "051234567");

        System.out.println("\nSe scaneaza pasaportul la poarta de imbarcare...");


        boolean poateUrcaInAvion = FacadePoartaImbarcare.permiteImbarcarea(pasager1);

        if (poateUrcaInAvion) {
            System.out.println("Rezultat: Permiteti accesul in aeronava pentru " + pasager1.getNume() + ".");
        } else {
            System.out.println("Rezultat: Chemați securitatea. Imbarcare respinsa.");
        }
    }
}