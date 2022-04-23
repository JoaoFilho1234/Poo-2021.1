package questao1;

public class TriAtleta extends Atleta implements Nadar, Correr, Pedalar{


    public TriAtleta(String nome, String nacionalidade, String sexo, int numeroIndentificacao, int idade) {
        super(nome, nacionalidade, sexo, numeroIndentificacao, idade);
    }


    @Override
    public void correr() {
        System.out.println("O Triatleta "+getNome()+" Está correndo");
    }

    @Override
    public void nadar() {
        System.out.println("O Triatleta "+getNome()+" Está nadando");
    }
    @Override
    public void pedalar() {
        System.out.println("O Triatleta "+getNome()+" Está pedalando");
    }
}
