
public class Transport {
    private String tipo;
    private double valor;
 
//----------Metodo-construtor--------------------------------------------
    public Transport(String tipo,double valor){
        this.tipo = tipo;
        this.valor = valor;
    }
// ------------descricao--------------------------------------------------    
    public void descricao(){
        System.out.println("Tipo de transporte: "+tipo );
        System.out.println("Valor do transporte: "+valor);
    }
//---------------tipo---------------------------------------------------
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
//------------valor--------------------------------------------------
    public double getValor(){
        return valor;
    }
    public void setValor(double Valor){
        this.valor = valor;
    }



}
