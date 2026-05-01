import java.util.ArrayList;
import java.util.List;

public abstract class PlatformaElearning {
    private String numeCurs;


    private List<AbonatCurs> listaStudenti;

    public PlatformaElearning(String numeCurs) {
        this.numeCurs = numeCurs;
        this.listaStudenti = new ArrayList<>();
    }

    public String getNumeCurs() {
        return numeCurs;
    }


    public void inroleazaStudent(AbonatCurs student) {
        listaStudenti.add(student);
    }


    public void retrageStudent(AbonatCurs student) {
        listaStudenti.remove(student);
    }


    public void notificaStudentii(String mesaj) {
        for (AbonatCurs student : listaStudenti) {
            student.primesteNotificare(mesaj);
        }
    }
}