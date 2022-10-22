package poo.escola;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){

        //**********Atencao Carlos SERA IMPRESSO COM METODO SE APRESENTAR QUE VEM DA SUPER + O OVERRIDE DE ALUNO *********
        //ALUNO E UMA PESSOA
        Aluno aluno1 = new Aluno ("Carlos", "carlos@gmail.com", "03899856", 8.5);
        aluno1.seApresentar();

        //PROFESSOR E UMA PESSOA
        Professor prof1 = new Professor("Joao Pedro", "joao@gmail.com", "4324548", "T.I");
        prof1.seApresentar();

        //PESSOA SUPER CLASSE //PERCEBA QUE ANA JULIA SO CHAMOU O QUE ESTA NA SUPER CLASSE
        pessoa pessoa1 = new pessoa("Ana Julia", "ana@gmail.com", "2222222222");
        pessoa1.seApresentar();

        System.out.print("\n-----------------INICIO DO POLIMORFISMOS------------------\n");

        //ALUNO E UMA PESSOA
        pessoa pessoa2 = new Aluno("Jenifer Almeida", "jen@gmail.com", "35552622", 8.8);
        pessoa2.seApresentar();

        //PROFESSOR E UMA PESSOA
        pessoa pessoa3= new Professor("Henrique", "henrique@gmail.com", "5425478522", "Matematica");
        pessoa3.seApresentar();


        System.out.print("\n\n-------------------------INSERIR OS OBJETOS NO ARRAY----------------------------\n");

        ArrayList<pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno1);
        pessoas.add(prof1);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        for(pessoa pessoaDentroFor : pessoas) {
            //pessoa é da classe super Pessoa
            //pessoaDentroFor é minha constante criada dentro do for
            //pessoas é do ArrayList<>
            pessoaDentroFor.seApresentar();
        }

    }
}
