package patterns.chain.exemplos.desconto;

public class SemDesconto implements Desconto{
    @Override
    public double valor(Pedido pedido) {
        return pedido.total();
    }

    @Override
    public void definirSucessor(Desconto desconto) {
// fim da cadeia
    }
}
