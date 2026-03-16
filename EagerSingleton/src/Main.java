public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testare Singleton Eager ---");


        ConfigurareSistem config1 = ConfigurareSistem.getInstanta();
        ConfigurareSistem config2 = ConfigurareSistem.getInstanta();

        if (config1 == config2) {
            System.out.println("Succes: config1 si config2 sunt EXACT aceeasi instanaa.");
        } else {
            System.out.println("Eroare: Sunt obiecte diferite.");
        }
    }
}