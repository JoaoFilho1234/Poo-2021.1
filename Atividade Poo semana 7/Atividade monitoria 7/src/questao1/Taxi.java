package questao1;

public class Taxi extends CorridaCarros {

    @Override
    public void calculaCorrida(double km, int minutosCorrida) {
        setValorCorrida(getPrecoBase() + (2.75 * km) + (0.55 * minutosCorrida));
    }


}



