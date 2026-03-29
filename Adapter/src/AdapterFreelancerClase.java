public class AdapterFreelancerClase extends FreelancerExtern implements AngajatCompanie {

    private String contIBAN;

    public AdapterFreelancerClase(String numeFreelancer, String contIBAN) {
        super(numeFreelancer);
        this.contIBAN = contIBAN;
    }

    @Override
    public void platesteSalariu(double suma) {

        super.incaseazaFactura(suma, this.contIBAN);
    }
}