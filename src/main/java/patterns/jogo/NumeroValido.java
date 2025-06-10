package patterns.jogo;

public class NumeroValido implements Numero{
    private Numero numero;

    public NumeroValido(Numero numero) {
        this.numero = numero;
    }

    @Override
    public int numero() {
        int numeroPalpite = this.numero.numero();
        if(numeroPalpite > 0 && numeroPalpite < 100){
            return numeroPalpite;
        }
        throw  new RuntimeException("numero invalido");
    }
}
