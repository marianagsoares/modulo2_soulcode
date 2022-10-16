package primeirasAulas;

import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main (String[] args){
        String nome = "Pedro";


       //if(nome ==  "pedro"){ //compara endereco
            //System.out.println("Sao iguais");
        //}

        System.out.println("Digite seu sobrenome");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();
        String teste1 = "PEDRO";

        if (sobrenome.equals("pedro")) { //equals compara valor
            System.out.println("SAO IGUAIS");
        }
        else{
            System.out.println("SAO DIFERENTES");
        }

        String java = "JAVA";
        String ja = java.substring(0, 2);
        String exemplo = java.substring(1,3);
        System.out.println(ja);
        System.out.println(exemplo);

        boolean resultado = sobrenome.equalsIgnoreCase(teste1);
        System.out.println(resultado);

        System.out.println(java.length()); //tamanho da string java //4 caracteres
        System.out.println(java.isEmpty()); //se java for variavel vazia //false or true
        System.out.println(java.toLowerCase()); //java
        System.out.println(java.toUpperCase()); //JAVA

        //quebrando arrays
        String cpf = "188.199.100.03";
        String[] valoresSeparados = cpf.split("\\."); //quando utilizar o ponto "//."
        System.out.print(Arrays.toString(valoresSeparados));
    }
}
