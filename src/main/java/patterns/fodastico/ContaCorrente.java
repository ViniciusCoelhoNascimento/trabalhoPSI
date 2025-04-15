package patterns.fodastico;

public class ContaCorrente {
    private String cliente;

    private Conta conta;

    public ContaCorrente(String cliente) {
        this.cliente = cliente;
        this.conta = new ContaPadrao();
    }

    public void sacar(double v) {
        conta.sacar(v);
    }

    public void returar(double v){
        this.conta.sacar(v);
    }
}
