public class Student implements AbonatCurs {
    private String nume;

    public Student(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("[" + nume + "] Ai o alerta noua de la curs: " + mesaj);
    }
}