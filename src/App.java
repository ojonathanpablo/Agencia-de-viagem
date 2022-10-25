import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        Accommodation accommodation1;
        Transport transport1;
        TravelPackage travelPackage1;
        Sale sale1;

        System.out.println("--------------------Pacote de viajem:----------------");
        System.out.println("---------------------CADASTRAMENTO:---------------");
        System.out.println();
        System.out.println();

        System.out.println("---------------Hospedagem--------------------");
        System.out.print("Digite aonde deseja se hospeda: ");
        String descricao = entrada.nextLine();

        System.out.print("Qual o valor da diaria: ");
        double valorDiaria = entrada.nextDouble();

        accommodation1 = new Accommodation(descricao,valorDiaria);
        
      
       System.out.println("-------------Transporte----------------------");
        System.out.println("Qual o meio de transporte?");
        System.out.println("Digite o numero: ");
        System.out.println("(1)aéreo");
        System.out.println("(2)rodoviário");
        System.out.println("(3)marítimo");
        entrada.nextLine();
        int opcao = entrada.nextInt();
        String tipo = null;

        do {
            switch (opcao) {
                case 1:
                    tipo = "aéreo";
                    System.out.println(tipo);
                    break;
                case 2:
                    tipo = "rodoviário";
                    System.out.println(tipo);
    
                    break;
                case 3:
                    tipo = "marítimo";
                    System.out.println(tipo);
                    break;
            
                default:
                    System.out.println("Transporte invalido: ");
                    break;
                }
        }while (opcao == 1 & opcao == 2 & opcao == 3 );

        System.out.print("Digite o valor do transporte: ");
        double valor = entrada.nextDouble();

        transport1 = new Transport(tipo,valor);

    
        System.out.println("--------------Pacote---------------------");

        System.out.print("Digite o destino: ");
        entrada.nextLine();
        String destino = entrada.nextLine();

        System.out.print("Digite a quantidade de dias que deseja passa: ");
        int quantidadeDeDias = entrada.nextInt();

        travelPackage1 = new TravelPackage(destino,quantidadeDeDias,transport1,accommodation1);

        System.out.println("-----------------------Porcentagem-------------------------");

        System.out.print("Digite a sua pocentagem: ");
        double pocentagem = entrada.nextDouble();

        
        System.out.println("--------------Venda---------------------");

        System.out.println("Digite o nome do cliente: ");
        entrada.nextLine();
        String nomeDoCliente = entrada.nextLine();

        System.out.println("Selecione a forma de pagamento: ");
        System.out.println("(1)Dinheiro:");
        System.out.println("(2)Cartão:");
        System.out.println("(3)Pix:");
        int opcao2 = entrada.nextInt();
        String formaDePagamento = null;

        do {
            switch (opcao2) {
                case 1:
                    formaDePagamento = "Dinheiro";
                    System.out.println(formaDePagamento);
                    break;
                case 2:
                    formaDePagamento = "Cartão";
                    System.out.println(formaDePagamento);
    
                    break;
                case 3:
                    formaDePagamento = "Pix";
                    System.out.println(formaDePagamento);
                    break;
            
                default:
                    System.out.println("Forma de pagamento invalido: ");
                    break;
                }
        }while (opcao == 1 & opcao == 2 & opcao == 3 ); 

        sale1 = new Sale(nomeDoCliente,formaDePagamento,travelPackage1);

        System.out.println("Digite a cotação do dolar atual: ");
        double cotacaoDolar = entrada.nextDouble();

        sale1.descricao();

        System.out.println("Total do pacote de hospedagem:-----------------------");
        System.out.println();

        System.out.println("Total da hospedagem: "+travelPackage1.totalDeHospedagem());
        System.out.println("Com "+pocentagem +"%");
        System.out.println("Valor total fica: "+
        travelPackage1.pocentagem(pocentagem,travelPackage1.totalDeHospedagem()));
        System.out.printf( "Valor com transporte: %.2f %n",
        (travelPackage1.totalDoPacote(travelPackage1.pocentagem(pocentagem,travelPackage1.totalDeHospedagem()),valor)));
        System.out.println();
        System.out.println();

        System.out.println("Valor total em Real:-------------------------");

        System.out.printf( "Valor total com transporte: R$: %.2f %n",
        (travelPackage1.totalDoPacote(travelPackage1.pocentagem(pocentagem,travelPackage1.totalDeHospedagem()),valor)));
        System.out.println();

        System.out.println("Valor total em Dolar:-------------------------");
        System.out.printf("Valor total com transporte: $: %.2f %n",
        (sale1.converso(cotacaoDolar,travelPackage1.totalDoPacote(travelPackage1.pocentagem(pocentagem,travelPackage1.totalDeHospedagem()),valor))));
        System.out.println();
        System.out.println("------------------------------------------------");
    }
}