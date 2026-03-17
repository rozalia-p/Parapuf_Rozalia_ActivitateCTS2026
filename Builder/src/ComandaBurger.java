public class ComandaBurger {
    private boolean cartofiPrajiti;
    private boolean bauturaRacoritoare;
    private boolean sosExtra;
    private boolean faraCeapa;
    private boolean carneDubla;

    public ComandaBurger(boolean cartofiPrajiti, boolean bauturaRacoritoare, boolean sosExtra, boolean faraCeapa, boolean carneDubla) {
        super();
        this.cartofiPrajiti = cartofiPrajiti;
        this.bauturaRacoritoare = bauturaRacoritoare;
        this.sosExtra = sosExtra;
        this.faraCeapa = faraCeapa;
        this.carneDubla = carneDubla;
    }

    public boolean isCartofiPrajiti() {
        return cartofiPrajiti;
    }

    public void setCartofiPrajiti(boolean cartofiPrajiti) {
        this.cartofiPrajiti = cartofiPrajiti;
    }

    public boolean isBauturaRacoritoare() {
        return bauturaRacoritoare;
    }

    public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
    }

    public boolean isSosExtra() {
        return sosExtra;
    }

    public void setSosExtra(boolean sosExtra) {
        this.sosExtra = sosExtra;
    }

    public boolean isFaraCeapa() {
        return faraCeapa;
    }

    public void setFaraCeapa(boolean faraCeapa) {
        this.faraCeapa = faraCeapa;
    }

    public boolean isCarneDubla() {
        return carneDubla;
    }

    public void setCarneDubla(boolean carneDubla) {
        this.carneDubla = carneDubla;
    }

    @Override
    public String toString() {
        return "ComandaBurger [cartofiPrajiti=" + cartofiPrajiti + ", bauturaRacoritoare=" + bauturaRacoritoare
                + ", sosExtra=" + sosExtra + ", faraCeapa=" + faraCeapa + ", carneDubla=" + carneDubla + "]";
    }
}