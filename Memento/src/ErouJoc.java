public class ErouJoc {
    private String numeErou;
    private int nivelCurent;
    private int viata;
    private String locatieCurenta;

    public ErouJoc(String numeErou) {
        this.numeErou = numeErou;
        this.nivelCurent = 1;
        this.viata = 100;
        this.locatieCurenta = "Satul de Incepatori";
    }


    public void avanseazaInJoc(int nivelNou, String locatieNoua) {
        this.nivelCurent = nivelNou;
        this.locatieCurenta = locatieNoua;
        System.out.println("[" + numeErou + "] a avansat in " + locatieNoua + " (Nivel " + nivelCurent + ").");
    }

    public void incaseazaDamage(int damage) {
        this.viata -= damage;
        System.out.println("[" + numeErou + "] a luat damage! Viata ramasa: " + viata + " HP.");
    }


    public MementoSalvare salvareRapida() {
        System.out.println("[SISTEM] S-a creat un Quick Save.");
        return new MementoSalvare(this.nivelCurent, this.viata, this.locatieCurenta);
    }


    public void incarcaSalvare(MementoSalvare salvareVeche) {
        this.nivelCurent = salvareVeche.getNivelSalvat();
        this.viata = salvareVeche.getViataSalvata();
        this.locatieCurenta = salvareVeche.getLocatieSalvata();
        System.out.println("[SISTEM] Game Loaded! Te-ai intors in " + locatieCurenta + " cu " + viata + " HP.");
    }

    public void afiseazaStatus() {
        System.out.println("-> STATUS EROU: " + numeErou + " | Nivel: " + nivelCurent + " | Viata: " + viata + " HP | Locatie: " + locatieCurenta);
    }
}