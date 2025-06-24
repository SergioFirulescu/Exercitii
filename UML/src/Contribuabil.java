import java.util.ArrayList;
import java.util.List;

public class Contribuabil {
    String nume;
    String cnp;
    List<Proprietate> proprietati = new ArrayList<>();

    public Contribuabil(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public void adaugaProprietate(Proprietate p) {
        proprietati.add(p);
    }

    public int getSumaTotala() {
        int suma = 0;
        for (Proprietate p : proprietati) {
            suma += p.getCost();
        }
        return suma;
    }

    public void afiseazaFluturas() {
        System.out.println("Contribuabil: " + nume);
        System.out.println("Proprietati");

        for (Proprietate p : proprietati) {
            System.out.println(p.getDescriere() + "\n");
        }

        System.out.println("Suma totala: " + getSumaTotala());
    }
}
