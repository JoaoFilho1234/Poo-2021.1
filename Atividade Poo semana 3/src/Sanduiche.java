import java.util.Scanner;

public class Sanduiche {

    // I- Crie uma classe Java relacionada ao seu tema de projeto. A classe deve ter, pelo menos, três
    //atributos, sendo um deles do tipo String.


    String nomeSanduiche;
    String tamanho;
    int numeroDeCarnes;
    boolean comparaString;
    Double preco;

    // a) Defina dois construtores distintos para esta classe.
    Sanduiche(String nomeSanduiche) {
        this.nomeSanduiche = nomeSanduiche;
        this.tamanho = "Medio";
        this.precoSanduiche(nomeSanduiche);
    }

    Sanduiche(String nomeSanduiche, String tamanho) {
        this.nomeSanduiche = nomeSanduiche;
        this.tamanho = tamanho;
        this.precoSanduiche(nomeSanduiche);
    }

    void numCarnes(int numeroDeCarnes) {
        this.numeroDeCarnes = numeroDeCarnes;
        if (numeroDeCarnes > 1) {
            this.preco += (numeroDeCarnes - 1) * 3.99;
        }
    }


    // b) Compare o atributo String de cada par de
    //instâncias para ver se tê o mesmo valor e mostre a resposta na saída do console. Faça um
    //método com retorno booleano que recebe como entrada dois objetos deste tipo. O
    //método retorna true se os objetos possuem os mesmo valores no seus atributos, caso
    //contrário retorna false.

    boolean isComparaString(Sanduiche sanduiche1, Sanduiche sanduiche2) {

            if (sanduiche1.nomeSanduiche.equals(sanduiche2.nomeSanduiche)){
                return this.comparaString = true;
        }
        return this.comparaString = false;
    }

    void precoSanduiche(String nomeSanduiche) {

        switch (nomeSanduiche) {

            case "Frango Tomato Artesanal":
                if (tamanho.equals("Pequeno")) {
                    this.preco = 13.99;
                }
                else if (tamanho.equals("Medio")) {
                    this.preco = 14.99;
                }
                else {
                    this.preco = 15.99;
                }
                break;

            case "Cheddar Australiano":
                if (tamanho.equals("Pequeno")){
                    this.preco = 10.99;
                }
                else if (tamanho.equals("Medio")) {
                    this.preco = 11.99;
                }
                else {
                    this.preco = 12.99;
                }
                break;

            case "Crispy Bacon":
                if (tamanho.equals("Pequeno")) {
                    this.preco = 11.99;
                }
                else if (tamanho.equals("Medio")) {
                    this.preco = 12.99;
                }
                else {
                    this.preco = 13.99;
                }
                break;

            default:
                this.preco = 9.99;

        }
    }




    public static void main(String[] args) {

        System.out.println("SISTEMA DE REDE DE RESTAUTANTES BOB'S OU SUBWAY\n");


        // I- b) Crie três instâncias desta classe, sendo que duas delas devem ter o mesmo
        //valor para seu atributo do tipo String. Compare o atributo String de cada par de
        //instâncias para ver se tê o mesmo valor e mostre a resposta na saída do console. Faça um
        //método com retorno booleano que recebe como entrada dois objetos deste tipo. O
        //método retorna true se os objetos possuem os mesmo valores no seus atributos, caso
        //contrário retorna false.

        System.out.println("*=*=*=*=*=*=*=*=*=*= QUESTÃO 1 *=*=*=*=*=*=*=*=*=*=\n");

        Sanduiche s = new Sanduiche("Cheddar Australiano","Medio");
        s.numCarnes(2);
        System.out.println("Sanduiche 1: Cheddar Australiano, tamanho Medio, num de carnes: 2; preço: R$"+s.preco+"\n");

        Sanduiche s2 = new Sanduiche("Cheddar Australiano","Pequeno");
        s2.numCarnes(1);
        System.out.println("Sanduiche 2: Cheddar Australiano, tamanho Pequeno, num de carnes: 1; preço: R$"+s2.preco+"\n");

        Sanduiche s3 = new Sanduiche("Crispy Bacon");
        s3.numCarnes(3);
        System.out.println("Sanduiche 3: Crispy Bacon, tamanho Medio, num de carnes: 3; preço: R$"+s3.preco+"\n");


        // Comparando Sanduiche 1 com Sanduiche 2
        s.isComparaString(s,s2);
        System.out.println("Comparando Sanduiche 1 com Sanduiche 2\n"+ s.comparaString);

        // Comparando Sanduiche 1 com Sanduiche 3
        s.isComparaString(s,s3);
        System.out.println("Comparando Sanduiche 1 com Sanduiche 3\n"+ s.comparaString);

        // Comparando Sanduiche 2 com Sanduiche 3
        s2.isComparaString(s2,s3);
        System.out.println("Comparando Sanduiche 2 com Sanduiche 3\n"+ s2.comparaString+"\n\n");

        // II - Utilizando a classe Scanner. Crie uma interface por linha de texto através da
        //qual o usuário pode através do console criar instâncias da classe. Mostre um print do
        //console mostrando as entradas do usuário e as saídas do programa. Faça testes com os
        //construtores da classe, mostre que os construtores funcionam como deveriam.

        System.out.println("*=*=*=*=*=*=*=*=*=*= QUESTÃO 2 *=*=*=*=*=*=*=*=*=*=\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Sanduiche: ");
        String nomeSanduiche = sc.nextLine();

        System.out.println("Digite o tamanho do Sanduiche: ");
        String tamanhoSanduiche = sc.nextLine();

        System.out.println("Digite o numero de carnes do Sanduiche: ");
        int numCarne = sc.nextInt();

        Sanduiche sanduiche = new Sanduiche(nomeSanduiche,tamanhoSanduiche);
        sanduiche.numCarnes(numCarne);

        System.out.println("\nSanduiche: "+nomeSanduiche+", tamanho: "+tamanhoSanduiche+", numero de carnes: "
                +numCarne+", preço: R$"+sanduiche.preco+"\n");

        System.out.println("*=*=*=*=*=*=*=*=*=*= QUESTÃO 3 *=*=*=*=*=*=*=*=*=*=\n");

        Pedido pedido = new Pedido(s,"João");
        pedido.addRefri();
        pedido.comparaStrings(s2,s);
        System.out.println("a)\n"+"Pedido:\n");
        System.out.println("Cliente: "+pedido.cliente+"\nSanduiche: "+s.nomeSanduiche+", tamanho: "+s.tamanho+
                ", numero de carnes: "+s.numeroDeCarnes+", Preço: R$"+s.preco+"\nRefrigerante: "+pedido.refri);

        System.out.println("\nb)"+"\nComparando String (nomeSanduiche) de s e s2 de Q1: \n"+pedido.comparaString);


        sc.close();


    }
}
