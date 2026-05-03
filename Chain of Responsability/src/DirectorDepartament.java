public class DirectorDepartament extends Aprobator {
    @Override
    public void aprobaCerere(CerereCheltuiala cerere) {
        if (cerere.getSuma() >= 1000 && cerere.getSuma() < 5000) {
            System.out.println("[DIRECTOR] Am analizat si aprobat bugetul pentru: '" + cerere.getDescriere() + "' (" + cerere.getSuma() + " RON).");
        } else {
            if (super.succesor != null) {
                System.out.println("   [Director] Asta e o cheltuiala majora. O trimit direct la CEO...");
                super.succesor.aprobaCerere(cerere);
            }
        }
    }
}