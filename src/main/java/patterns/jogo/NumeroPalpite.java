package patterns.jogo;

import java.util.Scanner;

public class NumeroPalpite implements Numero{
    private Scanner scanner;

    public NumeroPalpite(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int numero() {
        System.out.println("Entre um numero [1 a 100]:");
        return scanner.nextInt();
    }
}
