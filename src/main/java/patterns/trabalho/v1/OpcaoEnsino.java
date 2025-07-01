package patterns.trabalho.v1;

public class OpcaoEnsino implements ItemMenu {
    private String numero;
    private String titulo;

    public OpcaoEnsino(String numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    @Override
    public String numero() {
        return numero;
    }

    @Override
    public String titulo() {
        return titulo;
    }

    @Override
    public void exibir() {

    }
}
