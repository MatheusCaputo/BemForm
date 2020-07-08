
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;


public class ClienteDao {
    private final Connection connection;

    public ClienteDao(Connection connection) {
        this.connection = connection;
    }
    
    public void insertCliente(Cliente cliente) throws SQLException{
        String sql = "insert into cliente (nome, usuario, senha) values (?, ?, ?);";
        
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, cliente.getNome());
        pst.setString(2, cliente.getUsuario());
        pst.setString(3, cliente.getSenha());
        pst.execute();
        
    }

    public boolean existeCliente(Cliente cliente) throws SQLException {
        String sql = "select * from cliente where usuario = ? and senha = ?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, cliente.getUsuario());
        pst.setString(2, cliente.getSenha());
        pst.execute();
        
        ResultSet rs = pst.getResultSet();
        
        return rs.next();

    }
    
    public boolean existeUsuario(Cliente cliente) throws SQLException {
        String sql = "select * from cliente where usuario = ? ";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, cliente.getUsuario());
        pst.execute();
        
        ResultSet rs = pst.getResultSet();
        
        return rs.next();

    }
    
    public boolean respondeuPesquisa(String usuario) throws SQLException{
         String sql = "select*from cliente c inner join formulario f on c.usuario = f.cliente_usuario where c.usuario = ?";
         PreparedStatement pst = connection.prepareStatement(sql);
         pst.setString(1, usuario);
         pst.execute();
         
         ResultSet rs = pst.getResultSet();
         
         return rs.next();
    }
}
