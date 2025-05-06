package patterns.command.exemplos;

public class LigarArComando implements Comando{
    private ArCondicionado arCondicionado;

    public LigarArComando(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void executar() {
        this.arCondicionado.ligar();

    }
}
