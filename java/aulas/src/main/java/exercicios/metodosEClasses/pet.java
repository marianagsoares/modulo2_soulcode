package exercicios.metodosEClasses;

public class pet {

    //CLASSE
    private String nome;
    private  int idade;
    private double peso;

    //CONSTRUTOR

    pet (String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //METODOS
    void dormir (){
        System.out.println("Estou dormindo");
    }
    void comer(String comida){

        System.out.printf("Estou comendo "+ comida);
    }

    void fazerSom(){
        System.out.println("SOM SOM SOM");
    }


    void brincar(String brinquedo){
        System.out.println(("Estou brincando com " + brinquedo));
    }

    //PROFESSOR ALMIR SÓ FEZ OS METODOS ESPECIAIS GETTER E SETTER  DO PESO//

    double getPeso(){  //SÓ PODERÁ LER  O PESO

        return this.peso;
    }

    void setPeso(double novoPeso){ //PODE ALTERAR O PESO
        this.peso = novoPeso;
        System.out.println(novoPeso);
    }

}
