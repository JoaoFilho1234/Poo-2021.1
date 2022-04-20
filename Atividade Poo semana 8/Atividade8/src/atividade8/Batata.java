package atividade8;

// II - Crie a Classe2 (com um nome relacionado ao seu projeto), que implementa a
//Classe1.
public class Batata extends Acompanhamento{

    public Batata(String nome, String tamanho) {
        super(nome,tamanho);
    }

    @Override
    public void adicional() {
        if(getNome().equals("Batata Palito")) {
            setNome(getNome() + " ,Adicional: Cheddar com Bacon");
            setPreco(getPreco() + 4.99);
        } else {
            setNome(getNome() + " ,Adicional: Tirinhas de Frango Empanado");
            setPreco(getPreco() + 7.99);
        }
    }

}
