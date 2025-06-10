package patterns.jogo;

public class Tentativa {
    private DiferencaDetalhada diferencaDetalhada;
    private int numeroDeTentativas;

    public Tentativa(DiferencaDetalhada diferencaDetalhada, int numeroDeTentativas) {
        this.diferencaDetalhada = diferencaDetalhada;
        this.numeroDeTentativas = numeroDeTentativas;
    }

    public boolean acertou() {
        int tentativa = 1;
        while (tentativa <= this.numeroDeTentativas) {
            if (this.diferencaDetalhada.numero() == 0) {
                return true;
            }
            tentativa++;

        }
        return false;
    }
}
