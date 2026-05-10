public class RezervareHotel {
    private String numeClient;
    private int numarCamera;


    private StareRezervare stareCurenta;

    public RezervareHotel(String numeClient, int numarCamera) {
        this.numeClient = numeClient;
        this.numarCamera = numarCamera;
        this.stareCurenta = null;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNumarCamera() {
        return numarCamera;
    }


    public void setStare(StareRezervare stare) {
        this.stareCurenta = stare;
    }

    public StareRezervare getStare() {
        return stareCurenta;
    }
}