package patterns.fodastico;

public class ContaPadrao implements Conta{
    private double saldo = 0;
    @Override
    public void sacar(double v) {
        this.saldo = this.saldo - v;

    }

    @Override
    public void depositar(double v) {
        this.saldo = this.saldo + v;
    }
}
