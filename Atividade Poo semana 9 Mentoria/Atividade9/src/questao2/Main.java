package questao2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.apaga();
        lampada1.mostraEstado();
        lampada1.acende();
        lampada1.mostraEstado();
        lampada1.setPotenciaEmWatts(12);

        Lampada lampada2 = new Lampada();
        lampada2.setPotenciaEmWatts(20);

        Lampada lampada3 = new Lampada();
        lampada3.setPotenciaEmWatts(7);

        Lampada lampada4 = new Lampada();
        lampada4.setPotenciaEmWatts(15);

        Lampada lampada5 = new Lampada();
        lampada5.setPotenciaEmWatts(10);


        ArrayList<Lampada> lampadas = new ArrayList<Lampada>();
        lampadas.add(lampada1);
        lampadas.add(lampada2);
        lampadas.add(lampada3);
        lampadas.add(lampada4);
        lampadas.add(lampada5);


        System.out.println("Antes da ordenação:");
        for (Lampada i: lampadas) {
            System.out.println(i.getPotenciaEmWatts()+" watts");

        }

        Collections.sort(lampadas);

        System.out.println("\nDepois da ordenação decrescente:");

        for (Lampada i: lampadas) {
            System.out.println(i.getPotenciaEmWatts()+" watts");
        }



    }

}
