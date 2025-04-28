package patterns.chain.exemplos.desconto;

public class DescontoPorMaisDe10Itens  implements Desconto {
    private Desconto sucessor;

    @Override
    public double valor(Pedido pedido) {
        if (pedido.quantidadeDeItens() > 10) {
            return pedido.total() - (pedido.total() * 0.1);
        }
        return sucessor.valor(pedido);
    }

    @Override
    public void definirSucessor(Desconto desconto) {
        this.sucessor = desconto;

    }
}
