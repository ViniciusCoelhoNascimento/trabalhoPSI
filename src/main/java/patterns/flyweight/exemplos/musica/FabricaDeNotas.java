package patterns.flyweight.exemplos.musica;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeNotas {
    private Map<String, Nota> notas;

    public FabricaDeNotas() {
        this.notas = new HashMap<>();
        this.criarNotas();
    }

    public Nota nota(String nota){
        return notas.get(nota);
    }

    private void criarNotas(){
        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
        notas.put("la", new La());
        notas.put("si", new Si());

    }
}
