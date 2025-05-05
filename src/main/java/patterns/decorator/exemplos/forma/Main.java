package patterns.decorator.exemplos.forma;

public class Main {
    public static void main(String[] args) {
        Forma q = new Quadrado();
        Forma c = new Circulo();

        Decorador linhaDecorador = new Linha(0.2, q);

Decorador corDecorador =   new Cor("Azul", linhaDecorador);

    }
}
