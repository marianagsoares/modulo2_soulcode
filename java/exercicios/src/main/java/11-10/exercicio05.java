import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); //instanciar a class Scanner na var entrada
        double soma = 0;
        double media = 0;

        System.out.printf("Quantos valores deseja inserir?");
        int quantidade = entrada.nextInt();

        double armazenaValores[] = new double[quantidade];

        for(int i = 0; i < armazenaValores.length; i++){ // i<quantidade; //aramazenaValores.length = quantidade
            System.out.printf("Digite o %dª valor", (i + 1));
            double valor = entrada.nextDouble();
            armazenaValores[i] = valor;
            soma = soma + armazenaValores[i]; //armazenaValores[i] = valor
            media = soma / armazenaValores.length;
        }
        System.out.printf("A soma dos valores é %.2f e a média é %.2f ", soma, media);

    }
}
