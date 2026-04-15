public class Main {
    public static void main(String[] args) {
        System.out.println("--- Pizzerie: Sistem Toppings (Decorator Pattern) ---");

        System.out.println("\nClientul 1 (Pizza Simpla):");
        Pizza pizzaSimpla = new PizzaDeBaza();
        pizzaSimpla.prepare();


        System.out.println("\nClientul 2 (Cu Mozzarella):");

        Pizza pizzaCuMozzarella = new DecoratorMozzarella(pizzaSimpla);
        pizzaCuMozzarella.prepare();


        System.out.println("\nClientul 3 (Mozzarella + Pepperoni):");
        Pizza pizzaCompleta = new DecoratorPepperoni(pizzaCuMozzarella);
        pizzaCompleta.prepare();
    }
}