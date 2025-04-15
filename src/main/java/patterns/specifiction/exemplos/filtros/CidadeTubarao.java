package patterns.specifiction.exemplos.filtros;

public class CidadeTubarao {
    public boolean moraEm(Pessoa pessoa){
        return pessoa.estadocivil().equals("Tubarao");
    }
}
