package patterns.specifiction.exemplos.sigaa;

public class AlunoBuilder {
    private String nome;
    private double media;
    private int frequencia;

    public AlunoBuilder comNome(String nome){
        this.nome = nome;
        return this;
    }

    public AlunoBuilder tirou(double media){
        this.media = media;
        return this;
    }

    public AlunoBuilder comFrequencia(int freq){
        this.frequencia = freq;
        return this;
    }


    public Aluno build(){
        return new Aluno(nome, media, frequencia);
    }

}
