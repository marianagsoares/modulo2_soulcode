package exercicios.metodosEClasses;

public class Cachorro extends pet { //CLASSE CACHORRO HERDA OS ATRIBUTOS DA CLASSE PET
    private String comidaFavorita;
    private String raca;

    Cachorro (String nome, int idade, double peso, String comidaCachorro, String racaCachorro){

        //nome idade e peso foram herdadas da superclasse pet e esta superclasse deve ser chamada primeiro//
        super (nome, idade, peso);
        this.comidaFavorita = comidaCachorro;
        this.raca = racaCachorro;
    }


    //MAIN PARA TESTAR A RELACAO DE HERANCA//

    public static void main(String[] args){

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

    @Override
    void comer(String comida)
    {
        System.out.println("racao");
    }

    @Override
    void fazerSom()
    {
        System.out.println("AU AU AU");
    }

    @Override
    void brincar(String brinquedo)
    {

        System.out.println("-----------------------------------------------");
        super.brincar("sandalia"); //ESTOU BRINCANDO COM SANDALIA
        this.fazerSom(); //FAZER SOM DESTA CLASSE AU AU
        System.out.println("-----------------------------------------------");
    }

}
