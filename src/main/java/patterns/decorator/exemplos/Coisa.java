package patterns.decorator.exemplos;

public class Coisa implements Imprimivel{
    private String valor;

    public Coisa(String valor) {
        this.valor = valor;
    }

    @Override
    public String imprimir() {
        return this.valor;
    }
}
