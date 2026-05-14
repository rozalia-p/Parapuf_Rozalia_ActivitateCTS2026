

public class MementoSalvare {

    private int nivelSalvat;
    private int viataSalvata;
    private String locatieSalvata;

    public MementoSalvare(int nivel, int viata, String locatie) {
        this.nivelSalvat = nivel;
        this.viataSalvata = viata;
        this.locatieSalvata = locatie;
    }

    public int getNivelSalvat() {
        return nivelSalvat;
    }

    public int getViataSalvata() {
        return viataSalvata;
    }

    public String getLocatieSalvata() {
        return locatieSalvata;
    }
}