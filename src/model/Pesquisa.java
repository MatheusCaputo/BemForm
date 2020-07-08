
package model;

import java.util.HashMap;
import java.util.Map;


public class Pesquisa {
    private String usuario;
    private int pergunta;
    private String resposta;
    Map<Integer, String> formulario = new HashMap<Integer, String>();

    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void adicionarInfo(Map formulario){
        this.formulario.put(pergunta, resposta);
    }

    public int getPergunta() {
        return pergunta;
    }

    public void setPergunta(int pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    
    
}
