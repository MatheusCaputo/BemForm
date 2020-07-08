
package controller;

import dao.Conexao;
import dao.PesquisaDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Pesquisa;
import view.PesquisaView;


public class ControllerPesquisa {
    private PesquisaView view;

    public ControllerPesquisa(PesquisaView view) {
        this.view = view;
    }
    
    public void preenchePergunta() throws SQLException{
        Connection conexao = new Conexao().getConnection();
        PesquisaDao pesquisaDao = new PesquisaDao(conexao);
        
        String texto1 = pesquisaDao.buscarPerguntaId(1);
        String texto2 = pesquisaDao.buscarPerguntaId(2);
        String texto3 = pesquisaDao.buscarPerguntaId(3);
        String texto4 = pesquisaDao.buscarPerguntaId(4);
                
        view.getLabelPergunta1().setText(texto1);
        view.getLabelPergunta2().setText(texto2);
        view.getLabelPergunta3().setText(texto3);
        view.getLabelPergunta4().setText(texto4);

    }
    
    public void preencherRespostas() throws SQLException{
        Connection conexao = new Conexao().getConnection();
        PesquisaDao pesquisaDao = new PesquisaDao(conexao);
        
        ArrayList<String> respostas1 = pesquisaDao.buscarRespostaId(1);
        ArrayList<String> respostas2 = pesquisaDao.buscarRespostaId(2);
        ArrayList<String> respostas3 = pesquisaDao.buscarRespostaId(3);
        ArrayList<String> respostas4 = pesquisaDao.buscarRespostaId(4);
        
        respostas1.forEach((resposta)->{
            
            view.getCbRespostas1().addItem(resposta);
  
        });
        
        respostas2.forEach((resposta)->{
            
            view.getCbRespostas2().addItem(resposta);
  
        });
                
        respostas3.forEach((resposta)->{
            
            view.getCbRespostas3().addItem(resposta);
  
        });
                        
        respostas4.forEach((resposta)->{
            
            view.getCbRespostas4().addItem(resposta);
  
        });
    }
    
    public void salvarPesquisa() throws SQLException{
        Connection conexao = new Conexao().getConnection();
        PesquisaDao pesquisaDao = new PesquisaDao(conexao);
        
        Cliente cliente = Cliente.getInstance();
        Pesquisa pesquisa = new Pesquisa();
        Map<Integer, String> formulario = new HashMap<Integer, String>();
        
        String usuario = cliente.getUsuario();
        
        int pergunta1 = 1;
        String resposta1 = view.getCbRespostas1().getSelectedItem().toString();
        int pergunta2 = 2;
        String resposta2 = view.getCbRespostas2().getSelectedItem().toString();
        int pergunta3 = 3;
        String resposta3 = view.getCbRespostas3().getSelectedItem().toString();
        int pergunta4 = 4;
        String resposta4 = view.getCbRespostas4().getSelectedItem().toString();
        
        
        formulario.put(pergunta1, resposta1);
        formulario.put(pergunta2, resposta2);
        formulario.put(pergunta3, resposta3);
        formulario.put(pergunta4, resposta4);
        
        pesquisa.adicionarInfo(formulario);
        
        pesquisaDao.insertPesquisa(usuario, formulario, pergunta1);
        pesquisaDao.insertPesquisa(usuario, formulario, pergunta2);
        pesquisaDao.insertPesquisa(usuario, formulario, pergunta3);
        pesquisaDao.insertPesquisa(usuario, formulario, pergunta4);
        
        JOptionPane.showMessageDialog(null, "Obrigado por colaborar com essa pesquisa.");
        
        view.dispose();
            
    }
}
