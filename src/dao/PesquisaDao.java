
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import model.Pesquisa;


public class PesquisaDao {
    private final Connection connection;

    public PesquisaDao(Connection connection) {
        this.connection = connection;
    }
    
    public void insertPesquisa(String usuario, Map formulario, int pergunta) throws SQLException{
        String sql = "insert into formulario(pergunta_id, resposta, cliente_usuario) values (?, ?, ?);";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setInt(1, pergunta);
        pst.setString(2, (String) formulario.get(pergunta));
        pst.setString(3, usuario);
        pst.execute();
    }
    
    
    public String buscarPerguntaId(int id) throws SQLException{
        String sql = "select texto from pergunta where id = ?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setInt(1, id);
        pst.execute();
        
        ResultSet rs = pst.getResultSet();
        
        if(rs.next()){
            return rs.getString("texto");
        }else{
            return "";
        }       
    }
    
    public ArrayList<String> buscarRespostaId(int perguntaId) throws SQLException{
        
        ArrayList<String> respostas = new ArrayList<>();
        
        String sql = "select r.texto from pergunta p inner join resposta r on p.id = r.pergunta_id where p.id = ?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setInt(1, perguntaId);
        pst.execute();
        
        ResultSet rs = pst.getResultSet();
        
        while(rs.next()){
            String texto = rs.getString("texto");
            respostas.add(texto);
        }
        
        return respostas;
    }
}
