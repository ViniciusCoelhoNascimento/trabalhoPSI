package patterns.decorator.exemplos.forma;

public class Cor extends Decorador {
    private String nome;
    public Cor(String nome, Decorador linhaDecorador) {
        super(linhaDecorador);
        this.nome = nome;
    }

    @Override
    public void desenhar() {
        super.desenhar();
        System.out.println("com a cor tal");
    }
}
