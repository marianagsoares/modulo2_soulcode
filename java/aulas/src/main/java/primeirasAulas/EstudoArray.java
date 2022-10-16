package primeirasAulas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EstudoArray {
    public static void main (String[] args){
        ArrayList<String> nomes = new ArrayList<>(); //entre <> não há como suportar tipos primitivos
        ArrayList<Integer> numeros = new ArrayList<>(); //numeros

        System.out.println(numeros);
        //impresso array vazio
        numeros.add(20); //troco 20 por 500 e removo o 500
        numeros.add(100); //passa a ser posicao 0
        numeros.add(400);
        numeros.add(800);
        numeros.add(100);
        System.out.println(numeros);
        //[20, 100, 400, 800, 100]

        System.out.println(numeros.get(2));
        //400

        numeros.set(0, 500);
        System.out.println(numeros);
        //20 trocado por 500, 20 está na posição 0
        //[500, 100, 400, 800, 100]

        numeros.remove(0);
        System.out.println(numeros);
        //remover numero da posicao 0 //500
        //[100, 400, 800, 100]

        numeros.add(2, 20000000);
        System.out.println(numeros);
        //[100, 400, 20000000, 800, 100]
        //

        System.out.println("-----------------------------------------------------------------------------");

        for (int i=0; i< numeros.size(); i++){
            System.out.println(numeros.get(i));
            //pegue get.(i) o valor que está naquela posicao(i) do array numeros(numeros.size)
        }

        System.out.println("-----------------------------------------------------------------------------");

        for (int contador: numeros){
            System.out.println(contador);
            //Para cada elemento dentro do array numeros, execute o for.
        }
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println(numeros.contains(500)); //true se ele encontrar o valor 500 dentro do array, false nao
        System.out.println(numeros.indexOf(1000)); //qual a posição do 1000 na lista (-1 se ele nao encontrar)
        System.out.println(numeros.indexOf(800)); //A primeira posicao de 800 é 3
        System.out.println(numeros.indexOf(100));//0 porque a primeira posicao de 100 é 0
        System.out.println(numeros.lastIndexOf(100)); //pegou a ultima posicao do 100

    }
}
