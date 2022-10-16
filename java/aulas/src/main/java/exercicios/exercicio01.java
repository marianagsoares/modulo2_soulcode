package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){
        System.out.println("Escolha uma opção");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); //PARA LER COM PONTOS AO INVES DE VIRGULAS
        int resultado = entrada.nextInt();

        System.out.println("Digite o primeiro valor\t");
        double n1 = entrada.nextDouble();
        System.out.println("Digite  segundo valor\t");
        double n2 = entrada.nextDouble();


        switch (resultado){
            case 1 :
                double soma = n1 + n2;
                System.out.printf("O resultado é %.1f", soma);
                break;
            case 2:
                double sub = n1 - n2;
                System.out.printf("O resultado é %.1f", sub);
                break;
            case 3:
                double mult = n1 * n2;
                System.out.printf("O resultado é %.1f", mult);
                break;
            case 4:
                double divi = n1 / n2;
                System.out.printf("O resultado é %.1f", divi);
                break;
            default:
                System.out.printf("Opção inválida");
        }
    }
}
