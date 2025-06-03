package patterns.trabalho;

public class NomeNaoNulo implements Nome{
    private Nome nome;

    public NomeNaoNulo(Nome nome) {
        this.nome = nome;
    }

    @Override
    public String valor() {
        if (nome.valor() == null) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        return nome.valor();
    }
}
