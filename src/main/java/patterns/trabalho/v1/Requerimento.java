package patterns.trabalho.v1;

import java.util.ArrayList;
import java.util.List;


public class Requerimento {
    private String matricula;
    private List<AtividadeDeclarada> atividadesDeclaradas;

    public Requerimento(String matricula) {
        this.matricula = matricula;
        this.atividadesDeclaradas = new ArrayList<>();
    }

    public void adicionar(AtividadeDeclarada atividadeDeclarada) {
        atividadesDeclaradas.add(atividadeDeclarada);
    }

    public List<AtividadeDeclarada> getAtividadesDeclaradas() {
        return atividadesDeclaradas;
    }
}
