package patterns.trabalho.v1;

public class AtividadeValidada {
    private AtividadeDeclarada atividadeDeclarada;
    private int horasValidadas;

    public AtividadeValidada(AtividadeDeclarada atividadeDeclarada, int horasValidadas) {
        this.atividadeDeclarada = atividadeDeclarada;
        this.horasValidadas = horasValidadas;
    }

    public Modalidade modalidade(){
        return this.atividadeDeclarada.modalidade();
    }

    public int horasValidadas(){
        return this.horasValidadas;
    }



}
