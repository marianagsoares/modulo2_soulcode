package exercicios.metodosEClasses;

public class TesteAutor {

    public static void main (String[] args){
        //-----------AUTORES-------------------------//

        Autor autor1 = new Autor("Ricardo", "rs@gmail.com");
        Autor autor2 = new Autor("JOAO", "js@gmail.com");
        Autor autor3 = new Autor("CARLA", "carlacarla@gmail.com");



        //------------------ALTEREI NOME RICARDO PARA FELIPE---------------//
        System.out.println(autor1.nome);

        String novoautor1 = autor1.alterarNome("Felipe");
        System.out.println(novoautor1);




        //----------ALTEREI EMAIL js@gmail.com PARA jjj@gmail.com ------------------//
        System.out.println(autor2.email);

        String novoEmailAutor2 = autor2.alterarEmail("jjj@gmail.com");
        System.out.println(novoEmailAutor2);



        //---------------ALTEREI EMAIL CARLA PARA JOSEFA-------------------------------//
        //-------------ALTEREI carlacarla@gmail.com PARA CARLINHA@gmail.com------------//
        System.out.println(autor3.email);
        System.out.println(autor3.nome);

        String novoEmailAutor3 = autor3.alterarEmail("CARLINHA@gmail.com");
        System.out.println(novoEmailAutor3);  //TROCA EMAIL

        String novoAutor3 = autor3.alterarNome("JOSEFA");
        System.out.println(novoAutor3); //TROCA NOME



    }
}
