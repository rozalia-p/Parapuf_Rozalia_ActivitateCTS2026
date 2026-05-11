public class ComandaPizza implements ComandaRestaurant {
    private Bucatar bucatarSef;
    private String detaliiPizza;

    public ComandaPizza(Bucatar bucatarSef, String detaliiPizza) {
        this.bucatarSef = bucatarSef;
        this.detaliiPizza = detaliiPizza;
    }

    @Override
    public void executa() {
        bucatarSef.gatestePizza(detaliiPizza);
    }
}