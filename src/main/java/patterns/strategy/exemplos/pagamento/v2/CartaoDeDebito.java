package patterns.strategy.exemplos.pagamento.v2;

public class CartaoDeDebito implements Pagamento {
    private double saldoDisponivel;

    public CartaoDeDebito(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    public void processarPagamento(double valor) {
        if (saldoDisponivel >= valor) {
            System.out.println("Pagamento de R$" + valor + " realizado no cartão de débito.");
        } else {
            System.out.println("Pagamento recusado: saldo insuficiente no cartão de débito.");
        }
    }
}

