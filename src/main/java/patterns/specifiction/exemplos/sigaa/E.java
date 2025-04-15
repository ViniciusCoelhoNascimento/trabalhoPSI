package patterns.specifiction.exemplos.sigaa;

public class E implements Regra {
    private Regra esquerdo;
    private Regra direito;

    public E(Regra esquerdo, Regra direito) {
        this.direito = direito;
        this.esquerdo = esquerdo;
    }


    @Override
    public boolean isSatisfiedBy(Aluno aluno) {
        return esquerdo.isSatisfiedBy(aluno) && direito.isSatisfiedBy(aluno);
    }
}
