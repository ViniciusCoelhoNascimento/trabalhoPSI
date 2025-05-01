package patterns.proxy.exemplos;

public interface Persistencia {
    void inserirCliente(Cliente cliente);
    Cliente buscarClientePorId(int id);
}
