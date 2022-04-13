package br.com.bobs.cardapio.Sobremesas;

public class Sundae extends Sobremesa{

    private String sabor;
    public Sundae(String nomeSobremesa, String sabor) {
        super(nomeSobremesa);
        setSabor(sabor);
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public static void main(String[] args) {
        Sobremesa sundae = new Sundae("Sundae","Morango");
        System.out.println("Sundae: "+sundae.getNomeSobremesa()+" de "+((Sundae)sundae).getSabor()+"\nPreco: R$ "+sundae.getPreco());;
    }

}


