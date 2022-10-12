import java.util.Scanner;

public class exercicio04ifElseWhile {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String continuar = "";

        do{
            System.out.println("Digite sua idade ");
            //int idade = Integer.parseInt(entrada.nextLine());
            int idade = entrada.nextInt();
            entrada.nextLine();
            if (idade < 18){
                System.out.printf("Você é menor de idade e possui %d anos", idade);
            }
            else if(idade>17 && idade <101){
                System.out.printf("Você é maior de idade e possui  %d anos", idade);
            }
            else {
                System.out.printf("Digite uma idade válida\n");
            }
         System.out.printf("\nDeseja continuar?");
         continuar = entrada.nextLine();
        }while(continuar.equals("sim"));
    }
}
