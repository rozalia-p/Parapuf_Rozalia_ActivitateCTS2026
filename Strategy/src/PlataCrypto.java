public class PlataCrypto implements ModPlata {
    @Override
    public void proceseazaPlata(String numeClient, double suma) {
        System.out.println(numeClient + " a platit " + suma + " RON folosind portofelul electronic (Bitcoin/NFC). Verificare blockchain...");
    }
}