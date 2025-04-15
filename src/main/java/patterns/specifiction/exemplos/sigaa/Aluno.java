package patterns.specifiction.exemplos.sigaa;

public class Aluno {
    private String nome;
    private double media;
    private int frequencia;

    public Aluno(String nome, double media, int frequencia) {
        this.nome = nome;
        this.media = media;
        this.frequencia = frequencia;
    }

    public String nome() {
        return nome;
    }

    public double media() {
        return media;
    }

    public int frequencia() {
        return frequencia;
    }
}
