//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AngajatCuSalarFix angajat1 = new AngajatCuSalarFix("Vasilica", 1200);
        AngajatCuOra angajat2 = new AngajatCuOra("Gheorghe" ,200,10);

        Firma firma = new Firma();

        // se adauga 2 angajati si da true
        System.out.println(firma.angajeaza(angajat1));
        System.out.println(firma.angajeaza(angajat2));

        // afiseaza salariul mediu
        System.out.println(firma.salariuMediu());

        // se adauga acelasi angajat si da false
        System.out.println(firma.angajeaza(angajat2));

        // schimba salariul la angajatul nu2 pe ora
        angajat2.schimbareSalariuPeOra(12);

        // se afiseaza noul salar mediu
        System.out.println(firma.salariuMediu());

    }
}