package patterns.jogo;

public class NumeroAleatorio implements Numero{
    private final int numero;

    public NumeroAleatorio() {
        this.numero = (int) (Math.random() * 100);
    }

    @Override
    public int numero() {
        return this.numero;
    }
}
