
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
import view.LoginView;
import view.PesquisaView;


public class ControllerLogin {
    private LoginView view;

    public ControllerLogin(LoginView view) {
        this.view = view;
    }
    
    public void autenticar() throws SQLException{
        
        String usuario = view.getTxtUsuario().getText();
        String senha = view.getTxtSenha().getText();
        
        Cliente clienteAutenticar = new Cliente(usuario, senha);     

        Connection conexao = new Conexao().getConnection();
        ClienteDao clienteDao = new ClienteDao(conexao);

        boolean existe = clienteDao.existeCliente(clienteAutenticar);
        
        
        if(existe){
            Cliente cli = Cliente.getInstance();
            cli.setUsuario(view.getTxtUsuario().getText());
            boolean respondeu = clienteDao.respondeuPesquisa(cli.getUsuario());
            
            if(respondeu){
                JOptionPane.showMessageDialog(null, "Este usuário já respondeu à pesquisa, obrigado pela colaboração.");
            }else{
                PesquisaView telaPesquisa = new PesquisaView();
                telaPesquisa.setVisible(true);
                view.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos, por favor tente novamente !!!");
        }
    }
    
    public void cadastrarUsuario(){
        CadastroView telaCadastro = new CadastroView();
        telaCadastro.setVisible(true);
    }
    
}
