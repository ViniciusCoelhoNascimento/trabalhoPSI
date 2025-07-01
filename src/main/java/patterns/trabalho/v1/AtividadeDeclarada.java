package patterns.trabalho.v1;

public class AtividadeDeclarada {
    private AtividadeComplementar atividadeComplementar;
    private int horasDeclaradas;

    public AtividadeDeclarada(AtividadeComplementar atividadeComplementar, int horasDeclaradas) {
        this.atividadeComplementar = atividadeComplementar;
        this.horasDeclaradas = horasDeclaradas;
    }

    public int horasDeclaradas() {
        return horasDeclaradas;
    }

    public String nome(){
        return this.atividadeComplementar.nome();
    }

    public int limiteMaximo(){
        return this.atividadeComplementar.limiteMaximo();
    }

    public Modalidade modalidade(){
        return this.atividadeComplementar.getModalidade();
    }
}
