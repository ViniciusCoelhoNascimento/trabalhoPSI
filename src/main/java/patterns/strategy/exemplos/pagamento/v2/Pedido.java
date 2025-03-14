package patterns.strategy.exemplos.pagamento.v2;


public class Pedido {
    private double valor;
    private Pagamento pagamento;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void realizarPagamento() {
        if (pagamento == null) {
            throw new IllegalStateException("Nenhuma forma de patterns.strategy.exemplos.pagamento definida.");
        }
        pagamento.processarPagamento(valor);
    }
}
