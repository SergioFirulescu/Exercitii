public class Banca {
    private Client[] clienti = new Client[100];
    private int nrClienti = 0;
    private String codBanca;

    public Banca(String codBanca) {
        this.codBanca = codBanca;
    }

    public void add(Client c) {
        clienti[nrClienti++] = c;
    }

    public void afisareClient(String nume) {
        for (int i = 0; i < nrClienti; i++) {
            if (clienti[i].getNume().equals(nume)) {
                clienti[i].afisare();
                return;
            }
        }

        System.out.println("Clientul nu a fost gasit.");
    }
}
