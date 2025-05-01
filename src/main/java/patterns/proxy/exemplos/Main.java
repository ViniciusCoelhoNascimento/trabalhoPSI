package patterns.proxy.exemplos;

import org.postgresql.ds.PGSimpleDataSource;

public class Main {
    public static void main(String[] args) {


        PGSimpleDataSource ds = new PGSimpleDataSource();
        ds.setServerNames(new String[]{"localhost"});
        ds.setPortNumbers(new int[]{5432});
        ds.setDatabaseName("biblioteca");
        ds.setUser("postgres");
        ds.setPassword("ifsc");




        Cliente cliente = new Cliente("Ana");

    }
}
