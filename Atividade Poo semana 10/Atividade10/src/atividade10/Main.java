package atividade10;

public class Main {
    public static void main(String[] args) {



        Integer valor = null;
        //double valorTotal = valor + 12;
        //System.out.println(valorTotal);

        Sanduiche[] sanduiches = {
                new Sanduiche("Frango Tomato Artesanal"), new Sanduiche("Bobs"),
                new Sanduiche("Cheddar Australiano")
        };

        System.out.println(sanduiches[3].nomeSanduiche);

    }
}
