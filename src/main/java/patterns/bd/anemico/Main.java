package patterns.bd.anemico;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = criarDataSource();
        LivroDao livroDao = new LivroDao(dataSource);

        LivroService livroService = new LivroService(livroDao);
        livroService.cadastrarLivro("titulo do livro", "autor do livro");



    }
    private static DataSource criarDataSource(){
        PGSimpleDataSource ds = new PGSimpleDataSource();
        ds.setServerNames(new String[]{"localhost"});
        ds.setPortNumbers(new int[]{5432});
        ds.setDatabaseName("biblioteca");
        ds.setUser("postgres");
        ds.setPassword("ifsc");
        return ds;
    }
}
