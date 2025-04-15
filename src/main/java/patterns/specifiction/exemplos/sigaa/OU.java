package patterns.specifiction.exemplos.sigaa;

public class OU implements Regra {
    private Regra esquerdo;
    private Regra direito;

    public OU(Regra esquerdo, Regra direito) {
        this.direito = direito;
        this.esquerdo = esquerdo;
    }


    @Override
    public boolean isSatisfiedBy(Aluno aluno) {
        return esquerdo.isSatisfiedBy(aluno) || direito.isSatisfiedBy(aluno);
    }
}
