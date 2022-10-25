public class Sale {
    String nomeDoCliente;
    String formaDePagamento;
    TravelPackage travelPackage;
    

    public Sale(String nomeDoCliente,String formaDePagamento,TravelPackage travelPackage){
        this.nomeDoCliente = nomeDoCliente;
        this.formaDePagamento = formaDePagamento;
        this.travelPackage = travelPackage;
    }
    public void descricao(){
        System.out.println("-----------------------Cliente-------------------------");
        System.out.println();
        System.out.println("Nome do cliente: "+nomeDoCliente);
        System.out.println("Forma de pagamento: "+formaDePagamento);
        System.out.println();
        travelPackage.descricao();        
    }

    public double converso(double cotacaoDolar, double valorTotal){
        double total = valorTotal  / cotacaoDolar ;
        return total;
    }


}
