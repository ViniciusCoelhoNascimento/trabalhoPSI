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
            this.horasPorAtividade.put(modalidade, horas);
            Integer acumulado = horasPorAtividade.get(modalidade);
            if(acumulado == null){
                horasPorAtividade.put(modalidade, horas);
            }
            else {
                horasPorAtividade.put(modalidade, acumulado + horas);
            }
        }
        return horasPorAtividade;
    }
}
