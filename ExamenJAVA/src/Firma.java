import java.util.ArrayList;

public class Firma {
    ArrayList<Angajat> angajati = new ArrayList<Angajat>();
    double sumaSalar;

    public boolean angajeaza(Angajat angajat) {
        for  (Angajat angajatx : angajati) {
            if(angajatx.nume.equals(angajat.nume) ) {
                return false;
            }
        }
        angajati.add(angajat);
        return true;
    }

    public double salariuMediu() {
        if (angajati.size() != 0) {
            for (Angajat angajatx : angajati) {
                sumaSalar += angajatx.calculSalar();
            }
            return sumaSalar / angajati.size();
        } else  {
            return 0;
        }
    }
}
