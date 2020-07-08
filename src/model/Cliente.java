
package model;


public class Cliente {
    
    private Cliente(){}
    
    private static Cliente instance = null;
    private String nome;
    private String usuario;
    private String senha;
    
    public static Cliente getInstance(){
        if(instance == null){
            instance = new Cliente();
        }
        return instance;
    }

    public Cliente(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Cliente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Cliente(String usuario) {
        this.usuario = usuario;
    }
    
    
 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
