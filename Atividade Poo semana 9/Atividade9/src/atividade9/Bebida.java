package atividade9;

public class Bebida implements IPagamento, IDescricao{

    private String nomeBebida;
    private int numeroPedido;
    private double valorTotal;
    private String formaPagamento;

    public Bebida(String nomeBebida, int numeroPedido, String formaPagamento) {
        this.nomeBebida = nomeBebida;
        numeroDoPedido(numeroPedido);
        formaPagamento(formaPagamento);
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
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
    public void numeroDoPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    @Override
    public void descricao() {
        System.out.println("Bebida: "+getNomeBebida()+", Numero: "+getNumeroPedido()+" Valor Total: "+getValorTotal()
        +"Forma de Pagamento: "+getFormaPagamento());
    }

    @Override
    public void formaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;

    }

    @Override
    public void valorTotal() {
        if(nomeBebida.equals("Refrigerante")){
            this.valorTotal = 3.99;
        } else if(nomeBebida.equals("Agua")){
            this.valorTotal = 1.99;
        } else {
            this.valorTotal = 4.99;
        }
    }
}
