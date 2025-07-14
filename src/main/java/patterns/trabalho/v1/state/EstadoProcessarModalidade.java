package patterns.trabalho.v1.state;

import patterns.trabalho.v1.Modalidade;
import patterns.trabalho.v1.SistemaAtividades;
import patterns.trabalho.v1.AtividadeDeclarada;
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
        int opcao;
        do {
            System.out.println("\n=== " + modalidade.getNome() + " ===");
            System.out.println("Atividades disponíveis:");
            
            var atividades = modalidade.getAtividades();
            for (int i = 0; i < atividades.size(); i++) {
                System.out.printf("%d. %s (Limite: %d horas)%n", 
                    i+1, 
                    atividades.get(i).nome(), 
                    atividades.get(i).limiteMaximo());
            }
            System.out.println("0. Voltar");
            System.out.print("Escolha uma atividade: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            if (opcao > 0 && opcao <= atividades.size()) {
                System.out.print("Informe a quantidade de horas: ");
                int horas = scanner.nextInt();
                scanner.nextLine();
                
                var atividade = atividades.get(opcao - 1);
                AtividadeDeclarada atividadeDeclarada = new AtividadeDeclarada(atividade, horas);
                sistema.getRequerimentoAtual().adicionar(atividadeDeclarada);
                System.out.println("Atividade adicionada com sucesso!");
            }
        } while (opcao != 0);
        
        // Volta para o menu principal
        sistema.setEstadoAtual(new EstadoMenuPrincipal(sistema, scanner));
    }
}
