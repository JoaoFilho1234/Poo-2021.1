import java.util.ArrayList;

public class RepositorioSanduiche {

    // I - Complementando o que você fez até agora no projeto. Crie um repositório de uma das
    //classes do seu projeto utilizando ArrayList. Você deve utilizar uma classe criada em
    //atividades anteriores que possua no mínimo dois atributos, um destes atributos deve ser do
    //tipo String. Você deve criar a classe RepositórioTipo, em que “Tipo” é o nome da classe do
    //seu projeto (vou utilizar o nome Tipo porque cada projeto tem um nome diferente). Sua
    //classe repositório deve ter os métodos descritos abaixo, cada um deles deve ser testado
    //dentro do método main() da classe mostrando a saída da chamada destes métodos na
    //tela.

    RepositorioSanduiche(){
        sanduiches.add(new Sanduiche("Double Cheeseburguer","Pequeno"));
        sanduiches.add(new Sanduiche("Frango","Medio"));
        sanduiches.add(new Sanduiche("Big Bob", "Grande"));
        sanduiches.add(new Sanduiche("Crispy Bacon","Pequeno"));
        sanduiches.add(new Sanduiche("Frango Tomato Artesanal"));
        sanduiches.add(new Sanduiche("Cheddar Australiano","Grande"));
        sanduiches.add(new Sanduiche("Big Bob Frango","Grande"));
        sanduiches.add(new Sanduiche("Tentador Frango","Pequeno"));
        sanduiches.add(new Sanduiche("Tentador Carne","Medio"));
        sanduiches.add(new Sanduiche("Tentador Zero Beef","Pequeno"));
        sanduiches.add(new Sanduiche("Bobs Artesanal","Pequeno"));
        sanduiches.add(new Sanduiche("Costela Artesanal","Grande"));
        sanduiches.add(new Sanduiche("Cheeseburguer","Pequeno"));

    }

    ArrayList<Sanduiche> sanduiches = new ArrayList<Sanduiche>();



    public ArrayList<Sanduiche> getSanduiches() {
        return sanduiches;
    }


    // I - a) procurar(String id), este método deve retornar o objeto que possui o valor
    //do seu atributo String igual a id. Faça testes exibindo no terminal uma descrição do
    //objeto encontrado com todos os seus atributos. Caso o objeto não seja encontrado, você
    //deve mostrar uma mensagem na tela comunicando este fato.

