package patterns.trabalho.v1;

import java.util.HashMap;
import java.util.Map;

public class HorasPorModalidade {
    private Map<Modalidade, Integer> horasPorAtividade;
    private RequerimentoValidado requerimentoValidado;

    public HorasPorModalidade(RequerimentoValidado requerimentoValidado) {
        this.requerimentoValidado = requerimentoValidado;
        this.horasPorAtividade = new HashMap<>();
    }

    public Map<Modalidade, Integer> horasPorAtividade() {
        for(AtividadeValidada atividadeValidada : requerimentoValidado.getAtividadesValidadas()){
            Modalidade modalidade = atividadeValidada.modalidade();
            int horas = atividadeValidada.horasValidadas();
            
            int horasAcumuladas = horasPorAtividade.getOrDefault(modalidade, 0);
            
            horasPorAtividade.put(modalidade, horasAcumuladas + horas);
        }
        return horasPorAtividade;
    }
}
