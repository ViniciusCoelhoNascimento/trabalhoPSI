package patterns.strategy.exemplos.calculadora.v2;


public class Soma implements Operacao {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}