    boolean procurar(String nomeSanduiche) {
        boolean encontrou = false;
        for (Sanduiche i: sanduiches) {
            if (i.nomeSanduiche.equals(nomeSanduiche)) {
                System.out.println(i.toString());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Sanduiche "+nomeSanduiche+" não encontrado!");
        }
        return encontrou;
    }

    // I - b) inserir(Tipo tipo), este método deve armazenar uma nova instância da
    //classe com a seguinte restrição: nova instância só pode ser inserida se não houver no
    //repositório uma outra instância com mesmo id. Após inserir mostra uma mensagem na
    //tela confirmando a inserção. Caso não seja possível inserir mostra uma mensagem na
    //tela informando que não foi possível pois esta instância já existe no repositório.

    void inserir(Sanduiche sanduiche) {
        boolean encontrou = false;
        for (Sanduiche i: sanduiches) {
            if (i.nomeSanduiche.equals(sanduiche.nomeSanduiche)) {
                System.out.println("Não foi possivel inserir o Sanduiche "+sanduiche.nomeSanduiche+
                        " pois ele ja existe no repositorio!");
                encontrou = true;
            }
        }
        if (!encontrou) {
            sanduiches.add(sanduiche);
            System.out.println("O Sanduiche "+sanduiche.nomeSanduiche+" foi inserido no repositorio");

        }

    }

    // I - c) remover(String id), este método busca no repositório o objeto com o id
    //passado como parâmetro e: (i) se encontra o objeto o remove da base mostra uma
    //mensagem informando que o objeto foi removido; (ii) se não encontra informa que o
    //objeto não existe na base. Após a mensagem, em ambos os casos, mostra na tela todos os
    //objetos do repositório.

    boolean remover(String nomeSanduiche) {

        for (Sanduiche i : sanduiches) {
            if (i.nomeSanduiche.equals(nomeSanduiche)) {
                sanduiches.remove(i);
                System.out.println("\n-----------------------------------------------------------------------------");
                System.out.println("O Sanduiche "+nomeSanduiche+" foi removido do repositorio\n");
                System.out.println(" SANDUICHES NO REPOSITORIO APOS REMOÇÃO:\n");
                mostrar(sanduiches);
                return true;
            }
        }
        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.println("\nO Sanduiche "+nomeSanduiche+" não foi removido pois não se encontra no repositorio\n");
        System.out.println(" SANDUICHES NO REPOSITORIO QUE PODEM SER REMOVIDOS :\n");
        mostrar(sanduiches);
        return false;
    }

    public static void mostrar (ArrayList<Sanduiche> lista) {
        for (Sanduiche i: lista) {
            System.out.println(i.nomeSanduiche);
        }
    }




    public static void main(String[] args) {

        System.out.println("SISTEMA DE REDE DE RESTAURANTES BOB'S\n");

        System.out.println("------ QUESTÃO 1 ------\n");

        RepositorioSanduiche r = new RepositorioSanduiche();

        // inserir(Sanduiche sanduiche)
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* SAIDA METODO INSERIR =*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n    ");
        r.inserir(new Sanduiche("Frango Tomato Artesanal","Medio"));
        r.inserir(new Sanduiche("Chicken Crispy","Grande"));
        r.inserir(new Sanduiche("Parmesao Artesanal","Pequeno"));
        r.inserir(new Sanduiche("Crispy Bacon"));
        r.inserir(new Sanduiche("Tentador Zero Frango","Grande"));
        r.inserir(new Sanduiche("Big Cheddar Bacon","Grande"));

        // procurar(String nomeSanduiche)
        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* SAIDA METODO PROCURAR =*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
        r.procurar("Frango Tomato Artesanal");
        r.procurar("Parmegiana Artesanal");
        r.procurar("Tentador Carne");

        // remover(String nomeSanduiche)
        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* SAIDA METODO REMOVER =*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        r.remover("Bobs Artesanal");
        r.remover("Big");
        r.remover("Frango");


        // II - Crie dois vetores multidimensionais (com, pelo menos, três linhas e três
        //colunas) de uma classe “Tipo” (vou utilizar o nome Tipo porque cada projeto tem um nome
        //diferente). Você deve utilizar uma classe criada em atividades anteriores que possua no
        //mínimo dois atributos, um destes atributos deve ser do tipo String. Utilize dois laços “ for ”
        //aninhados para responder esta questão. Mostre na tela o vetor resultante da concatenação
        //das Strings nas posições correspondentes em cada vetor multidimensional. A saída na tela
        //deve ser exibida em linhas e colunas, conforme a estrutura de dados subjacente.

        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* SAIDA QUESTAO 2 =*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");


        Sanduiche[][] s = {{new Sanduiche("Frango","Grande"),new Sanduiche("Bacon"),
                new Sanduiche("Cheddar Bacon","Pequeno")},{new Sanduiche("Creme Cheese",
                "Medio"), new Sanduiche("Caipira","Grande"), new Sanduiche("" +
                "Vegano","Pequeno")},{new Sanduiche("Big Bob","Grande"),new Sanduiche("Crispy"),
                new Sanduiche("Big Beef","Pequeno")}};

        Sanduiche[][] s2 = {{new Sanduiche("Frango Acebolado","Grande"),new Sanduiche("Bacon Artesanal"),
                new Sanduiche("Big Frango","Pequeno")},{new Sanduiche("Bobs Salada",
                "Medio"), new Sanduiche("Cheddar Australiano","Grande"), new Sanduiche("" +
                "Costela Artesanal","Pequeno")},{new Sanduiche("Frango Caipira","Grande"),new Sanduiche("Barbecue"),
                new Sanduiche("Parmesao Artesanal","Pequeno")}};

        String[][] conc = new String[3][3];

        System.out.println("Sanduiches do Dia 1(por pedido):\n");

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length ; j++) {

                if ((i == 0 && j==0) || (i==1 && j==0) || (i==2 && j==0)) {
                    System.out.print("P" + (i + 1) + " = ");
                }

                System.out.print(s[i][j].nomeSanduiche+", ");
                if (j == 2) {
                    System.out.println();
                }

            }
        }

        System.out.println("\nSanduiches do Dia 2(por pedido):\n");

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length ; j++) {


                if ((i == 0 && j==0) || (i==1 && j==0) || (i==2 && j==0)) {
                    System.out.print("P" + (i + 1) + " = ");
                }

                System.out.print(s2[i][j].nomeSanduiche+", ");
                if (j == 2) {
                    System.out.println();
                }

            }
        }


        System.out.println("\nSanduiches do Dia 3(por pedido): (CONCATENADOS DIA 1 E 2)\n");


        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length ; j++) {

                conc[i][j] = s[i][j].nomeSanduiche +", "+ s2[i][j].nomeSanduiche ;

                if ((i == 0 && j==0) || (i==1 && j==0) || (i==2 && j==0)) {
                    System.out.print("P" + (i + 1) + " = ");
                }

                System.out.print(conc[i][j]+", ");
                if (j == 2) {
                    System.out.println();
                }

            }
        }


    }

}
