public class StareInAsteptare implements StareRezervare {
    @Override
    public void schimbaStare(RezervareHotel rezervare) {
        System.out.println("Rezervarea pentru " + rezervare.getNumeClient() +
                " (Camera " + rezervare.getNumarCamera() + ") este IN ASTEPTARE. Se asteapta avansul.");

        rezervare.setStare(this);
    }

    @Override
    public String toString() {
        return "Status: IN ASTEPTARE";
    }
}