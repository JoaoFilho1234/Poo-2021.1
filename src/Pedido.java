public class Pedido {

    // I - Atributos de no minimo três tipos distintos.
    String cliente;
    Double valorPedido;
    int numItensPedidos;
    boolean fazerPedido;


    // II - Defina pelo menos DOIS métodos SEM RETORNO que atualizem os
    //valores dos atributos de forma ENCAPSULADA.

    void numeroItensPedidos() {
        numItensPedidos++;

    }

    void fazerPedido() {
        valorPedido = 0d;
        fazerPedido = true;
    }

    // III - Defina UM método COM RETORNO mas SEM PARÂMETROS.

    double addRefri() {
        numeroItensPedidos();
        return valorPedido += 3.50;

    }

    // IV - Defina UM método COM RETORNO e COM PARÂMETROS.

    String nomeCliente(String nome) {

        return cliente = nome;
    }

    // V - Defina UM método SEM RETORNO e COM PARÂMETROS.
    void addLanche(String lanche) {

        switch (lanche) {

            case "Hamburguer":
                valorPedido += 9.99;
                numeroItensPedidos();
                break;
            case "Sundae":
                valorPedido += 7.99;
                numeroItensPedidos();
                break;
            case "Batata":
                valorPedido += 3.99;
                numeroItensPedidos();
                break;
            case "Casquinha":
                valorPedido += 4.49;
                numeroItensPedidos();
                break;
            default:
                System.out.println("Lanche em falta!");
        }
    }

    // VIII - Para gerar uma String com todos os valores dos atributos da classe, defina o método
    //toString().

    @Override
    public String toString() {
        return
                "Nome cliente: " + cliente +
                ", Valor do pedido: R$" + valorPedido +
                ", Número de itens do pedido: " + numItensPedidos +
                ", Fazer pedido: " + fazerPedido ;
    }

    public static void main (String[]args){

        // VI - Crie pelo menos QUATRO instâncias da sua classe dentro do método
        //main().
        System.out.println("        PEDIDOS CADEIA DE RESTAURANTES BOB'S OU SUBWAY");

        System.out.println("\n************************** PEDIDO 1 ********************************\n");

        Pedido pedido1 = new Pedido();      // VII - Faça pelo menos SEIS chamadas dos seus métodos.
        System.out.println(pedido1.toString()); // VIII - Exiba os valores dos seus objetos antes e depois da chamada de cada método.
        pedido1.fazerPedido();
        System.out.println(pedido1.toString());
        pedido1.nomeCliente("Maria");
        System.out.println(pedido1.toString());
        pedido1.addLanche("Sundae");
        System.out.println(pedido1.toString());
        pedido1.addLanche("Hamburguer");
        System.out.println(pedido1.toString());
        pedido1.addRefri();
        System.out.println(pedido1.toString());
        pedido1.addRefri();
        System.out.println(pedido1.toString());
        pedido1.addLanche("fas");
        System.out.println(pedido1.toString());

        System.out.println("\n************************** PEDIDO 2 ********************************\n");

        Pedido pedido2 = new Pedido();      // VII - Faça pelo menos SEIS chamadas dos seus métodos.
        System.out.println(pedido2.toString()); // VIII - Exiba os valores dos seus objetos antes e depois da chamada de cada método.
        pedido2.fazerPedido();
        System.out.println(pedido2.toString());
        pedido2.nomeCliente("João");
        System.out.println(pedido2.toString());
        pedido2.addLanche("Hamburguer");
        System.out.println(pedido2.toString());
        pedido2.addLanche("Batata");
        System.out.println(pedido2.toString());
        pedido2.addLanche("Casquinha");
        System.out.println(pedido2.toString());
        pedido2.addRefri();
        System.out.println(pedido2.toString());
        pedido2.addRefri();
        System.out.println(pedido2.toString());

        System.out.println("\n************************** PEDIDO 3 ********************************\n");

        Pedido pedido3 = new Pedido();      // VII - Faça pelo menos SEIS chamadas dos seus métodos.
        System.out.println(pedido3.toString()); // VIII - Exiba os valores dos seus objetos antes e depois da chamada de cada método.
        pedido3.fazerPedido();
        System.out.println(pedido3.toString());
        pedido3.nomeCliente("Karla");
        System.out.println(pedido3.toString());
        pedido3.addLanche("Hamburguer");
        System.out.println(pedido3.toString());
        pedido3.addLanche("Hamburguer");
        System.out.println(pedido3.toString());
        pedido3.addLanche("Casquinha");
        System.out.println(pedido3.toString());
        pedido3.addLanche("Batata");
        System.out.println(pedido3.toString());
        pedido3.addRefri();
        System.out.println(pedido3.toString());
        pedido3.addRefri();
        System.out.println(pedido3.toString());

        System.out.println("\n************************** PEDIDO 4 ********************************\n");

        Pedido pedido4 = new Pedido();      // VII - Faça pelo menos SEIS chamadas dos seus métodos.
        System.out.println(pedido4.toString()); // VIII - Exiba os valores dos seus objetos antes e depois da chamada de cada método.
        pedido4.fazerPedido();
        System.out.println(pedido4.toString());
        pedido4.nomeCliente("Lucas");
        System.out.println(pedido4.toString());
        pedido4.addLanche("Hamburguer");
        System.out.println(pedido4.toString());
        pedido4.addLanche("Sundae");
        System.out.println(pedido4.toString());
        pedido4.addLanche("Casquinha");
        System.out.println(pedido4.toString());
        pedido4.addLanche("Casquinha");
        System.out.println(pedido4.toString());
        pedido4.addRefri();
        System.out.println(pedido4.toString());


    }
}


