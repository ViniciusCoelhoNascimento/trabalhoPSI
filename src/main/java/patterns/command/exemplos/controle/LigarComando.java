package patterns.command.exemplos.controle;

public class LigarComando implements Comando{
    private Dispositivo dispositivo;
    public LigarComando(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void executar() {
        this.dispositivo.ligar();
    }
}
