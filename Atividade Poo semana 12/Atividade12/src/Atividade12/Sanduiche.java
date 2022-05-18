package Atividade12;

import java.io.Serializable;

    // 3- b) Pelo menos duas subclasses.

    // 4- b) Herança multipla.

public class Sanduiche extends Lanche implements IPagamento, Item, Serializable {

    private String nome;
    private String tamanho;
    private double preco;
    private int numeroDeCarnes;
    private String pontoDaCarne;

    int id;



    public Sanduiche(String nome, String tamanho, double preco) {
        super(nome, preco, tamanho);

    }



    void numCarnes(int numeroDeCarnes) {
        this.numeroDeCarnes = numeroDeCarnes;
        if (numeroDeCarnes > 1) {
            this.preco += (numeroDeCarnes - 1) * 3.99;
        }
    }

    void pontoCarne(String ponto) {
        this.pontoDaCarne = ponto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Sanduiche: "+nome +", Tamanho: "+ tamanho+", Preco: "+preco;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
        this.id = id;

    }

    @Override
    public void formaPagamento(String forma) {

    }

    @Override
    public void valorTotal() {

    }
}
