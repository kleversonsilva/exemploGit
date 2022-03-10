package br.ufpb.dcx.aps.atividades.composite.rede;

public class ElementoRede  {//////////
	private String ip;
	private String nome;
   

    public ElementoRede (String nome){/////Obs
        this.nome = nome;
    
    }
   
    public String getNome(){
        return this.nome;
    
    }

    public void setNome(String nome){
        this.nome = nome;
    
    }
    public void setIp(String ip){
        this.ip = ip;

   
    }
    public String getIp(){
        return this.ip;
   
    
    }   

}
