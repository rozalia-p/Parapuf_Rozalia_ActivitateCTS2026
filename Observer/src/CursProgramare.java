public class CursProgramare extends PlatformaElearning {

    public CursProgramare(String numeCurs) {
        super(numeCurs);
    }


    public void incarcaMaterialNou(String titluDocument) {
        System.out.println("\n[SISTEM " + super.getNumeCurs() + "] Profesorul a incarcat un fisier nou.");

        String mesaj = "S-a adaugat materialul: '" + titluDocument + "'. Va rugam sa il parcurgeti!";
        super.notificaStudentii(mesaj);
    }


    public void programeazaExamen(String dataExamen) {
        System.out.println("\n[SISTEM " + super.getNumeCurs() + "] Profesorul a setat data examenului.");

        String mesaj = "Atentie! Examenul final va avea loc pe data de " + dataExamen + ". Spor la invatat!";
        super.notificaStudentii(mesaj);
    }
}