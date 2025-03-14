package patterns.strategy.exemplos.pagamento.v2;

public class Dinheiro implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado em dinheiro.");
    }
}
