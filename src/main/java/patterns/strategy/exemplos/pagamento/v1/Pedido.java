package patterns.strategy.exemplos.pagamento.v1;

public class Pedido {
    private double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public void processarPagamento(String formaPagamento, double saldoDisponivel) {
        switch (formaPagamento.toLowerCase()) {
            case "dinheiro":
                System.out.println("Pagamento de R$" + valor + " realizado em dinheiro.");
                break;
            case "cartao_credito":
                if (saldoDisponivel >= valor) {
                    System.out.println("Pagamento de R$" + valor + " realizado no cartão de crédito.");
                } else {
                    System.out.println("Pagamento recusado: saldo insuficiente no cartão de crédito.");
                }
                break;
            case "cartao_debito":
                if (saldoDisponivel >= valor) {
                    System.out.println("Pagamento de R$" + valor + " realizado no cartão de débito.");
                } else {
                    System.out.println("Pagamento recusado: saldo insuficiente no cartão de débito.");
                }
                break;
            case "pix":
                System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
                break;
            default:
                System.out.println("Forma de patterns.strategy.exemplos.pagamento inválida.");
        }
    }
}
