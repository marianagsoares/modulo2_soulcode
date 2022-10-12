import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length);

        for(int i =0;i< numeros.length;i++){
            System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }
        System.out.println(numeros[3]);
        numeros[3] = 1000;
        System.out.println(numeros[3]); //1000

        int[] numeros2 = new int[50];
        numeros2[0] = 500;
        System.out.println(numeros2[0]); //500
        numeros2[1] = -200;
        System.out.println(numeros2[1]); //-200
        numeros2[49] = 90;
        System.out.println(numeros2[49]); //90

        double[] notas = new double[5];
        String[] nomes = {"José Almir", "Renato Pereira"};
        String[] sobrenomes = new String[10];





        //EXEMPLO DE NOTAS
        System.out.println("Digite O total de notas: ");
        Scanner entrada = new Scanner(System.in);
        int totalNotas = entrada.nextInt();
        double[] notasProva = new double[totalNotas];//???

       for (int i=0; i<totalNotas; i++)
       {
           System.out.println("Digite a nota: ");
           notasProva[i] = entrada.nextDouble();
       }

       double soma = 0; //soma tem que ser double porque será somado as notas que também são valores double (decimais)
       for(double nota : notasProva){ //para cada valor que está dentro de notasProva
           soma += nota;
       }
        double media = soma / notasProva.length;
       //condicao ternaria
        String resultado = (media < 7) ? "você está reprovado" : "você está aprovado";
        System.out.println(resultado);
    }
}
