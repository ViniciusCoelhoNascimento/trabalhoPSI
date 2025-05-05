package patterns.decorator.exemplos.forma;

public abstract class Decorador implements Forma {
    private Forma forma;

    public Decorador(Forma forma) {
        this.forma = forma;
    }

    @Override
    public void desenhar() {
        this.forma.desenhar();
    }
}
