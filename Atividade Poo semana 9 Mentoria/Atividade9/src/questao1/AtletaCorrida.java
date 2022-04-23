package questao1;

public class AtletaCorrida extends Atleta implements Correr{

    public AtletaCorrida(String nome, String nacionalidade, String sexo, int numeroIndentificacao, int idade) {
        super(nome, nacionalidade, sexo, numeroIndentificacao, idade);
    }

    @Override
    public void correr() {
        System.out.println("O Atleta "+getNome()+" Está correndo");

    }
}
