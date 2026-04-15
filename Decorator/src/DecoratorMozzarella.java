public class DecoratorMozzarella extends PizzaToppingDecorator {

    public DecoratorMozzarella(Pizza pizzaDecorata) {
        super(pizzaDecorata);
    }

    @Override
    public void prepare() {

        super.prepare();

        System.out.println(" + [EXTRA] Adaugare mozzarella din belsug.");
    }
}