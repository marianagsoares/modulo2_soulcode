package poo;

//Intuito: testar o uso da classe pessoa

public class pessoaTeste {
    public static void main (String[] args){ // main pra testar a classe pessoa
       // Pessoa cliente = new Pessoa();
        // cliente.nome  = "José";
        // cliente.sobrenome = "Ferreira";
        // cliente.idade = 15;
        // cliente.altura = 1.64;
       //  cliente.dizOla();

       // Pessoa cliente2 = new Pessoa();
      // Pessoa cliente3 = new Pessoa();
       //System.out.println(cliente2.nome);
       //cliente2 é um objeto e pessoa é o construtor
       //System.out.println(cliente3.idade);
       //cliente3 é um objeto e pessoa é o construtor

        //----------FORMA CORRETA-----------//

        Pessoa cliente4 = new Pessoa("Pedro", "Ferreira", 15, 1.64, 80.64);
        //Pessoa é meu construtor, cliente4 é minha variável
        cliente4.dizOla();

        Pessoa recemNascido = new Pessoa("Enzo", "Ferreira");
        recemNascido.dizOla();


        //EM mostrarIMC ele nao tem nenhum retorno pra me entregar
        //Somente printa o valor que foi calculado no metodo calculaImc()
        cliente4.mostrarImc();

        //PEGUE OS VALORES QUE ESTÃO DENTRO DE CLIENTE4 ATRIBUA-OS AO METODO CalculaImc();
        //ARMAZENE o valor EM VARIAVEL imcCliente4.
        //PRINT NA TELA O VALOR QUE ESTA DENTRO DA VARIAVEL imcCliente4.
        double imcCliente4 = cliente4.calculaImc();
        System.out.println(imcCliente4);


    }
}
