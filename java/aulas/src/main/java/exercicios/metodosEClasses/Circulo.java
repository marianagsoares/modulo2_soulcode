package exercicios.metodosEClasses;


//--------------CLASSE------------------//

public class Circulo {
     private String cor;
    private double raio;






    //------------CONSTRUTORES--------------//

    Circulo (String cor, double pRaio){
        this.raio = pRaio;
        this.cor = cor;

    }

    Circulo (String cor){ //SÓ PASSO COMO PARÂMETRO O QUE EU ESPERO DO USUARIO
        this.raio =1;
        this.cor = cor;
    }







    //-----------METODOS------------------//

    double pi = 3.14;
    double calcularArea(){
        //pi * (raio * raio)
        double areaCirculo = pi * Math.pow(this.raio, 2);
        return areaCirculo;

    }

    double calcularCircunferencia(){
       //2 * pi * raio
        double circunferencia = 2 * pi * this.raio;
        return circunferencia;
    }

    void mudarRaio(double novoRaio){
        this.raio = novoRaio;
    }












    //--------------TESTE NA MAIN--------------------//

    public static void main(String[] args){

        Circulo circulo1 = new Circulo("branco", 5);
        Circulo circulo2 = new Circulo("preto");


        //CIRCULO1 FAZ REFERENCIA AO PRIMEIRO CONSTRUTOR
        double area = circulo1.calcularArea();
        System.out.println(area);



        //CIRCULO2 FAZ REFERENCIA AO SEGUNDO CONSTRUTOR//
    }

}
