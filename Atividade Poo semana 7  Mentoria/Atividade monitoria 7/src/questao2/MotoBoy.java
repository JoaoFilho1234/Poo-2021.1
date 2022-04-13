package questao2;

import questao1.CorridaCarros;

public class MotoBoy extends CorridaCarros {

    @Override
    public void calculaCorrida(double km, int minutosCorrida) {
        setValorCorrida((km * 2.0) + (minutosCorrida * 0.5));
    }
}
