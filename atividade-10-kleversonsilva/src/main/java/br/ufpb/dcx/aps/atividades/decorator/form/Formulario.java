package br.ufpb.dcx.aps.atividades.decorator.form;
import java.util.List;
import java.util.ArrayList;

public class Formulario {
   
	private String titulo;
   
    private List<Campo> campos=new ArrayList<Campo>();
    
    private List<ItemFormulario> itens=new ArrayList<ItemFormulario>();

    public Formulario(String titulo){
        this.titulo =  titulo;
    }
    
    public void addItemFormulario(ItemFormulario item){
       
    	for (ItemFormulario ns : this.itens){
            
    		if(ns.getId().equals( item.getId())){
                throw new RuntimeException(" " + item.getId() + " Já existe");
            }
    		
        }
       
    	this.itens.add(item);
    }
    
    public ItemFormulario getItemFormulario(String id){
       
    	for(ItemFormulario kl : this.itens){
            if(kl.getId().equals(id)){
                return kl;
                
            }
        }
        return null;
    }
    
    public List<ItemFormulario>  getItemFormulario(){
        return this.itens;
    }
    
    public Formulario() {
        this.titulo = " ";
    }

    public String getTitulo() {
        return this.titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo=titulo;
        
    }

    public void addCampo(Campo campo) {
       
    	if (campoIgualid(campo.getId())) {
            throw new RuntimeException("Já existe um campo com este id: " + campo.getId() + " ");
        } 
        else
        {
          
        	this.campos.add(campo);
        }
    }

    public List<Campo> getCampos() {
        return this.campos;
    }

    public Campo getCampo(String id) {
        for (Campo ac : this.campos) {
            if (ac.getId().equals(id)) {
                return ac;
            }
        }
        throw new RuntimeException("Nada Encontrado");
    }

    public boolean campoIgualid(String id) {
        
    	for (Campo iz : this.campos) {
           
        	if (iz.getId() == id) {
                return true;
            }
        }
    	
        return false;
        
    }

    public Resultado validar() {
        boolean controle = false;
        
        Resultado xa = new Resultado(true);
       
        for (ItemFormulario t : this.itens) {
            if (t.validar().isErro()) {
                
            	controle = true;
                if(this.itens.size() == 3){
                    xa.addMensagem(t.getId()+": " + t.validar().getMensagem());
                }
               
                else
                
                {
                    xa.addMensagem(t.validar().getMensagem());
                }
                
            }
            
        }
        
        if (controle) {
            return xa;
        }
        
        return new Resultado(false);
        
    }
    


}

