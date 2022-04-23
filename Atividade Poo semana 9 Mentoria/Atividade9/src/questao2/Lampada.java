package questao2;

public class Lampada implements Comparable<Lampada>{

    private String estadoDaLampada;
    private int potenciaEmWatts;

    public void acende(){
        this.estadoDaLampada = "Aceso";
    }

    public void apaga(){
        this.estadoDaLampada = "Apagado";
    }

    public int getPotenciaEmWatts() {
        return potenciaEmWatts;
    }

    public void setPotenciaEmWatts(int potenciaEmWatts) {
        this.potenciaEmWatts = potenciaEmWatts;
    }

    public void mostraEstado(){
        if(estadoDaLampada.equals("Aceso")){
            System.out.println("A lampada esta acesa");
        }
        else {
            System.out.println("A lampada esta apagada");
        }
    }


    @Override
    public int compareTo(Lampada l) {
        if(this.potenciaEmWatts < l.getPotenciaEmWatts()){
            return 1;
        } else if (this.potenciaEmWatts > l.getPotenciaEmWatts()) {
            return -1;
        } else {
            return 0;
        }
    }
}
