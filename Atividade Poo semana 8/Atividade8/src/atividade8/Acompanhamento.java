package atividade8;


public abstract class Acompanhamento {

    private String nome;
    private double preco;
    private int quantidade;

    public Acompanhamento(String nome){
        setNome(nome);
        if(nome.equals("Batata Palito")){
            setPreco(3.99);
        } else{
            setPreco(9.99);
        }

    }

    public abstract void adicional();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}