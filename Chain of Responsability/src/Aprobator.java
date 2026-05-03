public abstract class Aprobator {


    protected Aprobator succesor;

    public void setSuccesor(Aprobator succesor) {
        this.succesor = succesor;
    }


    public abstract void aprobaCerere(CerereCheltuiala cerere);
}