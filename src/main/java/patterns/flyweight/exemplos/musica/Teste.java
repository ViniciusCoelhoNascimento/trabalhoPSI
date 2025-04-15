package patterns.flyweight.exemplos.musica;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Nota> musica = new ArrayList<>();


        FabricaDeNotas fabricaDeNotas = new FabricaDeNotas();

        musica.add(fabricaDeNotas.nota("do"));

        musica.add(fabricaDeNotas.nota("re"));
        musica.add(fabricaDeNotas.nota("mi"));
        musica.add(fabricaDeNotas.nota("fa"));
        musica.add(fabricaDeNotas.nota("fa"));
        musica.add(fabricaDeNotas.nota("fa"));


        Piano piano = new Piano();
        piano.tocar(musica);
    }
}
