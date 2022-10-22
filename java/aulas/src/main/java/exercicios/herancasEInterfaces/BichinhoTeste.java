package exercicios.herancasEInterfaces;

public class BichinhoTeste {

    public static void main(String[] args){
        Bichinho bichinho1 = new Bichinho("CAT", 2, 3.5);
        Comida comida1 = new  Comida ("peixe", 5);

        System.out.println(bichinho1.getPeso());
        bichinho1.comer(comida1);

        System.out.println(bichinho1.getPeso());
        bichinho1.comer(comida1);

        System.out.println(bichinho1.getPeso());


    }
}
