public class Client {
    private String nume;
    private String adresa;
    private ContBancar[] conturi;

    public Client(String nume,String adresa, ContBancar[] conturi) {
        this.nume = nume;
        this.adresa = adresa;
        this.conturi = conturi;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }
    public ContBancar[] getConturi() {
        return conturi;
    }

    public void afisare() {
        System.out.println(nume + " " + adresa);
        for (ContBancar c : conturi) {
            System.out.println("Suma totala: " + c.getSumaTotala());
        }
    }
}
