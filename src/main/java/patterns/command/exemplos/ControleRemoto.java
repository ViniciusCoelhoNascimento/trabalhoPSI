package patterns.command.exemplos;

public class ControleRemoto {
    private Comando comando;

    public ControleRemoto(Comando comando) {
        this.comando = comando;
    }

    public void pressionarBotao(){
        comando.executar();
    }
}
