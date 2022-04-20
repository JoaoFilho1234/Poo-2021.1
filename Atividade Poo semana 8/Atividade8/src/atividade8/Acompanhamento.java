package atividade8;

// I - Crie a Classe1 com um nome relacionado ao seu projeto:
//a) Deve ser uma classe abstrata;
//b) Deve ter método abstrato.
public abstract class Acompanhamento {

    private String nome;
    private double preco;
    private String tamanho;

    public Acompanhamento(String nome, String tamanho){
        setNome(nome);
        setTamanho(tamanho);
        if(nome.equals("Batata Palito")){
            setPreco(3.99);
        } else{
            setPreco(9.99);
        }
        if(getTamanho().equals("Pequeno")) {
            this.preco += 2.99;
        } else if (getTamanho().equals("Medio")) {
            this.preco += 4.99;
        } else {
            setPreco(getPreco() + 6.99);
        }

    }

    public abstract void adicional(); // Metodo abstrato

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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}