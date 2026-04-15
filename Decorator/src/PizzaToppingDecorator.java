public abstract class PizzaToppingDecorator implements Pizza {

    protected Pizza pizzaDecorata;

    public PizzaToppingDecorator(Pizza pizzaDecorata) {
        this.pizzaDecorata = pizzaDecorata;
    }

    @Override
    public void prepare() {
        this.pizzaDecorata.prepare();
    }
}
