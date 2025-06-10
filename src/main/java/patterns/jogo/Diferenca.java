package patterns.jogo;

public class Diferenca  implements Numero{
    private Numero numeroAleatorio;
    private Numero numeroPalpite;

    public Diferenca(Numero numeroAleatorio, Numero numeroPalpite) {
        this.numeroAleatorio = numeroAleatorio;
        this.numeroPalpite = numeroPalpite;
    }

    @Override
    public int numero() {
        return this.numeroAleatorio.numero() - this.numeroPalpite.numero();
    }
}
