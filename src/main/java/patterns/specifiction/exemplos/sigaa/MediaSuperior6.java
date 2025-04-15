package patterns.specifiction.exemplos.sigaa;

public class MediaSuperior6 implements Regra {
    @Override
    public boolean isSatisfiedBy(Aluno aluno) {
        return aluno.media()>=6;
    }
}
