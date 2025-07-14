package patterns.trabalho.v1.observer;

import patterns.trabalho.v1.AtividadeValidada;
import java.util.ArrayList;
import java.util.List;

public class SujeitoValidacao {
    private List<ObservadorValidacao> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorValidacao observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorValidacao observador) {
        observadores.remove(observador);
    }

    protected void notificarObservadores(AtividadeValidada atividade) {
        for (ObservadorValidacao obs : observadores) {
            obs.notificar(atividade);
        }
    }
}