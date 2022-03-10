package br.ufpb.dcx.aps.atividades.decorator.sorvete;

public class Chocolate extends ElementoSorveteDecorator {
	private String sabor;
	public Chocolate(String sabor, ElementoSorvete decorated) {
       
		super(decorated);
        this.sabor=sabor;
    }

    @Override
    public String getSabor() {
       
    	return sabor;
    }

}
