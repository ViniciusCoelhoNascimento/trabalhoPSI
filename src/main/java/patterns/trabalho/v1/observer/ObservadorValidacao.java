package patterns.trabalho.v1.observer;

import patterns.trabalho.v1.AtividadeValidada;

public interface ObservadorValidacao {
    void notificar(AtividadeValidada atividade);
}
