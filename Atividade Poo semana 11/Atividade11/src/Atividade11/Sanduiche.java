package Atividade11;

import java.io.Serializable;

// 3- Crie uma classe básica do projeto.

public class Sanduiche implements Item, Serializable {

    private String nome;
    private String tamanho;
    private double preco;
    private int numeroDeCarnes;
    private String pontoDaCarne;

    int id;

    // 4- Crie o construtor da classe básica.

    public Sanduiche(String nome, String tamanho, double preco) {
        setNome(nome);
        setTamanho(tamanho);
        setPreco(preco);
    }

    // 5- Crie um método que realiza operações úteis para o usuário (não pode ser
    //métodos do tipo get(), set() ou toString()).

    void numCarnes(int numeroDeCarnes) {
        this.numeroDeCarnes = numeroDeCarnes;
        if (numeroDeCarnes > 1) {
            this.preco += (numeroDeCarnes - 1) * 3.99;
        }
    }

    // 6- Crie um segundo método que realiza operações úteis para o usuário (não pode
    //ser métodos do tipo get(), set() ou toString()).

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
}
