package poo.escola;
//Import e o nome do package onde a classe de fora estiver se estiver em outro package

public class Aluno extends pessoa {

    private double media;
    //media so esta na classe aluno

    public Aluno(String nome, String email, String cpf, double media) {
        //chamada do construtor pessoa que herda da classe super pessoa deve vir primeiro
        super(nome, email, cpf); //chamando um construtor pessoa

        this.media = media;
    }

    @Override
    void seApresentar(){
        super.seApresentar(); //metodo  que vem da super que é classe pess
        System.out.print("Sou um aluno com média " + this.media + "\n");
    }

    //getter pela valor sem alterar
    //Criei o método do meu atributo media
    double getMedia(){
        return this.media;
    }

}
