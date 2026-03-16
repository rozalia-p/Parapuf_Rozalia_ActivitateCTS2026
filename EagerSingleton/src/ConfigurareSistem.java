public class ConfigurareSistem {
    private String versiune;
    private String limbaUtilizator;
    private boolean modDebug;


    private static final ConfigurareSistem instanta = new ConfigurareSistem();

    private ConfigurareSistem() {
        this.versiune = "v2.4.0";
        this.limbaUtilizator = "Română";
        this.modDebug = false;
    }


    public static ConfigurareSistem getInstanta() {
        return instanta;
    }


    public String getVersiune() {
        return versiune;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }

    public String getLimbaUtilizator() {
        return limbaUtilizator;
    }

    public void setLimbaUtilizator(String limbaUtilizator) {
        this.limbaUtilizator = limbaUtilizator;
    }

    public boolean isModDebug() {
        return modDebug;
    }

    public void setModDebug(boolean modDebug) {
        this.modDebug = modDebug;
    }

    @Override
    public String toString() {
        return "ConfigurareSistem [Versiune: " + versiune +
                ", Limba: " + limbaUtilizator +
                ", Debug: " + modDebug + "]";
    }
}