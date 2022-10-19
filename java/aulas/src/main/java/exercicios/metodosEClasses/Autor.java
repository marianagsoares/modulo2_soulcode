package exercicios.metodosEClasses;

public class Autor {
    String nome;
    String email;

    Autor (String nomeAutor, String email){
        this.nome= nomeAutor; //nomeAutor será chamado em "testeAutor" e será armazenado no atributo nome da classe
        this.email = email;
    }

    //METODOS

    String alterarNome(String novoNome){
       this.nome = novoNome;
       return (novoNome);
       //Atraves do método alterarNome a propriedade "nome" da classe "Autor" seja alterada
        // novoNome será o novo valor passado que será armazenado na propriedade "nome"
    }

    String alterarEmail(String novoEmail){
        this.email = novoEmail;
        return (novoEmail);
    }
}
