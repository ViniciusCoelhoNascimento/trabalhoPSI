package patterns.bd.anemico;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivroDao {
    private DataSource dataSource;

    public LivroDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void inserir(Livro livro) {
        String sql = "INSERT INTO livro (titulo, autor) VALUES (?, ?)";
        try(
            Connection conexao = dataSource.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            stmt.setString(1,livro.getTitulo());
            stmt.setString(2,livro.getAutor());
            stmt.executeUpdate();
            try (
                ResultSet rs = stmt.getGeneratedKeys()){
                    if (rs.next()) {
                        livro.setId(rs.getInt(1));
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException("deu zebra");
            }
    }




    public List<Livro> listarTodos() {
        String sql = "select id, titulo, autor from livro";
        List<Livro> livros = new ArrayList<>();
        try (Connection conexao = dataSource.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            throw new RuntimeException("zebra");
        }
        return livros;


    }




    }

