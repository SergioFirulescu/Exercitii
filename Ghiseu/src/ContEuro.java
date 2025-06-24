public class ContEuro  extends ContBancar{
    public ContEuro(String numarCont, float suma) {
        super(numarCont, suma);
    }

    @Override
    public float getSumaTotala() {
        return suma * 36.0f;
    }

    public float getDobanda() {
        return suma > 500 ? 0.3f : 0f;
    }
}
