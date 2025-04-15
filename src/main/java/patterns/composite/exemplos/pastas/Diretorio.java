package patterns.composite.exemplos.pastas;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Componente{
    private String nome;
    private List<Componente> componentes;

    public Diretorio() {
    }

    public Diretorio(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }

    public void adicionar(Componente componente) {
         componentes.add(componente);
    }

    @Override
    public String exibir() {
        String tudo = this.nome;

        for(Componente c: this.componentes){
            tudo = tudo + "\n" + c.exibir();
        }

        return tudo;
    }
}
