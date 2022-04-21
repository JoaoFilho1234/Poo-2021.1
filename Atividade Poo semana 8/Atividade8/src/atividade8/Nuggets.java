package atividade8;

// III - Crie a Classe3 (com um nome relacionado ao seu projeto), que implementa a
//Classe1. A implementação do método abstrato deve funcionar diferente daquela realizada na
//Classe2.
public class Nuggets extends Acompanhamento{

    public Nuggets(String nome, String tamanho) {
        super(nome,tamanho);
    }

    @Override
    public void adicional() {
        if(getNome().equals("Nuggets de Frango")) {
            setNome(getNome() + " + Molho Caipira");
            setPreco(getPreco() + 3.99);
        } else {
            setNome(getNome() + " + Molho Barbecue");
            setPreco(getPreco() + 3.99);
        }
    }

}
