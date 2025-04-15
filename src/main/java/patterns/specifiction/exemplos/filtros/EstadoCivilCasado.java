package patterns.specifiction.exemplos.filtros;

public class EstadoCivilCasado {
    public boolean ehcasado(Pessoa pessoa){
        return pessoa.estadocivil().equals("Casado");
    }
}
