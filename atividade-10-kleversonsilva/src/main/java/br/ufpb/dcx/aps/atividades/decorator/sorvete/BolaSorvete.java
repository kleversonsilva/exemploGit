package br.ufpb.dcx.aps.atividades.decorator.sorvete;
public class BolaSorvete extends ElementoSorveteDecorator {

    private String sabor;

    public BolaSorvete(String sabor, ElementoSorvete decorated) {
        super(decorated);
        this.sabor = sabor;
        
    }

  
    public double getPreco() {
       
    	double valor = 0.5;
        if (this.getDecorated()==null){
           
        	return valor;
        }
        
        else
        
        {
            valor += this.getDecorated().getPreco();
        }
        return valor;
    }

    @Override
    public String getSabor(){
        return this.sabor +", " + super.getSabor();
    }
    
    
}
