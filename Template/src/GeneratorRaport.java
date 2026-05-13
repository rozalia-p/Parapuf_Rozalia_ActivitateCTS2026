public abstract class GeneratorRaport {


    public final void genereazaRaport() {
        System.out.println("--- Se incepe procesul de generare ---");
        colecteazaDate();
        formateazaInformatia();
        salveazaFisierul();
        System.out.println("-> Proces finalizat cu succes!\n");
    }


    protected abstract void colecteazaDate();
    protected abstract void formateazaInformatia();
    protected abstract void salveazaFisierul();
}