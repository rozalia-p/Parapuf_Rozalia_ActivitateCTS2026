public class FacadePoartaImbarcare {


    public static boolean permiteImbarcarea(Pasager pasager) {

        System.out.println("--- START VERIFICARI SECURITATE AEROPORT ---");

        if (!CompanieAeriana.areBiletValid(pasager)) {
            System.out.println("Respins: Pasagerul nu are bilet valid pentru acest zbor.");
            return false;
        }

        if (!PolitiaDeFrontiera.areDreptDeParasireTara(pasager)) {
            System.out.println("Respins: Pasagerul are interdictie de calatorie.");
            return false;
        }

        if (!SistemBagaje.nuAreBagajSuspect(pasager)) {
            System.out.println("Respins: Alerta de securitate la scanarea bagajului.");
            return false;
        }

        System.out.println("--- TOATE VERIFICARILE AU TRECUT CU SUCCES ---");
        return true;
    }
}