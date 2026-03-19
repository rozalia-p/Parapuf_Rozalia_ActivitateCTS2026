public class PlataCard implements Plata {
    @Override
    public void proceseazaPlata(double suma) {
        System.out.println("S-a procesat plata cu CARDUL in valoare de " + suma + " RON.");
    }
}