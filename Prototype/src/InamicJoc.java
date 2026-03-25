import java.util.ArrayList;
import java.util.List;

public class InamicJoc implements PrototipInamic {
    private String tip;
    private int puncteViata;
    private List<String> abilitati;


    public InamicJoc(String tip, int puncteViata) {
        System.out.println("⏳ [LOADING] Se descarca modelul 3D, texturile si animațiile pentru: " + tip + "...");
        this.tip = tip;
        this.puncteViata = puncteViata;
        this.abilitati = new ArrayList<>();


        this.abilitati.add("Atac cu sabia");
        this.abilitati.add("Patrulare zona");
    }


    private InamicJoc(String tip, int puncteViata, List<String> abilitati) {
        this.tip = tip;
        this.puncteViata = puncteViata;

        this.abilitati = new ArrayList<>(abilitati);
    }

    @Override
    public PrototipInamic cloneaza() {

        return new InamicJoc(this.tip, this.puncteViata, this.abilitati);
    }


    public void adaugaAbilitate(String abilitateNoua) {
        this.abilitati.add(abilitateNoua);
    }

    public void setPuncteViata(int puncteViata) {
        this.puncteViata = puncteViata;
    }

    public List<String> getAbilitati() {
        return abilitati;
    }

    @Override
    public String toString() {
        return "Inamic [Tip=" + tip + ", HP=" + puncteViata + ", Abilitati=" + abilitati + "]";
    }
}