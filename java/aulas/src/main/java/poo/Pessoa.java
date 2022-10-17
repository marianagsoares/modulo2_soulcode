package poo;

public class Pessoa {
    //atributos/propriedades de uma pessoa
    //classe Pessoa deve ter o mesmo nome do construtor Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    //construtor Pessoa da Classe Pessoa
    //Pessoa(){
        //this representa o objeto
        //this.nome = "José";
        //this.sobrenome = "Ferreira";
        //this.idade = 15;
        //this.altura =  1.64;
   //}

    //Ações
    void dizOla(){
        System.out.println("Olá tudo bem? meu nome é " + this.nome);
    }

   //-------------FORMA CORRETA-------------------//
    Pessoa(String nome, String sobrenone, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }


    //NAO PODE HAVER UM CONSTRUTOR COM OS ATRIBUTOS NA MESMA ORDEM
    //PODE TEM COM OS MESMOS ATRIBUTOS
    //MAS NAO OS MESMOS ATRIBUTOS NA MESMA ORDEM
    Pessoa (String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }


    //NAO HÁ NECESSIDADE DE RETORNO POIS ELE SÓ ESTÁ PRINTANDO POR ISSO VOID

    void mostrarImc(){
        double imc = this.calculaImc();
        System.out.printf("Meu imc é %.2f\n", imc);
        //printf porque usei %.2 d porque usei double
    }


    //SEMPRE QUE ELE COLOCA O TIPO DA VARIAVEL É NECESSARIO ATRIBUIR UM VALOR DE ROTRNO
    //NAO E VOID PORQUE EU QUERO QUE ELE ME RETORNE O VALOR DO CALCULO DO IMC

    double calculaImc(){
        double imc = this.peso / (Math.pow(this.altura, 2));
        return imc;
    }

}
