package patterns.prova1.dezenove;

import java.util.ArrayList;
import java.util.List;

public class FaixaDeNumeros implements Numeros {
    private int inicio;
    private int fim;

    public FaixaDeNumeros(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public List<Integer> gerarLista() {
        List<Integer> lista = new ArrayList<>();
            for (int i = inicio; i <= fim; i++) {
                lista.add(i);
            }
        return lista;
        }
    }

