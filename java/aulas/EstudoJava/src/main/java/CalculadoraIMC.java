import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); //scanner é um objeto e entrada é uma instância do objeto scanner

        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade ");
        int idade = entrada.nextInt();

        System.out.println("Meu nome é "+nome+" e minha idade é "+idade + " anos"); //Concatenar

        System.out.println("Digite sua altura em cm");
       double altura = entrada.nextInt();
       double alturaMetros = altura/100;

       System.out.println("Digite seu peso em kg");
       double peso = entrada.nextDouble();

       //IMC = PESO / ALTURA^2
        double imc = peso / Math.pow(alturaMetros, 2);
        System.out.printf("Seu imc é %.2f\n", imc); //printf printar com formatação //f decimais //s string //d inteiros

        System.out.printf("Olá\nMeu nome é %s,tenho %d anos e meu IMC é %.4f\n", nome, idade, imc);
            if(imc < 17){
                System.out.println("Muito abaixo do peso");
            }
            else if (imc>=17 && imc<=18.49){
                System.out.println("Abaixo do peso");
            }
            else if (imc>=18.5 && imc<=24.99){
                System.out.println("Peso Normal");
            }
            else if (imc>=25 && imc<= 29.99){
                System.out.println("Acima do peso");
            }
            else if (imc>=30 && imc<= 34.99){
                System.out.println("Obesidade I");
            }
            else if (imc>=35 && imc<= 39.99){
                System.out.println("Obesidade II (severa)");
            }
            else{
            System.out.println("Obesidade III (mórbida)");
         }
    }
}