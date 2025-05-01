package patterns.proxy.exemplos;

import org.postgresql.ds.PGSimpleDataSource;

public class Main {
    public static void main(String[] args) {
        PGSimpleDataSource ds = new PGSimpleDataSource();
        ds.setServerNames(new String[]{"localhost"});
        ds.setPortNumbers(new int[]{5432});
        ds.setDatabaseName("clientes");
        ds.setUser("postgres");
        ds.setPassword("ifsc");

        Cliente cliente = new Cliente("Ana");
        Persistencia persistencia = new ClientePg(ds);
        persistencia.inserirCliente(cliente);

        Persistencia clientePgProxy = new ClientePgProxy(persistencia);

        Log log = new Log(clientePgProxy);


        Cliente x = log.buscarClientePorId(1);

        System.out.println(x.nome());



    }
}
