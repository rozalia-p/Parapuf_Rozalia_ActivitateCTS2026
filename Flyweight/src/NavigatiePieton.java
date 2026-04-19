public class NavigatiePieton implements ModNavigatie {
    @Override
    public void calculeazaRuta(String plecare, String destinatie) {
        System.out.println(" Ruta PIETON intre " + plecare + " si " + destinatie +
                ": Traseu scurt prin centrul vechi si zone exclusiv pietonale.");
    }
}