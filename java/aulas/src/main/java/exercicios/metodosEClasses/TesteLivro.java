package exercicios.metodosEClasses;

public class TesteLivro {
    public static void main(String[] args){


          Livro livro1 = new Livro ("A HISTORIA DO PROGRAMADOR", "Fernando Simas", 70);
          Livro livro2 = new Livro ("A HISTORIA DO FULANO", "Pedro Simas", 90);
          Livro livro3 = new Livro ("A HISTORIA DO PROFESSOR", "Carlos Simas", 100);


        //-----USO GET -----------//

        System.out.println(livro1.getNome());


        //-----USO SET -----------//

        //System.out.println(livro1.nome); //VAI DAR ERRO POIS ATRIBUTO ESTA PRIVADO
        livro1.setPreco(50);

    }
}
