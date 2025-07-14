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
            
            // Obtém o valor atual do mapa (ou 0 se ainda não existir)
            int horasAcumuladas = horasPorAtividade.getOrDefault(modalidade, 0);
            
            // Atualiza o mapa com o valor acumulado
            horasPorAtividade.put(modalidade, horasAcumuladas + horas);
        }
        return horasPorAtividade;
    }
}
