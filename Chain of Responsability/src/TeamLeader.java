public class TeamLeader extends Aprobator {
    @Override
    public void aprobaCerere(CerereCheltuiala cerere) {
        if (cerere.getSuma() < 1000) {
            System.out.println(" [TEAM LEADER] Am aprobat achizitia: '" + cerere.getDescriere() + "' (" + cerere.getSuma() + " RON).");
        } else {
            if (super.succesor != null) {
                System.out.println("   [Team Leader] Suma e prea mare pentru mine. O trimit la Director...");
                super.succesor.aprobaCerere(cerere);
            }
        }
    }
}