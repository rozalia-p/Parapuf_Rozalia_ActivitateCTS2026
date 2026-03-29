public class ProgramatorIntern implements AngajatCompanie {
    private String nume;

    public ProgramatorIntern(String nume) {
        this.nume = nume;
    }

    @Override
    public void platesteSalariu(double suma) {
        System.out.println("Angajatul intern " + nume + " a primit salariul de: " + suma + " RON direct pe cardul de salariu.");
    }
}