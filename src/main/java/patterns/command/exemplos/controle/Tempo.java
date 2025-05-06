package patterns.command.exemplos.controle;

public class Tempo implements Acionador{
    private Comando comando;

    public Tempo(Comando comando) {
        this.comando = comando;
    }

    @Override
    public void acionar() {
        this.comando.executar();

    }
}
