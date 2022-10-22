package poo.escola;

public class Professor extends pessoa {
    private String formacao;

    public Professor(String nome, String email, String cpf, String formacao) {
        super(nome, email, cpf);
        this.formacao = formacao;
    }

    @Override
    void seApresentar(){
        super.seApresentar();
        System.out.print("Eu sou um professor com formação " + this.formacao + "\n");

    }

    //Criei o método do meu atributo formacao
    String getFormacao(){
        return  this.formacao;
    }
}
