public class Variaveis {
    //Execução do nosso programa JAVA
    public static void main(String[] args){
        System.out.println("Hello, World"); //equivale ao console.log

        //variaveis no JAVA
        //fortemente tipado e estaticamente tipado
        int idade = 20;
        double salario = 4500.20;
        float nota = 7.5f; //procurar diferença entre float e double
        long populacaoTerra = 7_900_000_00l; // ou 790000000  _ só para melhorar visualização dos números
        boolean tarefaConcluida = true;
        int i = 1, j = 0, k =1000; //multiplas variáveis
        String nome = "Mariana";   //string aspas duplas
        char caractere = 'M'; //chair caractere aspas simples
        int teste = 10;
        teste = 8;
        final int teste2 = 200; //impossivel mudar o valor

        //Operadores
        int a = 10;
        int b = 5;
        int soma = a + b;
        int restoDivisao = a % b;
        System.out.println("O resultado da soma é " + soma);
        System.out.println("O resto da divisão é " + restoDivisao);

        int n1 = 7;
        int n2 =  2; // pelo menos um dos dois precisa ser double para o resultado ter as casas decimais
        double resultado = n1 / n2;
        System.out.println(n1 / n2); //inteiro porque n1 e n2 são inteiros
        System.out.println(resultado); //resultado vai dar 3.0 porque a variável resultado é do tipo double

        double x = Math.sqrt(144); //raiz quadrada de 144
        double y = Math.pow(5, 2); //5 elevado a 2 25
        System.out.println(Math.PI);
        //Casting
        int pi = (int) Math.PI;
        System.out.println(pi); //Converteu  valor de pi para inteiro

        int number1 = 9;
        double number2 = 2;
        double resposta = number1 / (int) number2; //reusultado será 4.0 porque estou convertendo a variável para int
        System.out.println(resposta);
    }
}
