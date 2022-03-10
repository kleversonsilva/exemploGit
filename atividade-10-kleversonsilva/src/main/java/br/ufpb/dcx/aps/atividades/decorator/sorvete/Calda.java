
package br.ufpb.dcx.aps.atividades.decorator.sorvete;
public class Calda extends ElementoSorveteDecorator {

    private String sabor;
    public Calda(String sabor, ElementoSorvete decorated) {
        
    	super(decorated);
        this.sabor = sabor;
    
    } 
    
     public double getPreco() {
    	
        double valor=0.1;
        if (this.getDecorated()==null){
            return valor;
            
        }
        
        else
        	
        {
        	
            valor += this.getDecorated().getPreco();
        
        }
        return valor;
        
    }
    
    
    public String getSabor(){ 
        return " calda("+this.sabor +"),  " + super.getSabor();
        
    }
    
    
}