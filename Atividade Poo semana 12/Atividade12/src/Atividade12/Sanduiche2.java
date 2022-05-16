package Atividade12;

import java.io.Serializable;

public class Sanduiche2 implements Item, Serializable {

    int id;
    Sanduiche sanduiche;

    public Sanduiche2(String nome, String tamanho, double preco){
        this.sanduiche = new Sanduiche(nome,tamanho,preco);
    }

    @Override
    public String toString() {
        return sanduiche.toString();
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }
}
