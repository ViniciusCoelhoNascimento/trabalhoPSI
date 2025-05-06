package patterns.command.exemplos.controle;

import java.util.ArrayList;
import java.util.List;

public class Macro implements Comando {
    private List<Comando> listaDeComandos;

    public Macro() {
        this.listaDeComandos = new ArrayList<>();
    }
    public void adiconarCoamndo(Comando comando){
        this.listaDeComandos.add(comando);
    }


    @Override
    public void executar() {
        for(Comando comando: this.listaDeComandos){
            comando.executar();
        }
    }
}
