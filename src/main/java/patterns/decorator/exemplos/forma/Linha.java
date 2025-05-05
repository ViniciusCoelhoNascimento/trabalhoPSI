package patterns.decorator.exemplos.forma;

public class Linha extends Decorador {
    private double espessura;
    public Linha(double espessura, Forma forma) {
        super(forma);
        this.espessura = espessura;
    }

    @Override
    public void desenhar() {
        //
        super.desenhar();
        //
        System.out.println("com linha com espessura tal");
    }
}
