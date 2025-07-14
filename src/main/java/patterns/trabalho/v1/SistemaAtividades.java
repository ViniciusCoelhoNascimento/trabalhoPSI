package patterns.trabalho.v1;

import java.util.List;
import java.util.Scanner;
import patterns.trabalho.v1.command.Command;
import patterns.trabalho.v1.command.ProcessarModalidadeCommand;


public class SistemaAtividades {
    private List<Modalidade> modalidades;
    private Requerimento requerimentoAtual;
    private Scanner scanner;
    
    public SistemaAtividades() {
        this.scanner = new Scanner(System.in);
        this.requerimentoAtual = new Requerimento("123456");
        inicializarModalidades();
    }
    
    private void inicializarModalidades() {
        // Adicione aqui as modalidades e atividades
        Modalidade ensino = new Modalidade("Ensino", 40.0);
        Modalidade extensao = new Modalidade("Extensão", 40.0);
        Modalidade pesInovacao = new Modalidade("Pesquisa e Inovação", 40.0);
        Modalidade complementacao = new Modalidade("Complementação", 20.0);

        ensino.adicionarAtividade(new AtividadeComplementar("Disciplinas cursadas com aproveitamento, não previstas no currículo do curso", 80, ensino));
        ensino.adicionarAtividade(new AtividadeComplementar("Semana acadêmica dos cursos, quando não obrigatória", 40, ensino));
        ensino.adicionarAtividade(new AtividadeComplementar("Participação em atividades de monitoria", 70, ensino));
        ensino.adicionarAtividade(new AtividadeComplementar("Atividades realizadas em laboratórios e/ou oficinas do Instituto", 40, ensino));
        ensino.adicionarAtividade(new AtividadeComplementar("Visita Técnica relacionada à área", 40, ensino));
        ensino.adicionarAtividade(new AtividadeComplementar("Participação em cursos de qualificação na área afim do curso com certificado de aproveitamento", 80, ensino));
        ensino.adicionarAtividade(new AtividadeComplementar("Participação como ouvintes em bancas de projetos integradores de assuntos relacionados à área", 20, ensino));
        ensino.adicionarAtividade(new AtividadeComplementar("Participação como ouvintes em bancas de TCC, dissertações ou teses de assuntos relacionados à área", 20, ensino));
        ensino.adicionarAtividade(new AtividadeComplementar("Desenvolvimento de material didático ou instrucional", 30, ensino));
        ensino.adicionarAtividade(new AtividadeComplementar("Instrutor de cursos abertos à comunidade", 70, ensino));

        extensao.adicionarAtividade(new AtividadeComplementar("Participação em programaou projeto de extensão.", 60, extensao));
        extensao.adicionarAtividade(new AtividadeComplementar("Apresentação de projeto de extensão", 20, extensao));
        extensao.adicionarAtividade(new AtividadeComplementar("Participação em ações sociais cívicas e comunitárias", 40, extensao));
        extensao.adicionarAtividade(new AtividadeComplementar("Texto em jornal ou revista da área", 40, extensao));
        extensao.adicionarAtividade(new AtividadeComplementar("Intercâmbio com instituições de ensino no Brasil ou no exterior", 100, extensao));
        extensao.adicionarAtividade(new AtividadeComplementar("Estágio não-obrigatório na área do curso, formalizado pelo IFSC", 100, extensao));
        extensao.adicionarAtividade(new AtividadeComplementar("Exercício profissional com vínculo empregatício, desde que na área do curso", 100, extensao));

        pesInovacao.adicionarAtividade(new AtividadeComplementar("Participação em programa ou projeto de pesquisa relacionados à área", 60, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Apresentação de projeto de pesquisa relacionado à área", 20, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Autoria e coautoria em artigo publicado em Periódico na área afim", 60, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Livro na área afim", 100, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Capítulo de livro na área afim", 30, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Publicação em Anais de Evento Técnico Científico", 30, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Apresentação de trabalho em Evento Técnico Científico", 20, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Participação de Programa de Iniciação Científica", 60, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Participação como palestrante, conferencista, integrante de mesa-redonda, ministrante de mini-curso em evento científico", 60, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Prêmios concedidos por instituições acadêmicas, científicas e profissionais", 60, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Participação na criação de Produto ou Processo Tecnológico com propriedade intelectual registrada", 100, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Registro de patentes", 100, pesInovacao));
        pesInovacao.adicionarAtividade(new AtividadeComplementar("Participação em grupo de pesquisa na área", 60, pesInovacao));

        complementacao.adicionarAtividade(new AtividadeComplementar("Participação em congressos, jornadas, simpósios, fóruns, seminários, encontros, palestras, festivais e similares, com certificado de aproveitamento e/ou frequência", 20, complementacao));
        complementacao.adicionarAtividade(new AtividadeComplementar("Comissão organizadora de congressos, jornadas, simpósios, fóruns, seminários, encontros, palestras, festivais e similares", 20, complementacao));
        complementacao.adicionarAtividade(new AtividadeComplementar("Premiação em eventos que tenha relação com os objetos de estudo do curso", 30, complementacao));
        complementacao.adicionarAtividade(new AtividadeComplementar("Curso de língua estrangeira", 80, complementacao));
        complementacao.adicionarAtividade(new AtividadeComplementar("Premiação em atividades esportivas como representante do Instituto", 60, complementacao));
        complementacao.adicionarAtividade(new AtividadeComplementar("Representação estudantil em colegiado, grêmio estudantil, centro acadêmico, comissão de formatura, associação esportiva e afins", 40, complementacao));
        complementacao.adicionarAtividade(new AtividadeComplementar("Representação de turma (inclui a participação em conselhos de classe)", 30, complementacao));
        complementacao.adicionarAtividade(new AtividadeComplementar("Participação em Empresa Júnior", 40, complementacao));
        complementacao.adicionarAtividade(new AtividadeComplementar("Classificação em concursos culturais", 20, complementacao));
        complementacao.adicionarAtividade(new AtividadeComplementar("Participação em projetos sociais, trabalho voluntário em entidades vinculadas a compromissos sociopolíticos", 20, complementacao));
        complementacao.adicionarAtividade(new AtividadeComplementar("Desenvolvimento de atividades socioculturais, artísticas e esportivas (coral, música, dança, bandas, grupos teatrais, esportes, entre outros)", 20, complementacao));


        this.modalidades = List.of(ensino, extensao, pesInovacao, complementacao);
    }
    
    public void iniciar() {
        int opcao;
        do {
            exibirMenuModalidades();
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            if (opcao > 0 && opcao <= modalidades.size()) {
                processarModalidade(modalidades.get(opcao - 1));
            }
        } while (opcao != 0);
        
        gerarParecer();
        scanner.close();
    }
    
    private void exibirMenuModalidades() {
        System.out.println("\n=== Menu de Modalidades ===");
        for (int i = 0; i < modalidades.size(); i++) {
            System.out.printf("%d. %s%n", i+1, modalidades.get(i).getNome());
        }
        System.out.println("0. Finalizar e gerar parecer");
        System.out.print("Escolha uma opção: ");
    }
    
    private void processarModalidade(Modalidade modalidade) {
        Command command = new ProcessarModalidadeCommand(this, modalidade, scanner);
        command.execute();
    }
    
    private void gerarParecer() {
        
        RequerimentoValidado validado = new RequerimentoValidado("Sistema", requerimentoAtual);
        validado.validar();
        /*
        System.out.println("\n=== PARECER DAS ATIVIDADES COMPLEMENTARES ===");
        System.out.println("Matrícula: " + requerimentoAtual.getMatricula());
        System.out.println("--------------------------------------------");
        
        for (AtividadeDeclarada atividade : requerimentoAtual.getAtividadesDeclaradas()) {
            System.out.printf("Atividade: %s%n", atividade.nome());
            System.out.printf("Modalidade: %s%n", atividade.modalidade().getNome());
            System.out.printf("Horas declaradas: %d%n", atividade.horasDeclaradas());
            System.out.println("--------------------------------------------");
        }
        
        HorasPorModalidade horasPorModalidade = new HorasPorModalidade(validado);
        Map<Modalidade, Integer> totais = horasPorModalidade.horasPorAtividade();
        
        System.out.println("\nTOTAIS POR MODALIDADE:");
        totais.forEach((modalidade, total) -> {
            System.out.printf("%s: %d (máx. %.1f%%)%n",
                modalidade.getNome(), 
                total, 
                modalidade.porcentagemMaxima());
        });*/
    }
}
