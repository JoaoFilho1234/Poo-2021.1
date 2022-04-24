package atividade9;

import java.util.Arrays;

public class Pedido implements Comparable<Pedido>{
    // I - Atributos de no minimo três tipos distintos.
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
        Pedido[] pedidos = {
                new Pedido("João","Sundae"),new Pedido("Tiago","Hamburguer"),
                new Pedido("Maria","Batata")
        };

        System.out.println("Antes da Ordenação por Preço:\n");

        for (Pedido i: pedidos){
            System.out.println(i.toString());
        }
        System.out.println("\nDepois da Ordenção por Preço do Menor pro Maior:\n");

        Arrays.sort(pedidos);

        for (Pedido i: pedidos) {
            System.out.println(i.toString());
        }

    }

}
