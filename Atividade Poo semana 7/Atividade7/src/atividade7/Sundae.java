package atividade7;

    // Crie uma classe com os seguintes elementos:
    // 1 - Que seja uma subclasse de alguma classe do seu projeto.

public class Sundae extends Sobremesa{
    private String sabor; // atributo da subclasse

    // 2 - Defina o construtor da subclasse utilizando o construtor da superclasse.
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

        // 3 - Crie uma instância da subclasse em uma variável do tipo da superclasse.

        Sobremesa sundae = new Sundae("Sundae",1,"Morango");

        // 4 - Realize a conversão da instância criada anteriormente para o tipo da subclasse,
        // verifique antes utilizando instanceof.

        if (sundae instanceof Sundae) {
            System.out.println("Instancia do tipo Sobremesa");
            Sundae sundae2 = ((Sundae) sundae);
            System.out.println("Conversão realizada!");
        } else {
            System.out.println("Conversão não realizada!");
        }

    }

}
