public class PlataCardBancar implements ModPlata {
    @Override
    public void proceseazaPlata(String numeClient, double suma) {
        System.out.println(numeClient + " a platit " + suma + " RON cu cardul. Se conecteaza la terminalul POS... Tranzactie aprobata.");
    }
}