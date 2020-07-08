
package controller;

import dao.ClienteDao;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import view.CadastroView;


public class ControllerFormCadastro {
    private CadastroView view;

    public ControllerFormCadastro(CadastroView view) {
        this.view = view;
    }
    
    public boolean verificaUsuario() throws SQLException{
        String usuario = view.getTxtUsuario().getText();
        
        Cliente usuarioVerificar = new Cliente(usuario);
            
        Connection conexao = new Conexao().getConnection();
        ClienteDao clienteDao = new ClienteDao(conexao);
        boolean existeUsuario = clienteDao.existeUsuario(usuarioVerificar);
        
        return existeUsuario;
    }
               
    public void salvaUsuario(){
        
        String nome = view.getTxtNome().getText();
        String usuario = view.getTxtUsuario().getText();
        String senha = view.getTxtSenha().getText();
        
        Cliente cliente = new Cliente(nome, usuario, senha);
        
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDao clienteDao = new ClienteDao(conexao);
            
            if(cliente.getNome().equals("")||cliente.getUsuario().equals("")||cliente.getSenha().equals("")){
                JOptionPane.showMessageDialog(null, "Há campos vazios, todos os campos são obrigatórios, por favor preencha-os.");
            } else if(verificaUsuario()){
                JOptionPane.showMessageDialog(null, "Usuário existente, por favor crie outro nome de usuário !!!");
            }else{
                clienteDao.insertCliente(cliente);
            
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso !");
                view.dispose();
            }     
        } catch (SQLException ex) {
            Logger.getLogger(CadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
