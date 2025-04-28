package patterns.chain.exemplos.desconto;

public class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String nome() {
        return nome;
    }

    public double preco() {
        return preco;
    }
}
