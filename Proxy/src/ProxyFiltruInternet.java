import java.util.ArrayList;
import java.util.List;

public class ProxyFiltruInternet implements ConexiuneInternet {


    private ConexiuneInternet internetReal;


    private List<String> siteUriBlocate;

    public ProxyFiltruInternet(ConexiuneInternet internetReal) {
        this.internetReal = internetReal;
        this.siteUriBlocate = new ArrayList<>();


        this.siteUriBlocate.add("facebook.com");
        this.siteUriBlocate.add("instagram.com");
        this.siteUriBlocate.add("tiktok.com");
        this.siteUriBlocate.add("netflix.com");
    }

    @Override
    public void conectareLa(Angajat angajat, String urlSite) {

        System.out.println("\nSe analizeaza cererea de retea pentru site-ul: " + urlSite);


        String urlVerificat = urlSite.toLowerCase();


        for (String siteInterzis : siteUriBlocate) {
            if (urlVerificat.contains(siteInterzis)) {
                System.out.println("Politica IT: Accesul la " + urlSite +
                        " este interzis in timpul programului!");
                return;
            }
        }


        System.out.println(" Site acceptat. Se ruteaza conexiunea...");
        internetReal.conectareLa(angajat, urlSite);
    }
}