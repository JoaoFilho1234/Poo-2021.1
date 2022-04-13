package atividade7;

public class Sundae extends Sobremesa{
    private String sabor;
    public Sundae(String nomeSobremesa, int quantidade, String sabor) {
        super(nomeSobremesa,quantidade);
        setSabor(sabor);
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public static void main(String[] args) {
        Sobremesa sundae = new Sundae("Sundae",1,"Morango");

        if (sundae instanceof Sundae) {
            System.out.println("Instancia do tipo Sobremesa");
            Sundae sundae2 = ((Sundae) sundae);
            System.out.println("Conversão realizada!");
        } else {
            System.out.println("Conversão não realizada!");
        }

    }

}
