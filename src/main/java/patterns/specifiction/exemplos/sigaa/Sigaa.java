package patterns.specifiction.exemplos.sigaa;

public class Sigaa {
    private Regra regra;

    public Sigaa(Regra regra) {
        this.regra = regra;
    }

    public boolean estaAprovado(Aluno aluno){
        return this.regra.isSatisfiedBy(aluno);


    }

}
