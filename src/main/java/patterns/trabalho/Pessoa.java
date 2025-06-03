package patterns.trabalho;

public final class Pessoa {
    private final Nome nome;

    public Pessoa(Nome nome) {
        this.nome = nome;
    }

    public String nome() {
        return nome.valor();
    }
}
