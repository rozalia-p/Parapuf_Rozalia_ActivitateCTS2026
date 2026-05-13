public class RaportExcel extends GeneratorRaport {
    private String numeTabel;

    public RaportExcel(String numeTabel) {
        this.numeTabel = numeTabel;
    }

    @Override
    protected void colecteazaDate() {
        System.out.println("[EXCEL] Se extrag cifrele financiare si formulele din sistem pentru: " + numeTabel);
    }

    @Override
    protected void formateazaInformatia() {
        System.out.println("[EXCEL] Se creeaza celulele, coloanele si se aplica filtrele matematice.");
    }

    @Override
    protected void salveazaFisierul() {
        System.out.println("[EXCEL] Fisierul a fost salvat ca '" + numeTabel + ".xlsx' (Editabil).");
    }
}