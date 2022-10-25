

public class Accommodation{
    private String descricao;
    private double valorDiaria;

//----------Metodo-construtor--------------------------------------------
    public Accommodation(String descricao, double valorDiaria){
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }

// ------------descricao--------------------------------------------------
    public void descricao(){
        System.out.println("Descrição: "+descricao );
        System.out.println("Valor da Diaria: "+valorDiaria);
    }

// ------------descricao--------------------------------------------------
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

// ------------valorDiaria--------------------------------------------------
    public double getValorDiaria(){
        return valorDiaria;
    }
    public void setValorDiaria(double valorDiaria){
        this.valorDiaria = valorDiaria;
    }

}