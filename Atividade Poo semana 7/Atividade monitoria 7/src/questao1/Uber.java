package questao1;

public class Uber extends CorridaCarros{

    private int avaliacao;

    @Override
    public void calculaCorrida(double km, int minutosCorrida) {
        setValorCorrida(getPrecoBase() + (1.9 * km) + (0.15 * minutosCorrida));
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}
