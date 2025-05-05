package patterns.decorator.exemplos.outro;

import patterns.flyweight.exemplos.musica.Re;

public class Main {

    public static void main(String[] args) {
        Relatorio r = new Relatorio("dfdsfsd");
        new DecoradorDeDado(r);
    }
}
