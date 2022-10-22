package poo.exercicios.classes;

public class PessoaFisica extends Pessoa{

    private String cpf;
    private String rg;


    PessoaFisica(String nome, String endereco, String telefone,  String cpf, String rg){
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    //NOME VEM DA SUPERCLASSE PESSOA ENTAO EU SO CONSIGO PEGAR NOME AQUI ATRAVES DO GET
    public void exibirDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Telefone" + this.getTelefone());
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
    }
}
