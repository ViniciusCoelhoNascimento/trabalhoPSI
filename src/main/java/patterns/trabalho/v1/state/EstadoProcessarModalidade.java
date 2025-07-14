package patterns.trabalho.v1.state;

import patterns.trabalho.v1.Modalidade;
import patterns.trabalho.v1.SistemaAtividades;
import patterns.trabalho.v1.command.ProcessarModalidadeCommand;
import java.util.Scanner;

public class EstadoProcessarModalidade implements EstadoSistema {
    private final SistemaAtividades sistema;
    private final Modalidade modalidade;
    private final Scanner scanner;

    public EstadoProcessarModalidade(SistemaAtividades sistema, Modalidade modalidade, Scanner scanner) {
        this.sistema = sistema;
        this.modalidade = modalidade;
        this.scanner = scanner;
    }

    @Override
    public void executar() {
        ProcessarModalidadeCommand command = new ProcessarModalidadeCommand(sistema, modalidade, scanner);
        command.execute();
        
        sistema.setEstadoAtual(new EstadoMenuPrincipal(sistema, scanner));
    }
}
