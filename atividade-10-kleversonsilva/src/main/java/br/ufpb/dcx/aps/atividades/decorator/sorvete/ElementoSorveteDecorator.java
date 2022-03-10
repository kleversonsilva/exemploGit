
package br.ufpb.dcx.aps.atividades.decorator.sorvete;

public class ElementoSorveteDecorator implements ElementoSorvete {
    
	private ElementoSorvete decorated;
	private double preco;
	private String sabor;
   

    public ElementoSorvete getDecorated() {
        return decorated;
   
    }
    public double getPreco() {
        return preco;
    }

    @Override
    public String getSabor() {
       
    	if(decorated == null){
        return" ";
        
        }
       
    	return decorated.getSabor();
    }

    public ElementoSorveteDecorator (String sabor, ElementoSorvete decorated){
        this.sabor=sabor;
        this.decorated=decorated;
    }
    
    public ElementoSorveteDecorator (ElementoSorvete decorated){
       
    	this.decorated = decorated;
   
    }
    
    
}