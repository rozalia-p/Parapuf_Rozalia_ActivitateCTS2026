public class SistemGPS {

    private ModNavigatie strategieCurenta;

    public SistemGPS(ModNavigatie strategieInitiala) {
        this.strategieCurenta = strategieInitiala;
    }


    public void setStrategie(ModNavigatie nouaStrategie) {
        this.strategieCurenta = nouaStrategie;
    }

    public void pornesteNavigatia(String plecare, String destinatie) {
        if(strategieCurenta != null) {
            strategieCurenta.calculeazaRuta(plecare, destinatie);
        } else {
            System.out.println("Eroare: Niciun mod de navigatie selectat!");
        }
    }
}