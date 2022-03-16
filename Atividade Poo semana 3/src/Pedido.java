public class Pedido {

    // III - Crie uma segunda classe do seu projeto. Como cada projeto vai ter um nome distinto para a
    //classe da questão 1, vamos chamá-la aqui de Q1.

    // a) Ela deve possuir três ou mais atributos, sendo um deles do tipo Q1.

    Sanduiche sanduiche;    // Atributo do tipo Q1.
    String cliente;
    boolean refri;
    boolean comparaString;

    Pedido (Sanduiche sanduiche, String cliente) {
        this.sanduiche = sanduiche;
        this.cliente = cliente;
    }

    boolean addRefri() {
        return this.refri = true;
    }

    // b) Crie um método com retorno booleano que compara duas instâncias desta
    //classe e retorna true se o atributo String de Q1 é igual em ambos. Faça testes e mostre os
    //resultados no console.

    boolean comparaStrings(Sanduiche sanduiche1, Sanduiche sanduiche2) {
        if (sanduiche1.nomeSanduiche.equals(sanduiche2.nomeSanduiche)) {
            return this.comparaString = true;
        }
        return this.comparaString = false;
    }



}


