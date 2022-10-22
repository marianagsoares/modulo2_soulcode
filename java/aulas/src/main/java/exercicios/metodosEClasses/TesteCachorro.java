package exercicios.metodosEClasses;

public class TesteCachorro {
    public static void main(String[] args){

        //MAIN PARA TESTAR A RELACAO DE HERANCA//

        //UTILIZOU A CLASSE PET PARA ATRIBUIR VALORES AOS ATRIBUTOS

        pet pet1 = new pet("Fred", 5, 25);
        pet1.dormir();
        pet1.comer("carne\n");
        pet1.fazerSom();
        pet1.brincar("bolinha");



        System.out.println("\n---------------OBJETO CACHORRO----------------------");

        //UTILIZOU A CLASSE CACHORRO PARA ATRIBUIR VALORES AOS ATRIBUTOS
        //CACHORRO SE EXTENDE DE PET, VAI TER ATRIBUTOS DE PET MAS OS ATRIBUTOS QUE EU ADD A PROPRIA CLASSE

        Cachorro teste = new Cachorro("REX", 5, 25, "osso", "caramelo");

        teste.dormir();
        teste.comer("Chocolate"); //em pet coloquei parametro String comida
        teste.fazerSom();
        teste.brincar("ursinho");
        teste.getPeso(); // pegue 25
        teste.setPeso(80); // mude para 80
        teste.getPeso(); //pegue 80

    }

}
