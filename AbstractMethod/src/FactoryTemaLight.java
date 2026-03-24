public class FactoryTemaLight implements FactoryInterfataGrafica {
    @Override
    public Buton creareButon() {
        return new ButonLight();
    }

    @Override
    public CasetaSelectare creareCasetaSelectare() {
        return new CasetaSelectareLight();
    }
}