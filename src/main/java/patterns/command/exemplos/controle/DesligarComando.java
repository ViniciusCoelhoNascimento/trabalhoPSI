package patterns.command.exemplos.controle;

public class DesligarComando implements Comando {
    private  Dispositivo dispositivo;
    public DesligarComando(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void executar() {
        this.dispositivo.desligar();

    }
}
