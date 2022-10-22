package exercicios.herancasEInterfaces;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bichinho {
    private String nome;
    private int idade;
    private double peso;
    private ArrayList<Comida> bucho;
    private boolean dormindo;


    //CONSTRUTOR
    public Bichinho(String nome, int idade, double peso) {
        //so adiciono como parametro o que nao foi inicializado no construtor
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.bucho = new ArrayList(); //array bucho comecou vazio
        this.dormindo = false; //dormindo começou falso // esta acordado
    }


    //METODOS ESPECIAIS GET PARA CADA PROPRIEDADE/ATRIBUTO

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }


    //comer método
    //Comida é  o tipo do parâmtro
    //comidaGatinho parâmetro
    public void comer(Comida comidaGatinho){
        System.out.println(bucho);
        System.out.println(bucho.contains(comidaGatinho.getNome()));

        if(this.dormindo){
            System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzz");
        }
        else{
            if(this.bucho.contains(comidaGatinho)){
                System.out.println("Ja comi " + comidaGatinho.getNome());
            }
            else{
                this.bucho.add(comidaGatinho);
                this.peso += comidaGatinho.getPeso();
            }
        }
    }

    //Para ele engordar dormindo precisa estar dormindo

    public void dormir(int horas){
        this.dormindo = true;
        double porcentagemPeso= this.peso * 0.01;
        double kgperdidos = horas * porcentagemPeso;
        this.peso -= kgperdidos;
    }

    //Acordar o bichinho
    public  void acordar(){

        this.dormindo = false;
    }

    public ArrayList<Comida> getBucho() {
        return bucho;
    }

    public boolean isDormindo() {
        return dormindo;
    }

}
