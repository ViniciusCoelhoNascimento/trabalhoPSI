package patterns.chain.exemplos.desconto;

public class Main {
    public static void main(String[] args) {
        CalculadorDeDesconto calc = new CalculadorDeDesconto();

        Pedido pedido = new Pedido();

        pedido.adicionar(new Item("cerveja", 100));
        pedido.adicionar(new Item("carne", 100));
        pedido.adicionar(new Item("carvao", 100));
        pedido.adicionar(new Item("sal", 100));
        pedido.adicionar(new Item("pao", 100));
        pedido.adicionar(new Item("refri", 100));
        pedido.adicionar(new Item("maionese", 100));
        pedido.adicionar(new Item("musica", 100));
        pedido.adicionar(new Item("aluguel", 100));
        pedido.adicionar(new Item("limpeza", 200));
        pedido.adicionar(new Item("limpeza", 2000));

        System.out.println(pedido.total());

        double v = calc.calcularDesconto(pedido);
        System.out.println(v);


    }
}

