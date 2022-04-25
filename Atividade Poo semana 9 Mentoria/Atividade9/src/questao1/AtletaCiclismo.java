package questao1;

public class AtletaCiclismo extends Atleta implements Pedalar{

    public AtletaCiclismo(String nome, String nacionalidade, String sexo, int numeroIndentificacao, int idade) {
        super(nome, nacionalidade, sexo, numeroIndentificacao, idade);
    }

    @Override
    public void pedalar() {
        System.out.println("O Ciclista "+getNome()+" Está pedalando");
    }
}
