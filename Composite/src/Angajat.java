
public class Angajat implements NodStructura {
    private String nume;
    private String functie;

    public Angajat(String nume, String functie) {
        this.nume = nume;
        this.functie = functie;
    }

    @Override
    public void adaugaNod(NodStructura nod) throws Exception {
        throw new Exception("Eroare: Un simplu angajat nu poate avea subalterni directi in acest sistem!");
    }

    @Override
    public void stergeNod(NodStructura nod) throws Exception {
        throw new Exception("Eroare: Un simplu angajat nu are subalterni de sters!");
    }

    @Override
    public NodStructura getNod(int index) throws Exception {
        throw new Exception("Eroare: Operatiune invalida pentru un angajat.");
    }

    @Override
    public void afisareDetalii(String indentare) {

        System.out.println(indentare + " Angajat: " + nume + " [" + functie + "]");
    }
}