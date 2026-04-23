public class PlataCash implements ModPlata {
    @Override
    public void proceseazaPlata(String numeClient, double suma) {
        System.out.println(numeClient + " a platit " + suma + " RON cu bani gheata (Cash). Se elibereaza restul.");
    }
}