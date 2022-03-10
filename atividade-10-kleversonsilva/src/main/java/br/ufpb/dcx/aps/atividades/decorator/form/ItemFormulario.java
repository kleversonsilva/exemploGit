
package br.ufpb.dcx.aps.atividades.decorator.form;


public interface ItemFormulario {
	
	public String getLabel();
	public String getId();
    public void setValor(String Valor);
    public Resultado validar();
    public void setObrigatorio(boolean obrigatorio);
    public boolean isObrigatorio();
    
    public boolean isPreenchido();
   
    public String getNome();

}
