package atividade10;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1. Faça um código, dentro do main(), que vai causar um erro no programa por causa
        //da exceção NullPointerException.

        Integer valor = null;
        double valorTotal = valor + 12;
        System.out.println(valorTotal);


        //2. Faça um código, dentro do main(), que vai causar um erro no programa por causa
        //da exceção IndexOutOfBoundsException.
        Sanduiche[] sanduiches = {
                new Sanduiche("Frango Tomato Artesanal"), new Sanduiche("Bobs"),
                new Sanduiche("Cheddar Australiano")
        };

        System.out.println(sanduiches[3].nomeSanduiche);


    }
}
