public class PlataTransferBancar implements Plata {
    @Override
    public void proceseazaPlata(double suma) {
        System.out.println("S-a generat factura pentru TRANSFER BANCAR in valoare de " + suma + " RON.");
    }
}