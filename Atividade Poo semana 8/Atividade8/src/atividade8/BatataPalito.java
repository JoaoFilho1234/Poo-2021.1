package atividade8;

import java.util.ArrayList;

public class BatataPalito extends Acompanhamento{

    public BatataPalito(String nome, String tamanho) {
        super(nome,tamanho);
    }

    @Override
    public void adicional() {
        setNome(getNome()+ " + Cheddar com Bacon");
        setPreco(getPreco() + 4.99);
    }

    public static void main(String[] args) {

        Acompanhamento acompanhamento = new BatataPalito("Batata Palito","Medio");
        acompanhamento.adicional();
        System.out.println(acompanhamento.getNome());
        System.out.println(acompanhamento.getPreco());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Acompanhamento nuggets = new Nuggets("Nuggets","Grande");
        nuggets.adicional();
        System.out.println(nuggets.getNome());
        System.out.println(nuggets.getPreco());

        ArrayList<Acompanhamento> acompanhamentos = new ArrayList<Acompanhamento>();
        System.out.println("Repositorio");
        acompanhamentos.add(new BatataPalito("Batata Palito","Pequeno"));
        acompanhamentos.add(new Nuggets("Nuggtts","Medio"));
        acompanhamentos.add(new BatataPalito("Batata Palito","Grande"));

        for (Acompanhamento i: acompanhamentos) {
            System.out.println(i.getNome());
        }

        System.out.println("\nRepositorio modificado\n");

        for (Acompanhamento i: acompanhamentos) {
            i.adicional();
            System.out.println(i.getNome());
        }

    }


}
