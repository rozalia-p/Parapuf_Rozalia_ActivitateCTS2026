public class PlataCash implements Plata {
    @Override
    public void proceseazaPlata(double suma) {
        System.out.println("S-a procesat plata CASH (ramburs la curier) in valoare de " + suma + " RON.");
    }
}