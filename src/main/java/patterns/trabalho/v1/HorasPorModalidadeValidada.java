package patterns.trabalho.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HorasPorModalidadeValidada {
    private final Map<Modalidade, Integer> horasPorModalidade;
    private final int totalHoras;
    private List<String> violacoes;

    public HorasPorModalidadeValidada(Map<Modalidade, Integer> horasPorModalidade, int totalHoras) {
        this.horasPorModalidade = horasPorModalidade;
        this.totalHoras = totalHoras;
        this.violacoes = new ArrayList<>();
    }

    public boolean validar() {
        for (Modalidade modalidade : horasPorModalidade.keySet()) {
            int horasM = horasPorModalidade.get(modalidade);
            double pctMax = modalidade.porcentagemMaxima();
            double horasPermitidas = totalHoras * pctMax / 100;
            if (horasM > horasPermitidas) {
                String msg = String.format(
                        "Modalidade '%s' excede limite: declarou %dh, mas máximo permitido é %dh (%d%% do total).",
                        modalidade.nome(), horasM, horasPermitidas, pctMax
                );
                this.violacoes.add(msg);
                return true;
            }
        }
        return false;
    }
}