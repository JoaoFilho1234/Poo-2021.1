package atividade8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // IV - Crie um ArrayList do tipo Classe1:
        //a) Preencha ele com elementos tanto da Classe2 como da Classe3.
        //b) Mostre, através da saída do console, o resultado da chamada do método
        //abstrato para cada elemento do ArrayList.

        ArrayList<Acompanhamento> acompanhamentos = new ArrayList<Acompanhamento>();
        System.out.println("Repositorio Acompanhamentos\n");
        acompanhamentos.add(new Batata("Batata Palito","Pequeno"));
        acompanhamentos.add(new Nuggets("Nuggtts","Medio"));
        acompanhamentos.add(new Batata("Batata Rustica","Grande"));

        for (Acompanhamento i: acompanhamentos) {
            System.out.println("Nome: "+i.getNome()+", Tamanho: "+i.getTamanho()+", Preço: "+i.getPreco());
        }

        System.out.println("\nRepositorio Acompanhamentos Modificado com o Adicional e Atualização do Preco\n");

        for (Acompanhamento i: acompanhamentos) {
            i.adicional();
            System.out.println("Nome: "+i.getNome()+", Tamanho: "+i.getTamanho()+", Preço: "+i.getPreco());
        }

    }
}
