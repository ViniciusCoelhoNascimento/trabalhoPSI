package patterns.prova1.dezenove;

import java.util.ArrayList;
import java.util.List;

public class NumerosPorDois implements Numeros{
    private Numeros numeros;

    public NumerosPorDois(Numeros numeros) {
        this.numeros = numeros;
    }

    @Override
    public List<Integer> gerarLista() {
        List<Integer> porDois = new ArrayList<>();

        for (Integer numero : this.numeros.gerarLista()) {
            porDois.add(numero * 2);
        }

        return porDois;

    }
}
