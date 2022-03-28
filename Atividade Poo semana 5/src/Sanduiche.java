import java.lang.reflect.Array;
import java.util.ArrayList;
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

    @Override
    public String toString() {
        return "Sanduiche encontrado: " + nomeSanduiche   +
                ", tamanho: " + tamanho  +
                ", preco: R$" + preco;
    }

    public static void main(String[] args) {

    }


}
