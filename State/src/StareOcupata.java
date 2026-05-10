public class StareOcupata implements StareRezervare {
    @Override
    public void schimbaStare(RezervareHotel rezervare) {
        System.out.println(" Clientul " + rezervare.getNumeClient() +
                " s-a prezentat la hotel. S-au predat cheile. Camera este OCUPATA.");
        rezervare.setStare(this);
    }

    @Override
    public String toString() {
        return "Status: OCUPATA (Check-In efectuat)";
    }
}