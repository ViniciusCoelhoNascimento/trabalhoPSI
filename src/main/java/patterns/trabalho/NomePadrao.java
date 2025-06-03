package patterns.trabalho;

public class NomePadrao implements Nome{
    private String valor;

    public NomePadrao(String valor) {
        this.valor = valor;
    }

    @Override
    public String valor() {
        return this.valor;
    }
}
