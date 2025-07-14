package patterns.trabalho.v1.observer;

import patterns.trabalho.v1.AtividadeValidada;

public class NotificadorSistema implements ObservadorValidacao {
    private String usuarioId;
    
    public NotificadorSistema(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public void notificar(AtividadeValidada atividade) {
        String mensagem = String.format(
            "Notificação no sistema para usuário %s: Atividade %s validada com %d horas",
            usuarioId,
            atividade.getAtividadeDeclarada().nome(),
            atividade.horasValidadas()
        );
        System.out.println(mensagem);
    }
}