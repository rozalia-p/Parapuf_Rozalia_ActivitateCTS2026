public class FactoryAviz implements FactoryDocument {
    @Override
    public DocumentContabil creareDocument() {
        return new AvizDeInsotire();
    }
}