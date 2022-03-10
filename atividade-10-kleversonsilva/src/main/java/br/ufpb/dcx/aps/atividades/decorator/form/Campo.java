package br.ufpb.dcx.aps.atividades.decorator.form;
import br.ufpb.dcx.aps.atividades.decorator.form.validador.ValidadorEmail;
import java.util.function.BooleanSupplier;
import br.ufpb.dcx.aps.atividades.decorator.form.validador.ValidadorInteiro;
import br.ufpb.dcx.aps.atividades.decorator.form.validador.ValidadorTextoSimples;


public class Campo implements ItemFormulario {
    
	private String id;
    private String nome;
    private boolean obrigatorio;
   
    private String valor=" ";
   
    private ValidadorCampo validador;

    public Campo(String id) {
        this.id = id; 
        this.nome = " ";
        this.obrigatorio=false;
        this.valor = " ";
        
        
        this.validador = new ValidadorTextoSimples();

   
    }

    public String getLabel() {
        return null;
   
    }

    public Campo(String id,  String nome) {
        this.id=id;
        this.nome=nome;
      
        this.valor=" ";
        this.obrigatorio = false;
       
        if (id == " email ") {
            this.validador = new ValidadorEmail();
        } else if (id == " idade ") {
            this.validador = new ValidadorInteiro();
        } else if (id==" nome ") {
            this.validador = new ValidadorTextoSimples();
        }

    }

    public Campo(String id, boolean obrigatorio) {
      
    	this.id = id;
        this.obrigatorio = obrigatorio;
        
        this.valor=" ";
        this.validador = new ValidadorTextoSimples();

    }

    public Campo(String id, boolean obrigatorio, String nome) {
        this.id=id;
        this.obrigatorio = obrigatorio;
        this.valor="  ";
        this.nome=nome;
        this.validador = new ValidadorTextoSimples();

    }

    public Campo(ValidadorCampo validador, boolean obrigatorio) {
        this.validador = validador;
        this.obrigatorio =obrigatorio;
        this.valor = "  ";
        this.validador = new ValidadorTextoSimples();
    }
    public void setValidador(ValidadorCampo validador) {
        this.validador = validador;
   
    
    }
    
    public ValidadorCampo getValidador() {
        return this.validador;
    
    }

    public String getId() {
        return this.id;
    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setValor(String valor) {
        this.valor = valor;
    
    }

    public String getValor() {
        
    	return this.valor;
    }

    public boolean isPreenchido() {
       
    	if (this.valor==" ") {
            return false;
        } 
    	
    	else{
            return true;
       
    	}

    }

    public void setObrigatorio(boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
   
    }

    public boolean isObrigatorio() {
        return this.obrigatorio;
    }

    public Resultado validar() {
        
    	if (this.obrigatorio) {
            if (this.valor==" ") {
                if (this.nome==" ") {
                    return new Resultado(true, "campo obrigatorio não foi preenchido");
                }
                else 
                {
                    return new Resultado(true, this.id + ": " + this.id + " campo obrigatorio e não foi preenchido");
                
                }
            }
            

        }

        if (validador==null) {
            return new Resultado(false);
       
        }
       
        return this.validador.validarCampo(this.valor);
    }

   
    
    public BooleanSupplier isEmpty() {
        return null;
    }

}