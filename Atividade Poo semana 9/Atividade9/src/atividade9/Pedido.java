package atividade9;

import java.util.Arrays;

// 1. Utilizando uma classe básica do seu projeto:
//a) Faça com que uma classe do seu projeto implemente a interface
//java.lang.Comparable.
public class Pedido implements Comparable<Pedido>{

    String cliente;
    String lanche;
    Double valorPedido;
    int numItensPedidos;
    boolean fazerPedido;

    public Pedido(String cliente, String nomeLanche) {
        this.lanche = nomeLanche;
        this.fazerPedido();
        nomeCliente(cliente);
        addLanche(nomeLanche);
    }


    void numeroItensPedidos() {
        numItensPedidos++;

    }

    void fazerPedido() {
        valorPedido = 0d;
        fazerPedido = true;
    }



    double addRefri() {
        numeroItensPedidos();
        return valorPedido += 3.50;

    }



    String nomeCliente(String nome) {

        return cliente = nome;
    }


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




    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(Double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public int getNumItensPedidos() {
        return numItensPedidos;
    }

    public void setNumItensPedidos(int numItensPedidos) {
        this.numItensPedidos = numItensPedidos;
    }

    public boolean isFazerPedido() {
        return fazerPedido;
    }

    public void setFazerPedido(boolean fazerPedido) {
        this.fazerPedido = fazerPedido;
    }

    @Override
    public String toString() {
        return
                "Nome cliente: " + cliente +
                        ", Nome do Lanche: " + lanche +
                        ", Valor do pedido: R$" + valorPedido +
                        ", Fazer pedido: " + fazerPedido ;
    }

    @Override
    public int compareTo(Pedido pedido) {
        if(this.valorPedido > pedido.getValorPedido()){
            return 1;
        } else if(this.valorPedido < pedido.getValorPedido()){
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("----------------------------- Questao 1 -----------------------------\n");
        // 1. b) Crie um vetor de objetos desta classe e ordene utilizando Arrays.sort().

        Pedido[] pedidos = {
                new Pedido("João","Sundae"),new Pedido("Tiago","Hamburguer"),
                new Pedido("Maria","Batata")
        };
            // c) Mostre na tela o print do vetor antes e depois da ordenação.

        System.out.println("Vetor Antes da Ordenação por Preço:\n");

        for (Pedido i: pedidos){
            System.out.println(i.toString());
        }
        System.out.println("\nVetor Depois da Ordenção por Preço do Menor pro Maior:\n");

        Arrays.sort(pedidos); // Ordenação Arrays.sort()

        for (Pedido i: pedidos) {
            System.out.println(i.toString());
        }

    }

}
