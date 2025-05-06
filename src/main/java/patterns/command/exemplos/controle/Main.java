package patterns.command.exemplos.controle;

public class Main {
    public static void main(String[] args) {

        Dispositivo tv = new Televisao();
      //  Dispositivo som = new Som();

        Comando ligarComando = new LigarComando(tv);
        Comando desligarComando = new DesligarComando(tv);

        //Acionador acionador = new Tecla(ligarComando);
        Acionador acionador = new Voz(desligarComando);



      //  acionador.acionar();

        Macro macro = new Macro();
        macro.adiconarCoamndo(ligarComando);
        macro.adiconarCoamndo(desligarComando);

        Acionador acionadorM = new Tempo(macro);
        acionadorM.acionar();


    }
}
