package exercicios.metodosEClasses;

public class testeSalario {
    public static void main (String[] args){
        //SALARIO AQUI É MEU CONSTRUTOR
        Salario empregado1 = new Salario("Pedro", "Ferreira", 1200);
        System.out.println(empregado1.nome);
        System.out.println(empregado1.sobrenome);
        System.out.print(empregado1.salarioMensal);


        Salario empregado2 = new Salario("Vicente", "Costa", 1300);
        System.out.println(empregado2.nome);
        System.out.println(empregado2.salarioMensal);

        //-----------CALCULAR SALARIO------------

        //ELE PEGOU 1300 E MULTIPLICOU POR 12
        //PEGUE OS VALORES QUE ESTAO DENTRO DE EMPREGADO2 ATRIBUA-OS
        //AO METODO CALCULARSALARIOANUAL E ARMAZENE DENTRO DE RESULTADO1
        double resultado1 = empregado2.calcularSalarioAnual();
        //IMPRIMA NA TELA RESULTADO1
        System.out.println(resultado1);


        //PEGO O METODO CALCULOSALARIOANUAL
        empregado1.calculoSalarialAnual();



        //--------------AUMENTAR SALARIO-------------

        double resultado2 = empregado1.aumentarSalario();
        System.out.println(resultado2);


        empregado2.aumentarSalario();

        //---------------CONCATENAR VARIAVEIS-------------------

        String nomeESobrenome = empregado2.nomeCompleto(empregado2.nome, empregado2.sobrenome);
        System.out.print(nomeESobrenome);
    }
}
