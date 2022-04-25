package atividade9;

// 2. d) Crie classes que implementam ambas as interfaces.
public class Salada implements IDescricao, IPagamento {

    private String nomeSalada;
    private int numeroPedido;
    private double valorTotal;
    private String formaPagamento;

    public Salada(String nomeSalada, int numeroPedido, String formaPagamento) {
        this.nomeSalada = nomeSalada;
        numeroDoPedido(numeroPedido);
        formaPagamento(formaPagamento);
        valorTotal();
    }

    public String getNomeSalada() {
        return nomeSalada;
    }

    public void setNomeSalada(String nomeSalada) {
        this.nomeSalada = nomeSalada;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    @Override
    public void numeroDoPedido(int numero) {
        this.numeroPedido = numero;
    }

    @Override
    public void descricao() {
        System.out.println("Descrição:\nSalada: "+getNomeSalada()+", Numero: "+getNumeroPedido()+", Valor Total: R$ "+getValorTotal()
                +", Forma de Pagamento: "+getFormaPagamento());
    }

    @Override
    public void formaPagamento(String forma) {
        this.formaPagamento = forma;
    }

    @Override
    public void valorTotal() {
        if(nomeSalada.equals("Salada com Frango")){
            this.valorTotal = 8.99;
        } else if(nomeSalada.equals("Salada com Carne")){
            this.valorTotal = 12.99;
        } else {
            this.valorTotal = 6.99;
        }
    }

    public static void main(String[] args) {
        Salada salada = new Salada("Salada com Carne",13,"Pix");
        salada.descricao();
    }

}
