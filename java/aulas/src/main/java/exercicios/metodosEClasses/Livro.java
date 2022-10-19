package exercicios.metodosEClasses;

public class Livro {
    private String nome;
    String autor;
    private double preco;


//--------CONSTRUTOR------------------//

    Livro (String nome, String autor, double preco){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;

    }
        //-----METODO GET -----------//

        String getNome() {
            return this.nome;
        }


        //-----METODO SET -----------//

        String diaSemana = "sabado";

        void setPreco(double precoPromocao){
            if(diaSemana.equals("sabado")){
                System.out.println("preço anterior " + this.preco);
                this.preco = precoPromocao;
                System.out.println("Hoje é dia de promoção " + this.preco);
            }
            else {
                System.out.println("Hoje não é dia de promocao!");
            }
        }

    }