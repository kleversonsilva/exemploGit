package br.ufpb.dcx.aps.atividades.composite.rede;

import java.util.List;

public class Roteador extends ElementoRedeComposto {

    public Roteador(String nome) {
        super(nome);

    }

    public List<ElementoRede> getElementos() {
        return this.getComponentes();
    }

   
    public void addElementoRede(ElementoRede componente) {
        this.addComponente(componente);
    }

}