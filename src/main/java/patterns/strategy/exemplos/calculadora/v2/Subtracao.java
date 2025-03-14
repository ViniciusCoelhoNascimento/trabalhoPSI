package patterns.strategy.exemplos.calculadora.v2;

public class Subtracao implements Operacao {
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}

