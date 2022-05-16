package Atividade12;

public class CarnesInsuficienteException extends Exception {
    private int numeroCarnes;
    public CarnesInsuficienteException(int numeroCarnes) {
        super("Número insuficiente de carnes!");
        this.numeroCarnes = numeroCarnes;
    }
}
