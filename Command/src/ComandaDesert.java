public class ComandaDesert implements ComandaRestaurant {
    private Bucatar bucatarSef;
    private String detaliiDesert;

    public ComandaDesert(Bucatar bucatarSef, String detaliiDesert) {
        this.bucatarSef = bucatarSef;
        this.detaliiDesert = detaliiDesert;
    }

    @Override
    public void executa() {
        bucatarSef.pregatesteDesert(detaliiDesert);
    }
}