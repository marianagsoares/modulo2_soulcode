package poo.escola;

public class pessoa {
    private String nome;
    private String email;
    private String cpf;

    //Construtor
    public  pessoa (String nome, String email, String cpf){
        this.nome = nome;
        this.email = nome;
        this.email = email;
        this.cpf= cpf;
    }

    //Método
    void seApresentar()
    {
        System.out.println("Olá, me chamo " + this.nome + " Meu CPF é " + this.cpf);
    }

    //Métodos especiais getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
