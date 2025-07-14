package patterns.trabalho.v1;

import java.util.ArrayList;
import java.util.List;

public class Modalidade {
    private String nome;
    private Double porcentagemMaxima;
    private List<AtividadeComplementar> atividades = new ArrayList<>();


    public Modalidade(String nome, Double porcentagemMaxima) {
        this.nome = nome;
        this.porcentagemMaxima = porcentagemMaxima;
    }

    public Double porcentagemMaxima() {
        return porcentagemMaxima;
    }

    public String getNome(){
        return nome;
    }

    public void adicionarAtividade(AtividadeComplementar atividade) {
        this.atividades.add(atividade);
    }
    
    public List<AtividadeComplementar> getAtividades() {
        return atividades;
    }
}
