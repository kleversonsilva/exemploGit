package br.ufpb.dcx.aps.atividades.composite.rede;

public class AP extends ElementoRedeComposto {

    public AP(String nome) {
        super(nome);

    }

    public void addElementoRede(ElementoRede componente) {
        this.addComponente(componente);
    }

}

