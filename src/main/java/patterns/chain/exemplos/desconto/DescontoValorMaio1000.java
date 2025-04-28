package patterns.chain.exemplos.desconto;

public class DescontoValorMaio1000 implements Desconto {
Desconto sucessor;
    @Override
    public double valor(Pedido pedido) {
        if (pedido.total() > 1000) {
            return pedido.total() - (pedido.total()) * 0.2;
        }

        return this.sucessor.valor(pedido);
    }

    @Override
    public void definirSucessor(Desconto desconto) {
        this.sucessor = desconto;

    }
}
