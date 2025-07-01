package patterns.trabalho.v1;

public class AtividadeComplementar {
    private String nome;
    private int limiteMaximo;
    private Modalidade modalidade;


    public AtividadeComplementar(String nome, int limiteMaximo, Modalidade modalidade) {
        this.nome = nome;
        this.limiteMaximo = limiteMaximo;
        this.modalidade = modalidade;
    }

    public String nome() {
        return nome;
    }

    public int limiteMaximo() {
        return limiteMaximo;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }
}
