
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Organigrama Companiei (Composite Pattern) ---\n");

        try {

            NodStructura companie = new Departament("Compania Tech IT");


            NodStructura depIT = new Departament("Departament IT");
            NodStructura depHR = new Departament("Resurse Umane");


            NodStructura echipaDev = new Departament("Echipa Dezvoltare Software");


            NodStructura hr1 = new Angajat("Maria Popescu", "Recruiter");
            NodStructura dev1 = new Angajat("Andrei Ionescu", "Senior Java Dev");
            NodStructura dev2 = new Angajat("Elena Vasile", "Junior Front-End");
            NodStructura managerIT = new Angajat("Ionut Radu", "IT Manager");


            depHR.adaugaNod(hr1);


            echipaDev.adaugaNod(dev1);
            echipaDev.adaugaNod(dev2);


            depIT.adaugaNod(managerIT);
            depIT.adaugaNod(echipaDev);


            companie.adaugaNod(depIT);
            companie.adaugaNod(depHR);


            companie.afisareDetalii("");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}