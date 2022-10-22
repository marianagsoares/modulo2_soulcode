package exercicios.metodosEClasses;

//MINHA CLASSE

public class Salario {
    String nome;
    String sobrenome;
    double salarioMensal;

    //MEU CONSTRUTOR

    Salario (String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal= salarioMensal;
    }

    //MEUS METODOS CALCULAR SALARIO
    double calcularSalarioAnual(){
        double salarioAnual = this.salarioMensal * 12;
        return salarioAnual;
    }

   void calculoSalarialAnual(){
        double salarioAnual = this.calcularSalarioAnual();
        System.out.printf("O salario anual é %.2f",salarioAnual);
   }


   //MEUS METODOS AUMENTAR  SALARIO

    double aumentarSalario(){
        double aumento = this.salarioMensal * 10 / 100;
        double salarioComAumento = aumento + this.salarioMensal;
        return  salarioComAumento;
    }

    void aumentoSalario(){
        double salarioComAumento = this.aumentarSalario();
        System.out.printf("%.4f", salarioComAumento);
    }


    //----------MEUS METODOS CONCATENAR VARIAVEIS--------------

    String nomeCompleto(String nome, String sobrenome){

        return nome.concat(sobrenome);

    }
}



