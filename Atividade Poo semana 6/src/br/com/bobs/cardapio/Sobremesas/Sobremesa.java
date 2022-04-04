package br.com.bobs.cardapio.Sobremesas;

public class Sobremesa {

    public String nomeSobremesa;
    private double desconto;
    double preco;


    public String getNomeSobremesa() {
        return nomeSobremesa;
    }

    public void setNomeSobremesa(String nome) {
        this.nomeSobremesa = nome;
        if (nome.equals("Sundae")) {
            setPreco(9.99);
        }
        else if (nome.equals("Casquinha")) {
            setPreco(3.99);
        }
        else {
            setPreco(7.99);
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = getPreco() * (desconto / 100);
        this.preco = getPreco() - getDesconto();
    }


}
