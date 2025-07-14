# Sistema de Gerenciamento de Atividades Complementares

Sistema desenvolvido em Java para gerenciamento de atividades complementares de alunos, implementando padrões de projeto como Observer para notificações, State para gerenciamento de estados do sistema e Command para encapsular solicitações como objetos.

## 📋 Funcionalidades

- Cadastro de atividades complementares por modalidade (Ensino, Extensão, Pesquisa e Inovação, Complementação)
- Validação automática de horas de acordo com os limites de cada atividade
- Geração de parecer detalhado das atividades validadas
- Notificações por e-mail e sistema quando as atividades são validadas
- Interface de linha de comando (CLI) interativa

## 🚀 Requisitos

- Java 11 ou superior
- Maven (para gerenciamento de dependências)

## 🛠️ Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/ViniciusCoelhoNascimento/trabalhoPSI
   cd trabalhoPSI
   ```

2. Compile o projeto com Maven:
   ```bash
   mvn clean install
   ```

3. Execute o sistema:
   ```bash
   mvn exec:java -Dexec.mainClass="patterns.trabalho.v1.Main"
   ```

## 🎮 Como Usar

1. **Iniciando o Sistema**
   - Ao executar o programa, você verá o menu principal com as modalidades disponíveis.

2. **Navegando no Menu**
   - Digite o número correspondente à modalidade desejada e pressione Enter.
   - Digite 0 para finalizar e gerar o parecer.

3. **Adicionando Atividades**
   - Selecione uma modalidade para ver a lista de atividades disponíveis.
   - Escolha uma atividade digitando seu número.
   - Informe a quantidade de horas da atividade.
   - A atividade será adicionada ao seu requerimento.

4. **Visualizando o Parecer**
   - Ao finalizar (opção 0), o sistema irá gerar um parecer detalhado com:
     - Lista de todas as atividades adicionadas
     - Horas declaradas e validadas para cada uma
     - Observações sobre ajustes realizados
     - Total de horas por modalidade

## 📝 Estrutura do Projeto

```
src/main/java/patterns/trabalho/v1/
├── Main.java                    # Ponto de entrada da aplicação
├── SistemaAtividades.java       # Classe principal do sistema
├── Requerimento.java            # Representa o requerimento do aluno
├── RequerimentoValidado.java    # Gerencia a validação das atividades
├── AtividadeDeclarada.java      # Atividade declarada pelo aluno
├── AtividadeValidada.java       # Atividade após validação
├── AtividadeComplementar.java   # Modelo de atividade complementar
├── Modalidade.java              # Categorias de atividades
├── observer/                    # Padrão Observer
│   ├── SujeitoValidacao.java    # Sujeito (Subject) do Observer
│   ├── NotificadorEmail.java    # Notificação por e-mail
│   └── NotificadorSistema.java  # Notificação no sistema
└── state/                       # Padrão State
    ├── EstadoSistema.java       # Interface do estado
    ├── EstadoMenuPrincipal.java # Estado do menu principal
    └── EstadoProcessarModalidade.java # Estado de processamento de modalidade
└── command/                     # Padrão Command
    ├── Command.java             # Interface do comando
    └── ProcessarModalidadeCommand.java # Implementação concreta do comando
```

## 🛠 Padrões de Projeto Utilizados

1. **Observer**
   - Implementado para notificar automaticamente quando uma atividade é validada
   - Permite adicionar diferentes tipos de notificadores (e-mail, sistema, etc.)

2. **State**
   - Gerencia os diferentes estados do sistema (menu principal, processamento de modalidade)
   - Facilita a adição de novos estados no futuro

3. **Command**
   - Encapsula solicitações como objetos, permitindo parametrizar clientes com diferentes requisições
   - Usado para processar ações do usuário de forma desacoplada

## 📊 Regras de Validação

- Cada atividade tem um limite máximo de horas que pode ser validada
- O sistema ajusta automaticamente as horas excedentes para o limite máximo
- As atividades são agrupadas por modalidade para controle de carga horária

## 📧 Notificações

O sistema envia notificações quando:
- Uma atividade é validada com sucesso
- Ajustes são feitos nas horas declaradas
- O parecer final é gerado

## 📝 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## 👥 Autores

- [Seu Nome]
- [Seu Email]

---

Desenvolvido como trabalho acadêmico para a disciplina de Padrões de Software.
