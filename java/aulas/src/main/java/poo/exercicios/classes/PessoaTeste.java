package poo.exercicios.classes;

import java.util.ArrayList;

public class PessoaTeste {

    public static void main(String[] args){

        //POLIMORFISMO
        Pessoa pessoaFisica1 = new PessoaFisica("Gabiriela","Rua Fernandes Braga", "(51) 9999-8555","74447457", "9556-444");
        Pessoa pessoaFisica2 = new PessoaFisica("joana","Rua Lima Ferreira", "(51) 9999-8555","74447457", "9556-444");
        Pessoa pessoaJuridica1 = new PessoaJuridica("Kelly", "Rua dos afogados", "(78) 9918-4457", "1123215", "9855");

        //APENAS INICIALIZEI A CLASSE PESSOA
        Pessoa pessoa1 = new Pessoa ("Henrique", "Rua Capixaba", "98885844");


        ArrayList<Pessoa> clientes = new ArrayList<>();
        clientes.add(pessoaFisica1);
        clientes.add(pessoaFisica2);
        clientes.add(pessoaJuridica1);
        clientes.add(pessoa1);



        //Pessoa superclasse
        //cliente é quem percorre o array
        //clientes é o array
        for (Pessoa cliente : clientes){
            cliente.exibirDados();
            System.out.println("=========================================================");
        }
    }
}
