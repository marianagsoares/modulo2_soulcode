package poo.biblioteca;

/**
 * Crie uma classe Autor que possui:
 * Atributos: nome, email;
 * Construtores:
 * - Cria autores com base nos parâmetros nome e email;
 * Métodos:
 * - alteraNome(String novoNome) => muda o nome atual do autor
 * - alteraEmail(String novoEmail) => muda o email atual do autor
 */
public class Autor {
    private String nome;
    private String email;

    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Livro escreverLivro(String nome, double preco) {
        Livro novoLivro = new Livro(nome, this, preco);
        return novoLivro;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}