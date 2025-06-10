package patterns.jogo;

import java.util.Scanner;

public class Jogar {
    public static void main(String[] args) {
      //  NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
        //NumeroPalpite numeroPalpite = new NumeroPalpite(new Scanner(System.in));
        //NumeroValido numeroValido = new NumeroValido(numeroPalpite);
        //Diferenca diferenca = new Diferenca(numeroAleatorio, numeroPalpite);
        //DiferencaDetalhada diferencaDetalhada = new DiferencaDetalhada(diferenca);
        //Tentativa tentativa = new Tentativa(diferencaDetalhada, 3);
        ///Jogo jogo = new Jogo(tentativa);
        //jogo.jogar();




        //NumeroValido numeroValido = new NumeroValido(numeroPalpite);

        Jogo jogo = new Jogo( new Tentativa(new DiferencaDetalhada( new Diferenca(new NumeroAleatorio(), new NumeroValido(new NumeroPalpite(new Scanner(System.in))) )), 3));
        jogo.jogar();















    }
}
