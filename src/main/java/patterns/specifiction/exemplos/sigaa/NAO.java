package patterns.specifiction.exemplos.sigaa;

public class NAO implements Regra {
    private Regra regra;

    public NAO(Regra regra) {
        this.regra = regra;
    }


    @Override
    public boolean isSatisfiedBy(Aluno aluno) {
        return !isSatisfiedBy(aluno);
    }
}
