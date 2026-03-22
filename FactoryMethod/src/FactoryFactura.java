public class FactoryFactura implements FactoryDocument {
    @Override
    public DocumentContabil creareDocument() {
        return new Factura();
    }
}