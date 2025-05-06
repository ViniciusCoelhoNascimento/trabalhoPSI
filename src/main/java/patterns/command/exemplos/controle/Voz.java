package patterns.command.exemplos.controle;

public class Voz implements Acionador {
    private Comando comando;
    public Voz(Comando comando) {
        this.comando = comando;
    }

    @Override
    public void acionar() {
        this.comando.executar();

    }
}
