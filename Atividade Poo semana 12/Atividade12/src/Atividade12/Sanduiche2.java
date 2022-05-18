package Atividade12;

import java.io.Serializable;

// 3- b) Pelo menos duas subclasses.


public class Sanduiche2 extends Lanche implements Item, Serializable {

    int id;
    Sanduiche sanduiche;

    public Sanduiche2(String nome, String tamanho, double preco){
        super(nome,preco,tamanho);
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
