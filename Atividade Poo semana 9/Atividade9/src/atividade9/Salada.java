package atividade9;

public class Salada implements IDescricao, IPagamento {

    private String nomeSalada;
    private int numeroPedido;
    private double valorTotal;
    private String formaPagamento;

    public Salada(String nomeSalada, int numeroPedido, String formaPagamento) {
        this.nomeSalada = nomeSalada;
        this.numeroPedido = numeroPedido;
        this.formaPagamento = formaPagamento;
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
        System.out.println("Salada: "+getNomeSalada()+", Numero: "+getNumeroPedido()+" Valor Total: "+getValorTotal()
                +"Forma de Pagamento: "+getFormaPagamento());
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
}
