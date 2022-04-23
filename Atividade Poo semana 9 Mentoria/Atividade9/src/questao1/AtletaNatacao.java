package questao1;

public class AtletaNatacao extends Atleta implements Nadar{

    public AtletaNatacao(String nome, String nacionalidade, String sexo, int numeroIndentificacao, int idade) {
        super(nome, nacionalidade, sexo, numeroIndentificacao, idade);
    }

    @Override
    public void nadar() {
        System.out.println("O Atleta "+getNome()+" Está nadando");
    }
}
