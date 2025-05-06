package patterns.command.exemplos.controle;

public class Som implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("som ligado");

    }

    @Override
    public void desligar() {
        System.out.println("som desligado");
    }
}
