public class FactoryPlata {

    // Metoda de fabricare
    public Plata crearePlata(TipPlata tip) throws Exception {
        switch (tip) {
            case CARD:
                return new PlataCard();
            case CASH:
                return new PlataCash();
            case TRANSFER_BANCAR:
                return new PlataTransferBancar();
            default:
                throw new Exception("Tipul de plata introdus nu este suportat!");
        }
    }
}