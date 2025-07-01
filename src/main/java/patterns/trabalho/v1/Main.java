package patterns.trabalho.v1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Modalidade ensino = new Modalidade("Ensino", 40.0);
        AtividadeComplementar e1 = new AtividadeComplementar("e1", 20, ensino);
        AtividadeComplementar e2 = new AtividadeComplementar("e2", 40, ensino);

        Modalidade pesquisa = new Modalidade("Pesquisa", 40.0);
        AtividadeComplementar p1 = new AtividadeComplementar("p1", 20, pesquisa);
        AtividadeComplementar p2 = new AtividadeComplementar("p2", 40, pesquisa);

        AtividadeDeclarada ae1 = new AtividadeDeclarada(e1, 30);
        AtividadeDeclarada ap1 = new AtividadeDeclarada(p1, 40);

        Requerimento requerimento = new Requerimento("123456");
        requerimento.adicionar(ae1);
        requerimento.adicionar(ap1);

        RequerimentoValidado requerimentoValidado = new RequerimentoValidado("Avaliador", requerimento);
        requerimentoValidado.validar();


        HorasPorModalidade horasPorModalidade = new HorasPorModalidade(requerimentoValidado);

        Map<Modalidade, Integer> mapaDeDados = horasPorModalidade.horasPorAtividade();

        for(Map.Entry<Modalidade, Integer> dados : mapaDeDados.entrySet()){
            Modalidade m = dados.getKey();
            Integer horas = dados.getValue();
            System.out.println("Modalidade " + m + " -  " + horas);
        }


    }
}
