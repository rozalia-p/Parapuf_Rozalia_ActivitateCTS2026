public class DecoratorPepperoni extends PizzaToppingDecorator {

    public DecoratorPepperoni(Pizza pizzaDecorata) {
        super(pizzaDecorata);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println(" + [EXTRA] Adaugare felii de pepperoni picante.");
    }
}