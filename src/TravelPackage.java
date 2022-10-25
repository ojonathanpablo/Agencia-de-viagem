

public class TravelPackage{
    private String destino;
    private int quantidadeDeDias;
    private Accommodation accommodation; 
    private Transport transport;
    
//----------Metodo-construtor--------------------------------------------
    public TravelPackage(String destino,int quantidadeDeDias,Transport transport, Accommodation accommodation){
        this.destino = destino;
        this.quantidadeDeDias = quantidadeDeDias;
        this.accommodation = accommodation;
        this.transport = transport;
    }


// ------------descricao--------------------------------------------------    
    public void descricao(){
        System.out.println("-----------------------Acomodação-------------------------");
        System.out.println();
        accommodation.descricao();
        System.out.println();
        //
        System.out.println("-----------------------Tranporte---------------------------");
        System.out.println();
        transport.descricao();
        System.out.println();
        //
        System.out.println("------------------------Destino-----------------------------");
        System.out.println();
        System.out.println("Destino: "+destino);
        System.out.println("Quantidade de dias: "+quantidadeDeDias);
        System.out.println();
        //

    }

// ------------getDestino--------------------------------------------------
        public String getDestino(){
            return destino;
        }

// ------------getQuantidadeDeDias--------------------------------------------------
        public int getQuantidadeDeDias(){
            return quantidadeDeDias;
        }

// ------------get é set Accommodation--------------------------------------------------
        public Transport getTransport(){
            return transport;
        }
        public void setTransport(Transport transport){
            this.transport = transport;
        }

 // ------------get é set Transport-------------------------------------------------
        public Accommodation getAccommodation(){
            return accommodation;
        }
        public void setAccommodation(Accommodation accommodation){
            this.accommodation = accommodation;
        }

//-------------totalDeHospedagem----------------------------------------------------------
    public double totalDeHospedagem(){
        double total = getQuantidadeDeDias() * accommodation.getValorDiaria();
        return total;
    }

//-------------Porcentagem----------------------------------------------------------
    public double pocentagem(double pocentagem,double valorTotal){
        double total = valorTotal +=  valorTotal * pocentagem /100;
        return total;
    }

//-----------totalDoPacote-----------------------------------------------------------
    public double totalDoPacote(double pocentagem, double transporte){
        double total = pocentagem + transporte;
        return total;
    }

}

