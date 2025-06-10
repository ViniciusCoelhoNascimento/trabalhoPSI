package patterns.prova1.dezenove;

import java.util.ArrayList;
import java.util.List;

public class NumerosImpares implements Numeros{
    private Numeros numeros;

    public NumerosImpares(Numeros numeros) {
        this.numeros = numeros;
    }

    @Override
    public List<Integer> gerarLista() {
        List<Integer> impares = new ArrayList<>();

        for (Integer numero : numeros.gerarLista()) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }

        return impares;
    }
}
