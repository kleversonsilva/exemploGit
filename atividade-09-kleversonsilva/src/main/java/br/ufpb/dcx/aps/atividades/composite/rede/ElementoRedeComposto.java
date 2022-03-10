package br.ufpb.dcx.aps.atividades.composite.rede;


import java.util.LinkedList;

import java.util.List;

public class ElementoRedeComposto extends ElementoRede {

    
	private LinkedList<ElementoRede> componentes = new LinkedList<>();

    public ElementoRedeComposto(String nome) {
       
    	super(nome);
    
    }

    public void addComponente(ElementoRede componente) {
        
    	this.componentes.add(componente);

    
    }

    public List<ElementoRede> getComponentes() {
       
    	return this.componentes;
    
    }

}

