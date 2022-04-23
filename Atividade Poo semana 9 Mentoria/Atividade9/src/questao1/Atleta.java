package questao1;

public class Atleta {

    private String nome;
    private String nacionalidade;
    private String sexo;
    private int numeroIndentificacao;
    private int idade;

    public Atleta(String nome, String nacionalidade, String sexo, int numeroIndentificacao, int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.numeroIndentificacao = numeroIndentificacao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumeroIndentificacao() {
        return numeroIndentificacao;
    }

    public void setNumeroIndentificacao(int numeroIndentificacao) {
        this.numeroIndentificacao = numeroIndentificacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
