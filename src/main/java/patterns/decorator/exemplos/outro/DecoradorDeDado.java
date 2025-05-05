package patterns.decorator.exemplos.outro;

import patterns.flyweight.exemplos.musica.Re;

public class DecoradorDeDado {
    private Relatorio relatorio;

    public DecoradorDeDado(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public String cabecalhoDoRelatorio(){
        String cabeca = "XXXXXXXXXXXXXXXXXXX\n";
        this.relatorio.dado();
        return cabeca + this.relatorio;
    }
}
