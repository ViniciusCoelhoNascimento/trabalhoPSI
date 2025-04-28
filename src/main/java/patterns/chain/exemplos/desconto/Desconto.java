package patterns.chain.exemplos.desconto;

public interface Desconto {
    double valor(Pedido pedido);
    // definicao da cadeia de responsabilidade;
    void definirSucessor(Desconto desconto);
}
