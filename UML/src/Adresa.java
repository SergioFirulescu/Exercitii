public class Adresa {
    String strada;
    int numar;

    public Adresa(String strada, int numar) {
        this.strada = strada;
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "Strada: " + strada + ", Numar: " + numar;
    }
}
