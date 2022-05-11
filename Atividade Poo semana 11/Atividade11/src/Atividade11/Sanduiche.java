package Atividade11;

import java.io.Serializable;

public class Sanduiche implements Item, Serializable {

    private String nome;
    private String tamanho;
    private double preco;

    int id;


    public Sanduiche(String nome, String tamanho, double preco) {
        setNome(nome);
        setTamanho(tamanho);
        setPreco(preco);
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
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
        this.id = id;

    }
}
