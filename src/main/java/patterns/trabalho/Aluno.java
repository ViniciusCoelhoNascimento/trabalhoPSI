package patterns.trabalho;

public final class Aluno {
    private final String nome;

    public Aluno(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public String nome(){
        return nome;
    }

}