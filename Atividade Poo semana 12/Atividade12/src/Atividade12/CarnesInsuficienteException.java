package Atividade12;

    // 2- Pelo menos, 2 Exceções

public class CarnesInsuficienteException extends Exception {
    private int numeroCarnes;
    public CarnesInsuficienteException(int numeroCarnes) {
        super("Número insuficiente de carnes!");
        this.numeroCarnes = numeroCarnes;
    }
}
