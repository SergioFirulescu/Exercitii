public class AngajatCuOra extends Angajat{
    private int oreAgreatePeLuna;
    private double salariuPeOra;

    public AngajatCuOra(String nume, int oreAgreatePeLuna, double salariuPeOra) {
        super(nume);
        this.oreAgreatePeLuna = oreAgreatePeLuna;
        this.salariuPeOra = salariuPeOra;
    }

    public void adaugaOre(int ore) {
        this.oreAgreatePeLuna += ore;
    }

    public void schimbareSalariuPeOra(int salariu) {
        this.salariuPeOra = salariu;
    }

    public double calculSalar() {
        return this.salariuPeOra * this.oreAgreatePeLuna;
    }

}
