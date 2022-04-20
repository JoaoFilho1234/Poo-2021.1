package atividade8;

public class Nugetts extends Acompanhamento{

    public Nugetts(String nome) {
        super(nome);
    }

    @Override
    public void adicional() {
        setNome(getNome()+ " + Molho Caipira");
        setPreco(getPreco() + 3.99);
    }

}
