package patterns.trabalho.v1.observer;

import patterns.trabalho.v1.AtividadeValidada;

public class NotificadorEmail implements ObservadorValidacao {
    private String email;
    
    public NotificadorEmail(String email) {
        this.email = email;
    }

    @Override
    public void notificar(AtividadeValidada atividade) {
        String mensagem = String.format(
            "Notificação: Atividade %s foi validada com %d horas",
            atividade.getAtividadeDeclarada().nome(),
            atividade.horasValidadas()
        );
        System.out.println("Enviando e-mail para " + email + ": " + mensagem);
    }
}