
public class RaportPDF extends GeneratorRaport {
    private String titluDocument;

    public RaportPDF(String titluDocument) {
        this.titluDocument = titluDocument;
    }

    @Override
    protected void colecteazaDate() {
        System.out.println("[PDF] Se extrag datele textuale din baza de date pentru: " + titluDocument);
    }

    @Override
    protected void formateazaInformatia() {
        System.out.println("[PDF] Se adauga logo-ul companiei si se aranjeaza textul in pagini A4.");
    }

    @Override
    protected void salveazaFisierul() {
        System.out.println("[PDF] Fisierul a fost exportat ca '" + titluDocument + ".pdf' (Read-Only).");
    }
}