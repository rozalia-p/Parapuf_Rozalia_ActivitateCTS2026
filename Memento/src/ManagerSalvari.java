import java.util.ArrayList;
import java.util.List;

public class ManagerSalvari {

    private List<MementoSalvare> sloturiSalvare;

    public ManagerSalvari() {
        this.sloturiSalvare = new ArrayList<>();
    }


    public void adaugaSalvare(MementoSalvare salvare) {
        sloturiSalvare.add(salvare);
    }


    public MementoSalvare getSalvare(int indexSlot) {
        if (indexSlot >= 0 && indexSlot < sloturiSalvare.size()) {
            return sloturiSalvare.get(indexSlot);
        }
        return null;
    }
}