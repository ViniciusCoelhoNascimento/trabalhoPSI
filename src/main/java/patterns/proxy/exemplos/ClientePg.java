package patterns.proxy.exemplos;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientePg implements Persistencia{
    private DataSource dataSource;

    public ClientePg(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void inserirCliente(Cliente cliente) {
        String sql = "insert into cliente (nome) values (?)";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, cliente.nome());
            stmt.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException("erro ao submeter a instrucao sql", e);
        }
    }

    @Override
    public Cliente buscarClientePorId(int id) {
        return null;
    }
}
