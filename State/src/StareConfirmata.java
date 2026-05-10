public class StareConfirmata implements StareRezervare {
    @Override
    public void schimbaStare(RezervareHotel rezervare) {
        System.out.println("Avansul a fost platit! Camera " + rezervare.getNumarCamera() +
                " este acum CONFIRMATA definitiv pentru " + rezervare.getNumeClient() + ".");
        rezervare.setStare(this);
    }

    @Override
    public String toString() {
        return "Status: CONFIRMATA";
    }
}