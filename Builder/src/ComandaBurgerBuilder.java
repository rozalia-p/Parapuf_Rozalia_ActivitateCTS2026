public class ComandaBurgerBuilder implements BuilderComanda {

    private ComandaBurger comanda;

    public ComandaBurgerBuilder() {
        // Punctul de plecare: un burger simplu, fără nimic extra
        comanda = new ComandaBurger(false, false, false, false, false);
    }

    @Override
    public ComandaBurger build() {
        return comanda;
    }

    public ComandaBurgerBuilder setCartofiPrajiti(boolean cartofiPrajiti) {
        this.comanda.setCartofiPrajiti(cartofiPrajiti);
        return this;
    }

    public ComandaBurgerBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.comanda.setBauturaRacoritoare(bauturaRacoritoare);
        return this;
    }

    public ComandaBurgerBuilder setSosExtra(boolean sosExtra) {
        this.comanda.setSosExtra(sosExtra);
        return this;
    }

    public ComandaBurgerBuilder setFaraCeapa(boolean faraCeapa) {
        this.comanda.setFaraCeapa(faraCeapa);
        return this;
    }

    public ComandaBurgerBuilder setCarneDubla(boolean carneDubla) {
        this.comanda.setCarneDubla(carneDubla);
        return this;
    }
}