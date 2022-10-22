package poo.exercicios.classes;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscEstadual;

    PessoaJuridica (String nome, String endereco, String telefone, String cnpj, String inscEstadual){
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }
    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    @Override

    public void exibirDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Telefone" + this.getTelefone());
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Insc. Estadual: " + this.inscEstadual);
    }
}


