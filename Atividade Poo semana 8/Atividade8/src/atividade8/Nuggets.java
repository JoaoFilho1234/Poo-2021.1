package atividade8;

public class Nuggets extends Acompanhamento{

    public Nuggets(String nome, String tamanho) {
        super(nome,tamanho);
    }

    @Override
    public void adicional() {
        setNome(getNome()+ " + Molho Caipira");
        setPreco(getPreco() + 3.99);
    }

}
