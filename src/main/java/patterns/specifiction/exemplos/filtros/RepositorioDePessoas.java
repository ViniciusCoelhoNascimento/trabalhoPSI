package patterns.specifiction.exemplos.filtros;
import java.util.ArrayList;
import java.util.List;
public class RepositorioDePessoas {
    private List<Pessoa> pessoas;
    public RepositorioDePessoas() {
        this.pessoas = new ArrayList<>();
    }
    public void add(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    public List<Pessoa> listar(Specification specification){
        List<Pessoa> lista = new ArrayList<>();
        for(Pessoa p: pessoas){
            if(specification.isSatifiedBy(p)){
                lista.add(p);
            }
        }
        return lista;
    }
}
