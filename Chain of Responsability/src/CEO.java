public class CEO extends Aprobator {
    @Override
    public void aprobaCerere(CerereCheltuiala cerere) {
        if (cerere.getSuma() >= 5000) {
            System.out.println("[CEO] Se aproba investitia strategica pentru: '" + cerere.getDescriere() + "' (" + cerere.getSuma() + " RON).");
        } else {
            System.out.println("   [CEO] Eroare: Nu ar fi trebuit sa ajunga la mine o suma asa mica!");
        }
    }
}