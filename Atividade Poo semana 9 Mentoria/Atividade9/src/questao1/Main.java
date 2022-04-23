package questao1;

public class Main {
    public static void main(String[] args) {

        TriAtleta triatleta = new TriAtleta("João","Brasileiro","Masculino", 007,26);
        triatleta.correr();
        triatleta.nadar();
        triatleta.pedalar();

        System.out.println("\n-=-=-=-=-=-=-==-=-==-=-=-===-=-=--==-=-=-=-");

        AtletaNatacao natacao = new AtletaNatacao("Maria","Brasileira","Feminino",123,23);
        natacao.nadar();

        System.out.println("\n-=-=-=-=-=-=-==-=-==-=-=-===-=-=--==-=-=-=-");

        AtletaCiclismo ciclismo = new AtletaCiclismo("Jon","Canadense","Masculino",202,32);
        ciclismo.pedalar();

        System.out.println("\n-=-=-=-=-=-=-==-=-==-=-=-===-=-=--==-=-=-=-");

        AtletaCorrida corrida = new AtletaCorrida("Vitoria","Brasileira","Feminino",323,19);
        corrida.correr();
    }
}
