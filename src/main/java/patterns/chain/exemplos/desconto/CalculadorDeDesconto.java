package patterns.chain.exemplos.desconto;

public class CalculadorDeDesconto {

    public double calcularDesconto(Pedido pedido){
        Desconto mais10itens = new DescontoPorMaisDe10Itens();
        Desconto mais1000 = new DescontoValorMaio1000();
        SemDesconto semDesconto = new SemDesconto();

        // montar a regra de encadeamento/cadeia de responsabilidade

        mais1000.definirSucessor(mais10itens);
        mais10itens.definirSucessor(semDesconto);

        return mais1000.valor(pedido);
    }
}
