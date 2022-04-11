package questao1;

import questao2.MotoBoy;

public class Main {
    public static void main(String[] args) {

        System.out.println("=*=*=*=*=*=*=*=*=*=* QUESTAO 1 =*=*=*=*=*=*=*=*=*=*\n");

        CorridaCarros taxi = new Taxi(); // Com polimorfismo
        taxi.setPrecoBase(5.0);
        taxi.calculaCorrida(10, 2);
        System.out.println("Valor da corrida de Taxi: R$ " + taxi.getValorCorrida());

        System.out.println("======================================================");

        CorridaCarros uber = new Uber(); // Com polimorfismo
        uber.setPrecoBase(5.0);
        uber.calculaCorrida(10, 2);
        System.out.println("Valor da corrida de Uber: R$ " + uber.getValorCorrida());

        System.out.println("======================================================");

        Uber uber2 = new Uber();        // Sem polimorfismo
        uber2.setPrecoBase(7.0);
        uber2.calculaCorrida(11, 20);
        System.out.println("Valor da corrida de Uber: R$ " + uber2.getValorCorrida());
        uber2.setAvaliacao(4);
        System.out.println("Avalição corrida: "+uber2.getAvaliacao());

        System.out.println("\n=*=*=*=*=*=*=*=*=*=* QUESTAO 2 =*=*=*=*=*=*=*=*=*=*\n");

        CorridaCarros moto = new MotoBoy();
        moto.calculaCorrida(12,21);
        System.out.println("Valor da corrida do Motoboy: R$ "+moto.getValorCorrida());
    }
}
