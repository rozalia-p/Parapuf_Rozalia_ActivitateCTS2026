public class Main {

    // Sistemul de HR acceptă DOAR obiecte de tip AngajatCompanie
    public static void procesarePlataHR(AngajatCompanie angajat, double suma) {
        angajat.platesteSalariu(suma);
    }

    public static void main(String[] args) {
        System.out.println("--- Sistem HR: Plata Angajatilor (Adapter Pattern) ---");

        // 1. Cazul fericit (angajat intern)
        System.out.println("\n1. Plata Angajat Intern:");
        AngajatCompanie angajat1 = new ProgramatorIntern("Popescu Ion");
        procesarePlataHR(angajat1, 5000);

        // 2. Cazul cu Adapter de Obiecte
        System.out.println("\n2. Plata Freelancer prin Adapter de Obiecte:");
        FreelancerExtern freelancer1 = new FreelancerExtern("Ionescu Maria");

        AngajatCompanie adapterObiecte = new AdapterFreelancerObiecte(freelancer1, "RO12INGB34567890");
        procesarePlataHR(adapterObiecte, 3500);

        // 3. Cazul cu Adapter de Clase
        System.out.println("\n3. Plata Freelancer prin Adapter de Clase:");
        // Instantiem direct adapterul care le face pe amandoua
        AngajatCompanie adapterClase = new AdapterFreelancerClase("Vasile Andrei", "RO98BTRL12345678");
        procesarePlataHR(adapterClase, 4200);
    }
}