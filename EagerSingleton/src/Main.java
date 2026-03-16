public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testare Singleton Eager ---");


        ConfigurareSistem config1 = ConfigurareSistem.getInstanta();
        ConfigurareSistem config2 = ConfigurareSistem.getInstanta();

        if (config1 == config2) {
            System.out.println("Succes: config1 și config2 sunt EXACT aceeași instanță.");
        } else {
            System.out.println("Eroare: Sunt obiecte diferite (ceea ce nu ar trebui să se întâmple la Singleton).");
        }
    }
}