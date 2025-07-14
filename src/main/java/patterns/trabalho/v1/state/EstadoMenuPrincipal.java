package patterns.trabalho.v1.state;

import patterns.trabalho.v1.SistemaAtividades;
import java.util.Scanner;

public class EstadoMenuPrincipal implements EstadoSistema {
    private final SistemaAtividades sistema;
    private final Scanner scanner;

    public EstadoMenuPrincipal(SistemaAtividades sistema, Scanner scanner) {
        this.sistema = sistema;
        this.scanner = scanner;
    }

    @Override
    public void executar() {
        System.out.println("\n=== Menu de Modalidades ===");
        for (int i = 0; i < sistema.getModalidades().size(); i++) {
            System.out.printf("%d. %s%n", i+1, sistema.getModalidades().get(i).getNome());
        }
        System.out.println("0. Finalizar e gerar parecer");
        System.out.print("Escolha uma opção: ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        if (opcao > 0 && opcao <= sistema.getModalidades().size()) {
            sistema.setEstadoAtual(new EstadoProcessarModalidade(sistema, 
                sistema.getModalidades().get(opcao - 1), scanner));
        } else if (opcao == 0) {
            sistema.gerarParecer();
            sistema.setEstadoAtual(null); // Encerra o sistema
        }
    }
}
