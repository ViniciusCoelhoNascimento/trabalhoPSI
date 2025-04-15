package patterns.specifiction.exemplos.sigaa;

public class FrequenciaSuperior75 implements Regra {
    @Override
    public boolean isSatisfiedBy(Aluno aluno) {
        return aluno.frequencia()>=75;
    }
}
