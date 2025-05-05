package patterns.decorator.exemplos;

public class Main {

    public static void main(String[] args) {
        Imprimivel coisa = new Coisa("Willian");
        Coisinha coisinha = new Coisinha(coisa);
        System.out.println(coisa.imprimir());
        System.out.println(coisinha.imprimir());

    }
}
