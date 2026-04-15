public interface NodStructura {

    void adaugaNod(NodStructura nod) throws Exception;
    void stergeNod(NodStructura nod) throws Exception;
    NodStructura getNod(int index) throws Exception;


    void afisareDetalii(String indentare);
}