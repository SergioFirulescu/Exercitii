public abstract class Proprietate {
    Adresa adresa;
    int suprafata;

    public Proprietate(Adresa adresa, int suprafata) {
        this.adresa = adresa;
        this.suprafata = suprafata;
    }

    public abstract int getCost();

    public abstract String getDescriere();
}
