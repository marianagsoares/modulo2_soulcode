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

    @Override
    void comer(String comida)
    {
        if(comida.equals(this.comidaFavorita)){
            super.comer(comida);
            this.setPeso(super.getPeso()+2);
        }
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
