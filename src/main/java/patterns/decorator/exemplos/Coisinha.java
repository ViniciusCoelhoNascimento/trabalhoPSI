package patterns.decorator.exemplos;

public class Coisinha implements Imprimivel{
    private Imprimivel imprimivel;

    public Coisinha(Imprimivel imprimivel) {
        this.imprimivel = imprimivel;
    }

    @Override
    public String imprimir() {
        return imprimivel.imprimir() + "XXXXXX";
    }
}
