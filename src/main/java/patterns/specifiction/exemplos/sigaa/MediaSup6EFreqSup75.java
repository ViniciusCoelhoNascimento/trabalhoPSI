package patterns.specifiction.exemplos.sigaa;

public class MediaSup6EFreqSup75 implements Regra{
    @Override
    public boolean isSatisfiedBy(Aluno aluno) {
        return aluno.media()>=6 && aluno.frequencia()>=75;
    }
}
