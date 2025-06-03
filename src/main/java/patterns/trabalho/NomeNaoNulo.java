package patterns.trabalho;

public class NomeNaoNulo implements Nome{
    private Nome nome;

    public NomeNaoNulo(Nome nome) {
        this.nome = nome;
    }

    @Override
    public String valor() {
        String nome = this.nome.valor();
        if (nome == null) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        return nome;
    }
}
