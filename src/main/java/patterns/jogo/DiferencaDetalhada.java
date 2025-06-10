package patterns.jogo;

public class DiferencaDetalhada implements Numero {
    private Diferenca diferenca;

    public DiferencaDetalhada(Diferenca diferenca) {
        this.diferenca = diferenca;
    }

    public int numero(){
        int resultado = diferenca.numero();
        if (resultado < 0){
            System.out.println("é menor");
        } else if (resultado > 0){
            System.out.println("é maior");
        } else {
            System.out.println("Acertou");
        }
        return resultado;
    }



}
