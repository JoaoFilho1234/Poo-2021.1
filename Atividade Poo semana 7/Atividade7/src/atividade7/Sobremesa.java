package atividade7;

public class Sobremesa {
    public String nomeSobremesa; // atributo publico
    private double preco;    // atributo privado
    double desconto;               // atributo default

    public Sobremesa(String nomeSobremesa) {
        setNomeSobremesa(nomeSobremesa);
    }

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
        if (desconto <= 100) {
            this.desconto = getPreco() * (desconto / 100);
            setPreco(getPreco() - getDesconto());
        }
        else {
            System.out.println("Nao eh possivel dar desconto maior que 100%!");
        }
    }
}
