package patterns.strategy.exemplos.calculadora.v1;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.soma(2, 2);
        System.out.printf("Soma:" +  soma);

    }
}
