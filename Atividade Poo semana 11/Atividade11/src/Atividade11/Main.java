package Atividade11;

import java.io.IOException;
import java.util.Scanner;

public class Main extends RepositorioSanduiche{

    // 10- GUI (interface com usuário), pode ser uma interface em linha de comando.
    static final String opcoes = "Digite qual operacao voce deseja fazer: \n1 - Cadastrar Sanduiche. \n2 - Mostrar Sanduiches. " +
            "\n3 - Sair.\n";



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        RepositorioSanduiche repositorioSanduiche = null;
        String arquivoRepositorio = "sanduiches.txt";
        try {
            repositorioSanduiche = RepositorioSanduiche.carregarRepositorio(arquivoRepositorio);
        } catch (IOException e) {
            System.out.println("Nao foi possivel carregar o repositorio.");
            repositorioSanduiche = new RepositorioSanduiche();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        while (continuar) {
            System.out.println(opcoes);
            int leitura = sc.nextInt();

            if (leitura == 1) {
                System.out.println("Digite o nome do Sanduiche: ");
                String a = sc.nextLine();
                String nome = sc.nextLine();

                System.out.println("Digite o tamanho do Sanduiche: ");
                String tamanho = sc.next();

                System.out.println("Digite o preco do Sanduiche: ");
                double preco = sc.nextDouble();

                Item sanduiche = new Sanduiche2(nome, tamanho, preco);
                repositorioSanduiche.cadastraSanduiche(sanduiche);
                // salvando repositorio no arquivo
                try {
                    repositorioSanduiche.salvarRepositorio(arquivoRepositorio);
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Nao foi poss�vel salvar o arquivo.");
                }

            } else if (leitura == 2) {
                for (int i = 0; i < repositorioSanduiche.ultimoID(); i++) {
                    Item a = repositorioSanduiche.recuperar(i);
                    System.out.println(a);
                }
            } else if (leitura == 3) {
                continuar = false;
            }


        }


    }


}
