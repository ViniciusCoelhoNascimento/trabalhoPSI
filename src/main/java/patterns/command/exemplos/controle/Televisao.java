package patterns.command.exemplos.controle;

public class Televisao implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("tv ligada");
    }

    @Override
    public void desligar() {
        System.out.println("tv desligada");
    }
}
