package patterns.trabalho.v1;

public class Modalidade {
    private String nome;
    private Double porcentagemMaxima;

    public Modalidade(String nome, Double porcentagemMaxima) {
        this.nome = nome;
        this.porcentagemMaxima = porcentagemMaxima;
    }

    public Double porcentagemMaxima() {
        return porcentagemMaxima;
    }

    public String nome(){
        return nome;
    }
}
