public class FactoryTemaDark implements FactoryInterfataGrafica {
    @Override
    public Buton creareButon() {
        return new ButonDark();
    }

    @Override
    public CasetaSelectare creareCasetaSelectare() {
        return new CasetaSelectareDark();
    }
}