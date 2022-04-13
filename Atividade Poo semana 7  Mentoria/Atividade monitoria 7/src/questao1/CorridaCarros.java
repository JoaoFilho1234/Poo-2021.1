package questao1;

public class CorridaCarros {

    private double valorCorrida;
    private double precoBase;

    public void calculaCorrida (double km, int minutosCorrida) {
        setValorCorrida(getPrecoBase() + km + minutosCorrida);
    }

    public double getValorCorrida() {
        return valorCorrida;
    }

    public void setValorCorrida(double valorCorrida) {
        this.valorCorrida = valorCorrida;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
