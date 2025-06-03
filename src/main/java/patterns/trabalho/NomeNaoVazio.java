package patterns.trabalho;

public class NomeNaoVazio implements Nome{
    private Nome nome;
    public NomeNaoVazio(Nome nome) {
        this.nome = nome;
    }
    @Override
    public String valor() {
            String nome = this.nome.valor();
            if (nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome não pode ser vazio ou conter apenas espaços.");
            }
            return nome;
    }
}
