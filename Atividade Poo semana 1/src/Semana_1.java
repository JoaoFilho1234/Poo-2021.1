public class Semana_1 {

    public static void main(String[] args) {

        System.out.println("CADEIA DE RESTAURANTES(BOB'S OU SUBWAY)\n");


        /* I - Some as duas variáveis (uma do tipo double e outra do tipo int) e mostre seu valor na
        saída do programa (print)*/

        double precoRefrigerante = 2.90;
        int precoLanche = 3;

        System.out.println("Preço do pedido: " + precoRefrigerante + precoLanche + "\n");


        /* II - Crie duas variáveis do tipo String de múltiplas linhas e mostre a concatenação destas na
        saída do programa (print) */

        String cardapio = "***CARDAPIO***\nBatata frita" +
                "....... 1,99\nRefrigerante....... 2,50\nMilk Shake" +
                "......... 5,99\nHamburguer......... 9,99\nCasquinha.......... 2,99\nSundae............. 7,99\n\n";

        String combos = "***COMBOS***\nHamburger + batata + refrigerante..... 14,99\nMilk Shake + Batata media" +
                "............. 9,99\n" +
                "Hamburguer + Casquinha................ 11,99\nSunde + batata........................ 8,99";

        System.out.println("\n" + cardapio + "\n" +combos + "\n");


        /* III - Utilize um laço for e um operador de incremento “++” ou decremento “--” */
        /* IV - Utilize “if(...) break;” dentro do laço for. */

        int senhaPedido ;

        System.out.println("=========SENHAS DOS PEDIDOS=========");
        for (int i = 1; i <= 100 ; i++) {
            senhaPedido = i;
            if (senhaPedido == 10) {
                break;
            }
            System.out.println("A senha do seu pedido eh: " + senhaPedido + "\n");

        }

        /* V - Utilize um laço while do tipo “while (teste) {...}” em que teste é uma variável booleana
        atualizada dentro do laço. */

        boolean teste = true;
        int limitePedidos ;

        while (teste) {
            for (int i = 1; i <= 10 ; i++) {
                limitePedidos = i;
                if (limitePedidos == 10) {
                    teste = false;
                    System.out.println("LIMITE DE PEDIDOS ATINGIDO!");
                }
            }
        }
        System.out.println(teste);
    }
}
