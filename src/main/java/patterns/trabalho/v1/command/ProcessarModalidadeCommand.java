package patterns.trabalho.v1.command;

import patterns.trabalho.v1.Modalidade;
import patterns.trabalho.v1.SistemaAtividades;
import java.util.Scanner;

public class ProcessarModalidadeCommand implements Command {
    private final SistemaAtividades sistema;
    private final Modalidade modalidade;
    private final Scanner scanner;

    public ProcessarModalidadeCommand(SistemaAtividades sistema, Modalidade modalidade, Scanner scanner) {
        this.sistema = sistema;
        this.modalidade = modalidade;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        int opcao;
        do {
            System.out.println("\npadrao commad=== " + modalidade.getNome() + " ===");
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
                
                // Aqui você pode adicionar a lógica para processar a atividade
                System.out.println("Atividade processada com sucesso!");
            }
        } while (opcao != 0);
    }
}
