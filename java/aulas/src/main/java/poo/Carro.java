package poo;

//MINHA CLASSE
public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehFlex;
    int qtPortas;
    double combustivelAtual;

    double consumo;

    boolean estaLigado;

//MEU CONSTRUTOR

    Carro(String modelo, String marca, int ano, boolean ehFlex, int qtPortas, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.qtPortas = qtPortas;
        this.consumo = consumo;
        this.estaLigado = false; //todos os carros começam desligados
    }

    // Abastecer
    void abastecer(double litrosCombustivelPInserir) {
        this.combustivelAtual += litrosCombustivelPInserir;
    }

    //Ligar
    void ligar(){
        this.estaLigado = true;
    }

    //Desligado
    void  desligado(){
        this.estaLigado = false;
    }

    //Viajar
    boolean viajar(String local, double distancia){
        if (!this.estaLigado){ //lembre esta ligado começou em false lá na classe
            this.ligar();
        }

       //Calcula quantos litros serão necessários para a viagem

       double totalLitrosPrecisa = distancia / this.consumo;

       if(this.combustivelAtual - totalLitrosPrecisa > 0) {
           this.consumo -= totalLitrosPrecisa;
           //tirei agora o valor que eu  usei na viagem
           return true;
       }
       else {
           System.out.printf("A viagem para %s não foi possível pois a distancia é de %f e você possui um combustivel atual de %f ", local, distancia, this.combustivelAtual);
           return false;
       }
    }
}