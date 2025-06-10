package patterns.prova1.dezenove;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new NumerosPorDois(new NumerosImpares(
                new FaixaDeNumeros(5, 15)));
        List<Integer> n = numeros.gerarLista();

        for (Integer numero : n) {
            System.out.println(numero);
        }

    }
}
