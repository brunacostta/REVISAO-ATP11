import java.util.Scanner;

public class atv1_revisao_atp11{
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    byte opcao;

    System.out.println("\n************ Bradesco Financiamentos **************");
    
            System.out.println("\t|1| Crédito Pessoal    |2| Crédito Imobiliário    |3| Crédito Empresarial    |4| Empréstimo Consignado");
            System.out.print("Digite uma opção: ");
            opcao = Byte.parseByte(sc.nextLine());

            switch(opcao){
                case 1:
                    System.out.println("Opção digitada: Crédito Pessoal");
                break;
                case 2:
                    System.out.println("Opção digitada: Crédito Imobiliário");
                break;
                case 3:
                    System.out.println("Opção digitada: Crédito Empresarial");
                break;
                case 4:
                    System.out.println("Opção digitada: Empréstimo Consignado");
                break;
                default:
                    System.out.println("O número digitado não esta entre as opções previstas");
                break; 

            }
    }
}