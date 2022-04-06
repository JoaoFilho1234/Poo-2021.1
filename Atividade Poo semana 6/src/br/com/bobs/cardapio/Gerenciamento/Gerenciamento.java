// II - Crie uma segunda classe:
// a) (14 pontos) A nova classe deve estar em outro pacote.
// b) (30 pontos) A partir do método main() desta nova classe, altere os valores do atributo
// privado da classe da questão anterior e exiba a saída da tela. Com as saídas da tela
// demonstre que conseguiu fazer a alteração do atributo.

package br.com.bobs.cardapio.Gerenciamento;

import br.com.bobs.cardapio.Sobremesas.Sobremesa;

public class Gerenciamento {
    public static void main(String[] args) {

        System.out.println("SISTEMA DE CADEIA DE RESTAURANTES BOB'S\n");

        Sobremesa sobremesa = new Sobremesa();
        sobremesa.setNomeSobremesa("Sundae");
        System.out.println("Sobremesa: "+sobremesa.getNomeSobremesa());
        System.out.println("Atributo privado preco antes da alteracao");
        System.out.println("Preco original do "+sobremesa.getNomeSobremesa()+": R$ "+sobremesa.getPreco());
        sobremesa.setDesconto(10);
        System.out.printf("\nO desconto aplicado foi de: R$ %.2f\n",sobremesa.getDesconto());
        System.out.println("\nAtributo privado preco depois da alteracao");
        System.out.printf("Preco do "+sobremesa.nomeSobremesa+" com desconto: R$ %.2f\n",sobremesa.getPreco());

    }
}
