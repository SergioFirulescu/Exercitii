//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContBancar[] conturi1 = {
                new ContLei("RO1", 1000),
                new ContEuro("LT1", 600)
        };
        ContBancar[] conturi2 = {
                new ContLei("RO2", 1500),
                new ContEuro("LT2", 400)
        };

        Client c1 = new Client("Ion", "Timisoara", conturi1);
        Client c2 = new Client("Ana", "Arad", conturi2);

        Banca banca = new Banca("BT01");
        banca.add(c1);
        banca.add(c2);

        banca.afisareClient("Ion");
        banca.afisareClient("Ana");
    }
}