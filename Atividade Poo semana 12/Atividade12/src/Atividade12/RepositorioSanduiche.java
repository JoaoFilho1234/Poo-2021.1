package Atividade12;


import java.io.*;
import java.util.ArrayList;



public class RepositorioSanduiche implements Serializable {

    ArrayList<Item> sanduiches;
    int cont;

    public RepositorioSanduiche() {
        this.sanduiches = new ArrayList<Item>();
        cont = 0;
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

    public static void mostraSanduiche(ArrayList<Sanduiche> sanduiches){
        for (Sanduiche i: sanduiches){
            System.out.println(i.getNome());
        }
    }



    public void salvarRepositorio(String caminhoArquivo) throws IOException {

        FileOutputStream fout = new FileOutputStream(caminhoArquivo);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(this);
        oos.close();
    }



    public static RepositorioSanduiche carregarRepositorio(String caminhoArquivo) throws IOException, ClassNotFoundException {

        FileInputStream fin = new FileInputStream(caminhoArquivo);
        ObjectInputStream ois = new ObjectInputStream(fin);
        RepositorioSanduiche resp = (RepositorioSanduiche) ois.readObject();
        ois.close();
        return resp;
    }


}

