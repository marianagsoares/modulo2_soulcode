package poo;

public class CarroTeste {
    public static void main(String[] args){
        Carro carro1 = new Carro("X", "Ferrari", 2019, true, 4, 50);

        System.out.println(carro1.combustivelAtual);
        //Começou com combustivel inicial 0
        carro1.abastecer(5);
        //adicionou 5L de combustivel
        System.out.println(carro1.combustivelAtual);
        //combustivel atual passou a ser 5

        boolean viajou = carro1.viajar("fortaleza", 300);
        System.out.print(viajou);

    }
}
