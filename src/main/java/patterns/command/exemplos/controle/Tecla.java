package patterns.command.exemplos.controle;

public class Tecla implements Acionador {
    private Comando comando;
    public Tecla(Comando comando) {
        this.comando = comando;
    }

    @Override
    public void acionar() {
        this.comando.executar();
    }
}
