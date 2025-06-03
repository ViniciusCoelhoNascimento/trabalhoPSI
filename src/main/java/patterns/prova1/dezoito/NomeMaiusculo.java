package patterns.prova1.dezoito;

public class NomeMaiusculo implements Nome{
    private Aluno aluno;

    public NomeMaiusculo(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String nome() {
        return this.aluno.nome().toUpperCase();
    }
}
