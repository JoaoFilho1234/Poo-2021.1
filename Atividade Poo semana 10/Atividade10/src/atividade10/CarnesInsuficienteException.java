package atividade10;
    // 4. a) Crie um novo tipo de exceção;
public class CarnesInsuficienteException extends Exception{
    private int numeroCarnes;
    public CarnesInsuficienteException(int numeroCarnes) {
        super("Número insuficiente de carnes!");
        this.numeroCarnes = numeroCarnes;
    }
}
