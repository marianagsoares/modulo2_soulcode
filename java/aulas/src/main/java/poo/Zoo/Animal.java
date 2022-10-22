package poo.Zoo;

//Na interface no JAVA só consegue inserir a assinatura dos métodos
//Nao se insere o conteúdo dos métodos aqui
public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);
}


//TUDO QUE GATO FAZ A INTERFACE ANIMAL TAMBEM TEM QUE FAZER

    //-------------classe gato implemente a interface Animal---------------//
class gato implements Animal{
    @Override
    public void dormir(){
        System.out.print("ZZZZZZZZZZZZ\n");
    }

    @Override
    public void fazerSom(){
        System.out.printf("MIAAAAAU\n");
    }

    @Override
    public void comer (String comida) {
        if(comida.equals("peixe")){

            System.out.printf("ADORO PEIXE\n");
        }
        else  {
            System.out.printf("NAO QUERO\n");
        }
    }
}

    //-------------classe galinha implemente a interface Animal-----------//

class galinha implements Animal{
    @Override
    public void dormir(){
        System.out.print("COOOOOOOOOOOOOO\n");
    }

    @Override
    public void fazerSom(){
        System.out.printf("CO CO CO CO CO CO\n");
    }

    @Override
    public void comer (String comida) {
        System.out.println("Eu adoro comer " + comida);
    }

    public void botarOvo (boolean ovo) {
        if (ovo == true ){
            System.out.println("Colocou ovo");
        }
        else{
            System.out.println("Não colocou ovo");
        }
    }


    //TESTANDO OS OBJETOS NA MAIN//

    public static void main (String[] args){

        gato gato1 = new gato();
        gato1.dormir();
        gato1.fazerSom();
        gato1.comer("peixe");

        System.out.println("=======================\n");

        galinha galinha1 = new galinha();
        galinha1.dormir();
        galinha1.fazerSom();
        galinha1.comer("Milho");
        System.out.println(galinha1); //REFERENCIA NA MEMORIA


        System.out.println("============POLIMORFISMO============\n");

        //Galinha
        galinha animalGalinha = new galinha();
        System.out.println(animalGalinha); //REFERENCIA NA MEMORIA

        animalGalinha.dormir();
        animalGalinha.fazerSom();
        animalGalinha.comer("Milho");
        animalGalinha.botarOvo(false); //METODO INTERNO DA CLASSE GALINHA

        System.out.println("=======================\n");

        //Gato
        gato animalGatinho = gato1;
        animalGatinho.dormir();
        animalGatinho.fazerSom();
        animalGatinho.comer("Osso");

    }

}
