import java.util.Scanner;

public class atv1_revisao_atp11{
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    byte opcao;
    char continua = 'N';

    do{
            System.out.println("\n************ Bradesco Financiamentos **************");
            System.out.println("\t|1| Crédito Pessoal    |2| Crédito Imobiliário    |3| Crédito Empresarial    |4| Empréstimo Consignado");
            System.out.print("Digite uma opção: ");
            opcao = Byte.parseByte(sc.nextLine());

            switch(opcao){
                case 1:
                    System.out.println("Opção digitada: Crédito Pessoal");
                break;
                case 2:
                    System.out.println("Opção digitada: Crédito Imobiliário.\n");
                break;
                case 3:
                    System.out.println("Opção digitada: Crédito Empresarial.\n");
                break;
                case 4:
                    System.out.println("Opção digitada: Empréstimo Consignado.\n");
                break;
                default:
                    System.out.println("\tO número digitado não esta entre as opções previstas.");
                break; 
            }

            if(opcao > 0 && opcao < 5 ){
                do{
                    System.out.print("Para voltar digite V e para sair digite S: ");
                    continua = sc.nextLine().toUpperCase().charAt(0); 
                                                           
                }while(continua!='V' && continua!='S');

                char S = 's';
                System.out.println("\tAplicação finalizada! Obrigada e até a próxima!\n");
            }

        }while(opcao < 1 || opcao > 4 || continua =='V');

        sc.close();
    }
}