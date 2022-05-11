package Atividade11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends RepositorioSanduiche{

    static final String opcoes = "Digite qual operacao voce deseja fazer: \n1 - Cadastrar Sanduiche. \n2 - Mostrar Sanduiches. " +
            "\n3 - Sair.\n";

    public static void main(String[] args) {

        /*Sanduiche r = new Sanduiche();
        r.cadastraSanduiche(new Sanduiche("Gato","Medio",2.1));
        r.cadastraSanduiche(new Sanduiche("Pato","Pequeno",12.1));
        r.mostraSanduiche();
        r.removeSanduiche("Gato");
        r.mostraSanduiche();
        r.removeSanduiche("er");
        r.cadastraSanduiche(new Sanduiche("Frango","Grande",2.3));
        r.mostraSanduiche();
        r.removeSanduiche("Pato");
        r.mostraSanduiche();*/

        //RepositorioSanduiche repositorioSanduiche = new RepositorioSanduiche();
        //repositorioSanduiche.cadastraSanduiche(new Sanduiche("Frango","Medio",12.0));
        // repositorioSanduiche.mostraSanduiche();
        //repositorioSanduiche.cadastraSanduiche(new Sanduiche("Bacon","Pequeno",2));
        //repositorioSanduiche.mostraSanduiche();
        //ArrayList<Sanduiche> sanduiches = new ArrayList<Sanduiche>();
        //sanduiches.add(new Sanduiche("Bobs","MEdio",2));
        //sanduiches.add(new Sanduiche("Bacon","p",1));
        //repositorioSanduiche.salvarRepositorio(sanduiches);

        /*ArrayList<Sanduiche> sanduiches1 =  repositorio(new Sanduiche("Bobs","Medio",12.9));
        salvarRepositorio(sanduiches1);
        ArrayList<Sanduiche> carregarSanduiches = carregarRepositorio();
        mostraSanduiche(carregarSanduiches);*/



        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        //RepositorioSanduiche s = new RepositorioSanduiche();
        //ArrayList<Sanduiche> ss = s.sanduiches;
        //ArrayList<Sanduiche> ca = carregarRepositorio();

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

        while (continuar){
            System.out.println(opcoes);// System.in is a standard input stream.
            int leitura = sc.nextInt();

            if (leitura == 1){
                System.out.println("Digite o nome do Sanduiche: ");
                String a = sc.nextLine();
                String nome = sc.nextLine();

                System.out.println("Digite o tamanho do Sanduiche: ");
                String tamanho = sc.next();

                System.out.println("Digite o preco do Sanduiche: ");
                double preco = sc.nextDouble();

                Item sanduiche = new Sanduiche2(nome,tamanho,preco);
                repositorioSanduiche.cadastraSanduiche(sanduiche);
                // salvando repositorio no arquivo
                try {
                    repositorioSanduiche.salvarRepositorio(arquivoRepositorio);
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Nao foi poss�vel salvar o arquivo.");
                }

            } else if (leitura == 2){
                for (int i = 0; i< repositorioSanduiche.ultimoID(); i++){
                    Item a = repositorioSanduiche.recuperar(i);
                    System.out.println(a);
                }
            }

             else if (leitura == 3) {
                continuar = false;
            }


        }



/*
        while (continuar){
            System.out.println("Digite qual operacao voce deseja fazer: ");
            int opcao = sc.nextInt();
            RepositorioSanduiche s = new RepositorioSanduiche();
            ArrayList<Sanduiche> ss = s.sanduiches;
            salvarRepositorio(ss);
            ArrayList<Sanduiche> ca = carregarRepositorio();

            if(opcao == 1){
                System.out.println("Digite o nome do Sanduiche: ");
                String nome = sc.next();

                System.out.println("Digite o tamanho do Sanduiche: ");
                String tamanho = sc.next();

                System.out.println("Digite o preco do Sanduiche: ");
                double preco = sc.nextDouble();


                s.cadastraSanduiche(new Sanduiche(nome,tamanho,preco));




            } else if (opcao == 2) {
                System.out.println("Digite o nome do Sanduiche que deseja remover: ");
                String nomeSandu = sc.nextLine();
            } else if (opcao == 3) {
                System.out.println("Lista de Sanduiches no Repositorio: ");
                mostraSanduiche(ca);
            }else {
                continuar = false;
            }
        }

*/
        // Final aqui




/*        System.out.println("Digite o nome do Sanduiche: ");
        String nome = sc.nextLine();

        System.out.println("Digite o tamanho do Sanduiche: ");
        String tamanho = sc.nextLine();

        System.out.println("Digite o preco do Sanduiche: ");
        double preco = sc.nextDouble();

        RepositorioSanduiche s = new RepositorioSanduiche();
        s.cadastraSanduiche(new Sanduiche("Gato","m",12.3));
        s.cadastraSanduiche(new Sanduiche("Boi","p",1));
        s.cadastraSanduiche(new Sanduiche(nome,tamanho,preco));
        ArrayList<Sanduiche> ss = s.sanduiches;
        salvarRepositorio(ss);
        ArrayList<Sanduiche> ca = carregarRepositorio();
        mostraSanduiche(ca);*/


    }







}
