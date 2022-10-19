package poo;
import java.time.LocalDate;

public class Cliente {
    int id; //PUBLIC POR PADRAO
   private String nome; //ATRIBUTO PRIVADO
   private String sobrenome; //ATRIBUTO PRIVADO
    LocalDate dataNascimento; //ATRIBUTO PRIVADO
    public double altura;
   private double peso;

    Cliente (int id, String nome, String sobrenome, LocalDate dataNascimento, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public void crescer(){
        this.altura += 0.2;
    }

    public String  getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    //se o peso inserido entrar no if, eu digo que o novo peso é 50 senao, eu printo o else
    public void setPeso(double novoPeso){
        if(novoPeso > 0 && novoPeso < 20){
            this.peso =novoPeso;
        }
        else {
            System.out.println("Altura inválida. Atributo não modificado");
        }
    }



}

