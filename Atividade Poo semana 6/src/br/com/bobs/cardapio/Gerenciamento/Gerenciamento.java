package br.com.bobs.cardapio.Gerenciamento;

import br.com.bobs.cardapio.Sobremesas.Sobremesa;

public class Gerenciamento {
    public static void main(String[] args) {

        Sobremesa sobremesa = new Sobremesa();
        sobremesa.setNomeSobremesa("Milk Shake");
        System.out.println(sobremesa.getNomeSobremesa());
        System.out.println("Preco original: R$ "+sobremesa.getPreco());
        sobremesa.setDesconto(10);
        System.out.printf("Com desconto: R$ %.2f\n",sobremesa.getPreco());
        System.out.println(sobremesa.getDesconto());

    }
}
