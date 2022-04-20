package atividade8;

public class BatataPalito extends Acompanhamento{

    public BatataPalito(String nome) {
        super(nome);
    }

    @Override
    public void adicional() {
        setNome(getNome()+ " + Cheddar com Bacon");
        setPreco(getPreco() + 4.99);
    }

    public static void main(String[] args) {

        Acompanhamento acompanhamento = new BatataPalito("Batata Palito");
        acompanhamento.adicional();
        System.out.println(acompanhamento.getNome());
        System.out.println(acompanhamento.getPreco());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Acompanhamento nuggets = new Nugetts("Nuggets");
        nuggets.adicional();
        System.out.println(nuggets.getNome());
        System.out.println(nuggets.getPreco());


    }


}
