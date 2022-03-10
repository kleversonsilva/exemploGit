
package br.ufpb.dcx.aps.atividades.decorator.sorvete;
public class Banana extends ElementoSorveteDecorator {

    private String sabor;
    
    public Banana(String sabor, ElementoSorvete decorated) {
       
    	super(decorated);
        this.sabor = sabor;
    }
   
    public Banana(ElementoSorvete decorated) {
        super(decorated);
        
        
    }
    
    
    public double getPreco() {
        
    	double valor = 0.30;
        if (this.getDecorated() == null){
            return valor;
        }
        
        else
        
        {
            valor += this.getDecorated().getPreco();
        }
        return valor;
    }
    public String getSabor(){
        return " banana, ";
    }
    
}