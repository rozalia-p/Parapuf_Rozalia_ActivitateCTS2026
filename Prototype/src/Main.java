

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Game Engine: Prototype Pattern ---");


        InamicJoc prototipOrc = new InamicJoc("Orc Razboinic", 100);
        System.out.println("Prototip generat: " + prototipOrc);
        System.out.println("--------------------------------------------------");


        System.out.println(" Se genereaza Inamicul 1 (Clonă standard)...");
        InamicJoc inamic1 = (InamicJoc) prototipOrc.cloneaza();

        System.out.println(" Se genereaza Inamicul 2 (Il transformam în Capitan)...");
        InamicJoc inamic2 = (InamicJoc) prototipOrc.cloneaza();


        inamic2.setPuncteViata(250);
        inamic2.adaugaAbilitate("Strigat de lupta (Creste atacul aliatilor)");

        System.out.println("\n--- SITUATIA PE HARTA ---");
        System.out.println("Prototip original : " + prototipOrc);
        System.out.println("Inamicul 1 (Soldat): " + inamic1);
        System.out.println("Inamicul 2 (Boss)  : " + inamic2);
    }
}