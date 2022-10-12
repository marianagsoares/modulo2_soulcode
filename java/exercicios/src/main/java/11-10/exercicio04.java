import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){
        System.out.println("Digite sua idade ");
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();
        String resposta = (idade < 18) ? "você é menor de idade" : "você é maior de idade"; //cond ternaria
        System.out.println(resposta);
    }
}
