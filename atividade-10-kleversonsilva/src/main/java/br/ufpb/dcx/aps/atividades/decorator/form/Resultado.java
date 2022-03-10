package br.ufpb.dcx.aps.atividades.decorator.form;
import java.util.List;
import java.util.ArrayList;


public class Resultado {
   
	private boolean erro;
    private List<String> mensagens = new ArrayList<String>();

    public Resultado() {
        this.erro=true;
        
    }

    public Resultado(boolean erro) {
      
    	this.erro = erro;
        
    }

    public Resultado(boolean erro, String mensagem) {
        
        this.mensagens.add(mensagem);
        this.erro = erro;
        
    }

    public void addMensagem(String mensagem) {
       
    	this.mensagens.add(mensagem);

    }

    public List<String> getMensagens() {
        
    	return this.mensagens;
    
    }

    public Boolean getErro() {
    	
        return this.erro;
    
    }

    public void setErro(Boolean erro) {
        this.erro = erro;
        
    }

    public String getMensagem() {
        return this.mensagens.get(0);
    }

    public boolean isErro() {
       
    	if (this.erro) {
            return true;
        } 
    	
    	else
        
        {
            return false;
       
        }

    }

}