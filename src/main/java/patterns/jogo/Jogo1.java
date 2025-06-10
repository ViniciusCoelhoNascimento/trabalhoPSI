package patterns.jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        int tentativas = 0;
        int palpite = -1;
        while (palpite != numeroAleatorio){
            System.out.println("Entre um numero:");
            palpite = scanner.nextInt();
            tentativas++;

            if(palpite < numeroAleatorio){
                System.out.println("é maior");
            } else if (palpite > numeroAleatorio){
                System.out.println("é menor");
            } else {
                System.out.println("Acertou");
            }
        }

        scanner.close();


    }
}
