package patterns.strategy.exemplos.pagamento.v1;


public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(100.0);
        pedido1.processarPagamento("dinheiro", 0);
        pedido1.processarPagamento("cartao_credito", 150);
        pedido1.processarPagamento("cartao_credito", 50);
        pedido1.processarPagamento("pix", 0);
    }
}
