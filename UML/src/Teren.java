public class Teren extends Proprietate{

    int rang;

    public Teren(Adresa adresa, int suprafata, int rang) {
        super(adresa, suprafata);
        this.rang = rang;
    }

    @Override
    public int getCost() {
        return (350 * suprafata) / rang;
    }

    @Override
    public String getDescriere() {
        return "Teren" + "\nAdresa: " + adresa + "\nSuprafata: " + suprafata + "\nRang: " + rang + "\nCost: " + getCost();
    }
}
