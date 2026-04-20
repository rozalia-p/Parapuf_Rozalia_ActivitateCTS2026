public class InternetReal implements ConexiuneInternet {

    @Override
    public void conectareLa(Angajat angajat, String urlSite) {

        System.out.println(" Angajatul " + angajat.getNume() +
                " s-a conectat cu succes la: " + urlSite);
        System.out.println("   Se descarca resursele paginii...");
    }
}