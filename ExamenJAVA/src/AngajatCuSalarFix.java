public class AngajatCuSalarFix extends Angajat{
    private double salariuFix;

    public AngajatCuSalarFix(String nume, double salariuFix) {
        super(nume);
        this.salariuFix = salariuFix;
    }

    @Override
    public double calculSalar() {
        return this.salariuFix;
    }

    public void schimbaSalariulFix(double salarNou) {
        this.salariuFix = salarNou;
    }
}
