
import java.util.ArrayList;
import java.util.List;

public class Departament implements NodStructura {
    private String numeDepartament;

    private List<NodStructura> subNoduri;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.subNoduri = new ArrayList<>();
    }

    @Override
    public void adaugaNod(NodStructura nod) {
        subNoduri.add(nod);
    }

    @Override
    public void stergeNod(NodStructura nod) {
        subNoduri.remove(nod);
    }

    @Override
    public NodStructura getNod(int index) {
        if (index >= 0 && index < subNoduri.size()) {
            return subNoduri.get(index);
        }
        return null;
    }

    @Override
    public void afisareDetalii(String indentare) {
        System.out.println(indentare + " DEPARTAMENT: " + numeDepartament);


        for (NodStructura nod : subNoduri) {
            nod.afisareDetalii(indentare + "    ");
        }
    }
}