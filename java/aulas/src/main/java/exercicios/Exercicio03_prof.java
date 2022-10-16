package exercicios;

import java.util.Scanner;

public class Exercicio03_prof {
    public static void main(String[] args) {
        // Entrada dos dados

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um tamanho: ");
        int tamanho = entrada.nextInt();

        int[] v1 = new int[tamanho]; // vetor tem SEMPRE o tamanho especificado pelo usuario
        int[] v2 = new int[tamanho];
        int armazenaValores[] = new int [v1.length];

        System.out.println("Digite os valores de v1: ");
        for(int i = 0; i < tamanho; i++) { // 0, 1, 2, 3 .. tamanho - 1
            v1[i] = entrada.nextInt();
        }

        System.out.println("Digite os valores de v2: ");
        for(int i = 0; i < tamanho; i++) {
            v2[i] = entrada.nextInt();
        }

        // Processamento de dados

        int encontros = 0;

        for(int i = 0; i < tamanho; i++) {
            if(v1[i] == v2[i]) {
               armazenaValores[encontros] =  v1[i];
                encontros++;
            }
        }

        // Saída
        System.out.printf("Foram %d  encontros", encontros);

        for(int i=0; i<encontros; i++){
            System.out.printf("\nValor %d", armazenaValores[i]);
        }


    }
}