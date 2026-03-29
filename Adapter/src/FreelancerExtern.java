public class FreelancerExtern {
    private String numeFreelancer;

    public FreelancerExtern(String numeFreelancer) {
        this.numeFreelancer = numeFreelancer;
    }

    public void incaseazaFactura(double valoareFactura, String contIBAN) {
        System.out.println("Freelancerul " + numeFreelancer + " a incasat factura de " + valoareFactura + " RON in contul: " + contIBAN);
    }
}