public class FactoryChitanta implements FactoryDocument {
    @Override
    public DocumentContabil creareDocument() {
        return new Chitanta();
    }
}