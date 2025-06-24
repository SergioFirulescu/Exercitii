//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contribuabil c = new Contribuabil("Ion Popescu", "1234567890123");

        c.adaugaProprietate(new Cladire(new Adresa("V Parvan", 2), 20));
        c.adaugaProprietate(new Teren(new Adresa("V Parvan", 2), 10, 1));
        c.adaugaProprietate(new Cladire(new Adresa("Lugoj", 4), 25));

        c.afiseazaFluturas();
    }
}