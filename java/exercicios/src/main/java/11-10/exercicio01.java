import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){
        System.out.println("Escolha uma opção");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        Scanner entrada = new Scanner(System.in);
        int resultado = entrada.nextInt();

        System.out.println("Digite o primeiro valor");
        double n1 = entrada.nextInt();
        System.out.println("Digite  segundo valor");
        int n2 = entrada.nextInt();

        switch (resultado){
            case 1 :
                double soma = n1 + n2;
                System.out.printf("O resultado é %.1f", soma);
                break;
            case 2:
                double sub = n1 - n2;
                System.out.println(sub);
                break;
            case 3:
                double mult = n1 * n2;
                System.out.println(mult);
                break;
            case 4:
                double divi = n1 / n2;
                System.out.println(divi);
                break;
        }
    }
}
