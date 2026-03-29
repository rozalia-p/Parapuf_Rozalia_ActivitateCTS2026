public class AdapterFreelancerObiecte implements AngajatCompanie {


    private FreelancerExtern freelancer;
    private String contIBAN; // Parametrul extra necesar

    public AdapterFreelancerObiecte(FreelancerExtern freelancer, String contIBAN) {
        this.freelancer = freelancer;
        this.contIBAN = contIBAN;
    }

    @Override
    public void platesteSalariu(double suma) {

        this.freelancer.incaseazaFactura(suma, this.contIBAN);
    }
}