package Atividade11;


import java.io.*;
import java.util.ArrayList;

public class RepositorioSanduiche implements Serializable {

    ArrayList<Item> sanduiches;
    int cont;

    public RepositorioSanduiche() {
        this.sanduiches = new ArrayList<Item>();
        //sanduiches.add(new Sanduiche("Bobs Frango", "Medio", 12.0));
      //sanduiches.add(new Sanduiche("Bacon", "Pequeno", 2.0));
       cont = 0;
    }

    public static ArrayList<Sanduiche> repositorio(Sanduiche sanduiche) {
        ArrayList<Sanduiche> sanduiches1 = new ArrayList<Sanduiche>();
        sanduiches1.add(sanduiche);
        //sanduiches1.add(new Sanduiche("Frango", "Medio", 12.0));
        //sanduiches1.add(new Sanduiche("Bacon", "Pequeno", 2));
        return sanduiches1;
    }
    public void cadastraSanduiche(Item sanduiche){
        sanduiche.setID(cont);
        this.sanduiches.add(sanduiche);
        cont++;
    }

    public int ultimoID(){
        return cont;
    }

    public Item recuperar(int id) {
        for (Item inter : sanduiches) {
            if (inter.getID() == id)
                return inter;
        }
        return null;
    }


   /* public void removeSanduiche(String sanduiche){
        boolean encontrou = false;
        for(Item i: sanduiches){
            if(i.equals(sanduiche)){
                sanduiches.remove(i);
                encontrou = true;
                System.out.println("Sanduiche "+sanduiche+" removido!");
            }

        }
        if (encontrou == false) {
            System.out.println("Sanduiche "+sanduiche+" não encontrado!");
        }
    }*/

    public static void mostraSanduiche(ArrayList<Sanduiche> sanduiches){
        for (Sanduiche i: sanduiches){
            System.out.println(i.getNome());
        }
    }
    public void salvarRepositorio(String caminhoArquivo) throws IOException {
        // https://www.devmedia.com.br/use-a-serializacao-em-java-com-seguranca/29012
        FileOutputStream fout = new FileOutputStream(caminhoArquivo);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(this);
        oos.close();
    }

    public static RepositorioSanduiche carregarRepositorio(String caminhoArquivo) throws IOException, ClassNotFoundException {
        // https://www.devmedia.com.br/use-a-serializacao-em-java-com-seguranca/29012
        FileInputStream fin = new FileInputStream(caminhoArquivo);
        ObjectInputStream ois = new ObjectInputStream(fin);
        RepositorioSanduiche resp = (RepositorioSanduiche) ois.readObject();
        ois.close();
        return resp;
    }



   /* public static void salvarRepositorio(ArrayList<Sanduiche> sanduiches)  {

        FileOutputStream fos = null;
        ObjectOutputStream oss = null;
        try {
            fos = new FileOutputStream("sanduichedf.txt");
            oss = new ObjectOutputStream(fos);
            oss.writeObject(sanduiches);
        }catch (FileNotFoundException e){
            System.out.println("Arquivo nao encontrado!");
        }catch (IOException e) {
            System.out.println("Erro ao criar o arquivo!");
        } finally {
            if(oss != null){
                try {
                    oss.close();
                }catch (IOException e){
                    System.out.println("Erro ao fechar o arquivo!");
                }
            }
        }
    }

    public static ArrayList<Sanduiche> carregarRepositorio(){
        ArrayList<Sanduiche> sanduiches = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("sanduichedf.txt");
            ois = new ObjectInputStream(fis);
            sanduiches = (ArrayList<Sanduiche>)ois.readObject();
            return sanduiches;
        }catch (ClassNotFoundException e){
            System.out.println("Classe não encontrada.");
        }catch (IOException e ){
            System.out.println("Erro ao criar arquivo.");
        } finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e){
                    System.out.println("Erro ao fechar o arquivo.");
                }
            }
        }
        return null;
    }*/




}

