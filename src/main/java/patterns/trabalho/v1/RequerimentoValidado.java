package patterns.trabalho.v1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RequerimentoValidado {
    private String avaliador;
    private Requerimento requerimento;
    private List<AtividadeValidada> atividadesValidadas;
    private LocalDate dataValidacao;

    public RequerimentoValidado(String avaliador, Requerimento requerimento) {
        this.avaliador = avaliador;
        this.requerimento = requerimento;
        this.atividadesValidadas = new ArrayList<>();
        this.dataValidacao = LocalDate.now();
    }

    public void validar() {
        System.out.println("\n=== PARECER DE VALIDAÇÃO ===");
        System.out.println("Matrícula: " + requerimento.getMatricula());
        System.out.println("Data emissão: " + dataValidacao.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println();
        
        int contadorAtividade = 1;
        int totalHorasDeclaradas = 0;
        int totalHorasValidadas = 0;

        for(AtividadeDeclarada ad: requerimento.getAtividadesDeclaradas()) {
            int horasDeclaradas = ad.horasDeclaradas();
            int horasValidadas = horasDeclaradas;
            String observacao = "";
            
            totalHorasDeclaradas += horasDeclaradas;

            if (horasValidadas > ad.limiteMaximo()) {
                observacao = String.format("Horas declaradas (%dh) excedem o limite (%dh); ajustadas para %dh.", 
                    horasValidadas, ad.limiteMaximo(), ad.limiteMaximo());
                horasValidadas = ad.limiteMaximo();
            }
            
            totalHorasValidadas += horasValidadas;

            AtividadeValidada av = new AtividadeValidada(ad, horasValidadas);
            this.adicionar(av);
            
            System.out.printf("Atividade %d:\n", contadorAtividade++);
            System.out.printf("  Descrição:       %s\n", ad.nome());
            System.out.printf("  Modalidade:      %s\n", ad.modalidade().getNome());
            System.out.printf("  Horas declaradas: %dh\n", horasDeclaradas);
            System.out.printf("  Limite Máximo:    %dh\n", ad.limiteMaximo());
            System.out.printf("  Horas validadas:  %dh\n", horasValidadas);
            if (!observacao.isEmpty()) {
                System.out.println("  Observação:      " + observacao);
            }
            System.out.println();
        }
        
        System.out.println("\nResumo geral:");
        System.out.printf("  Total de horas declaradas: %dh\n", totalHorasDeclaradas);
        System.out.printf("  Total de horas validadas:  %dh\n", totalHorasValidadas);
        
        System.out.println("\nValidação concluída!");
    }
    
    public void adicionar(AtividadeValidada atividadeValida) {
        this.atividadesValidadas.add(atividadeValida);
    }

    public List<AtividadeValidada> getAtividadesValidadas() {
        return atividadesValidadas;
    }

    public int total() {
        int t = 0;
        for(AtividadeValidada av : this.atividadesValidadas) {
            t += av.horasValidadas();
        }
        return t;
    }
}
