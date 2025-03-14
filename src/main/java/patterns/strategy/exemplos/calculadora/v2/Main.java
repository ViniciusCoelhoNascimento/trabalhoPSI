package patterns.strategy.exemplos.calculadora.v2;

public class Main {
    public static void main(String[] args) {
        Operacao operacao = new Soma();
        Calculadora calculadora = new Calculadora(operacao);
        double resultado = calculadora.calcular(2, 2);
        System.out.println(resultado);
    }
}
